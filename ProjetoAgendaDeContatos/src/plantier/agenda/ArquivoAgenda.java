package plantier.agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que manipula o arquivo onde os registros ficarão armazenados
 * @author junior
 *
 *
 */
public class ArquivoAgenda {

	private static final String ARQUIVO_AGENDA = "agenda.txt";
	
	/*
	 * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
	 * */
	public void gravar(Collection<Contato> contatos) throws IOException {
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(ARQUIVO_AGENDA);
			
			for (Contato contato : contatos) {
				writer.print(contato.getNome());
				writer.print(',');
				writer.print(contato.getTelefone());
			}
		} finally {
			if(writer != null) 
				writer.close();
		}
	}
	
	public List<Contato> ler() {
		
		List<Contato> contatos = new ArrayList<Contato>();
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File(ARQUIVO_AGENDA));
			while(scanner.hasNextLine()) {
				String contatoStr = scanner.nextLine();
				
				String[] tokens = contatoStr.split(",");
				
				Contato contato = new Contato(tokens[0], tokens[1]);
				contatos.add(contato);
			}
			
			return contatos;
			
		} catch (FileNotFoundException e) {
			// Se o arquivo de contatos não for encontrado, retorna a lista vazia
			return contatos;

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
