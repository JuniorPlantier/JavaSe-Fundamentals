package plantier.agenda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Representa a agenda de contatos
 */
public class Agenda {

	/**
	 * Map de contatos. A chave � o nome do contato e o valor � o pr�prio objeto Contato.
	 */
	private Map<String, Contato> contatosMap = new TreeMap<String, Contato>();
	
	/**
	 * Map que organiza os contatos por letras do alfabeto.
	 */
	private Map<Character, List<Contato>> contatosPorLetrasMap = new TreeMap<Character, List<Contato>>();
	
	/**
	 * Gerenciador do arquivo que cont�m os registros da agenda
	 */
	private ArquivoAgenda arquivo = new ArquivoAgenda();
	
	/**
	 * Construtor. Ao criar o objeto, os registros cadastrados no arquivo s�o lidos e adicionados � 
	 * agenda (caso existam)
	 * @throws IOException
	 */
	public Agenda() throws IOException {
		// Obt�m os registros cadastrados
		List<Contato> contatos = arquivo.ler();
		
		for (Contato contato : contatos) {
			try {
				inserir(contato);
				
			} catch (AgendaException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void inserir(Contato contato) throws AgendaException, IOException {
		contato.validarDados();
		
		String nome = contato.getNome();
		if (contatosMap.containsKey(nome)) {
			throw new AgendaException("O contato " + nome + " j� existe");
		}
		
		// Adiciona o contato ao map
		contatosMap.put(nome, contato);
		
		// Obt�m a letra inicial do nome do contato e adiciona o contato adequadamente na cole��o que organiza os contatos por letra inicial do nome
		char letraInicial = Character.toUpperCase(nome.charAt(0));
		List<Contato> contatosLetra = contatosPorLetrasMap.get(letraInicial);
		if (contatosLetra == null) {
			contatosLetra = new ArrayList<Contato>();
			contatosPorLetrasMap.put(letraInicial, contatosLetra);
		}
		contatosLetra.add(contato);
		
		// Depois de adicionar o contato nas cole��es, atualiza o arquivo
		arquivo.gravar(contatosMap.values());
	}
	
	public void excluir(String nome) throws AgendaException, IOException {
		verificarExistenciaContato(nome);
		
		Contato contato = obterContato(nome);
		
		contatosMap.remove(nome);
		
		// Remove o objeto da lista que est� dentro do Map de contatos por letras
		List<Contato> contatos = contatosPorLetrasMap.get(nome.toUpperCase().charAt(0));
		contatos.remove(contato);
		
		// Se depois da remo��o n�o sobrar nenhum contato com a letra do nome no Map, exclui o registro do Map
		if (contatos.size() == 0) {
			contatosPorLetrasMap.remove(nome.toUpperCase().charAt(0));
		}
		
		// Atualiza o arquivo de contatos
		arquivo.gravar(contatosMap.values());
	}
	
	public void alterar(Contato contato) throws AgendaException, IOException {
		contato.validarDados();
		
		// Verifica se o contato sendo alterado existe realmente (apenas o telefone do contato pode mudar)
		verificarExistenciaContato(contato.getNome());
		
		arquivo.gravar(contatosMap.values());
	}
	
	private void verificarExistenciaContato(String nome) throws AgendaException {
		if (!contatosMap.containsKey(nome)) {
			throw new AgendaException("Contato " + nome + " n�o encontrado");
		}
	}
	
	public List<Contato> listarContatosPorLetra(char letra) {
		List<Contato> contatos = contatosPorLetrasMap.get(Character.toUpperCase(letra));
		if (contatos == null) {
			return new ArrayList<Contato>();
		}
		return contatos;
	}
	
	public List<Contato> listarContatosPorParteNome(String parteNome) {
		// Procura por contatos que iniciam ou terminam por 0 ou mais caracteres e possuem, no meio, a string fornecida como par�metro
		String regex = "\\w*" + parteNome + "\\w*";
		
		// A flag CASE_INSENSITIVE garante que a compara��o � feita desconsiderando mai�sculas e min�sculas
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		List<Contato> contatosEncontrados = new ArrayList<Contato>();
		// O m�todo values() retorna os valores do map em forma de uma collection
		Collection<Contato> contatosCadastrados = contatosMap.values();
		
		// Itera sobre os contatos cadastrados procurando pelo padr�o fornecido e os adiciona na lista que ser� retornada
		for (Contato contato : contatosCadastrados) {
			Matcher m = p.matcher(contato.getNome());
			if (m.matches()) {
				contatosEncontrados.add(contato);
			}
		}
		
		return contatosEncontrados;
	}
	
	public Contato obterContato(String nome) {
		return contatosMap.get(nome);
	}
}