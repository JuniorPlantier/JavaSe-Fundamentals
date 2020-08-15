package plantier.jogodaforca;

import java.util.HashSet;
import java.util.Set;

public class Palavra {

	private static final char CARACTERE_SECRETO = '_';
	private String palavraOriginal;
	// armazena caracteres já encontrados
	private Set<Character> caracteresEncontrados = new HashSet<Character>();
	
	public Palavra(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// Converte a palavra em um array de caracteres
		char[] letrasArray = palavraOriginal.toCharArray();
		
		for (int i = 0; i < letrasArray.length; i++) {
			char c = letrasArray[i];
			
			if (caracteresEncontrados.contains(c)) {
				sb.append(c);
			} else {
				sb.append(CARACTERE_SECRETO);
			}
			
			sb.append(" ");
		}

		return sb.toString().trim();
	}
	
	public int tamanho() {
		return palavraOriginal.length();
	}
	
	/**
	 * Verifica se a letra fornecida existe na palavra
	 */
	public boolean possuiLetra(char letra) {
		
		if (palavraOriginal.indexOf(letra) > -1) { 
			caracteresEncontrados.add(letra);
			return true;
		}
		
		return false;
	}
	
	public boolean acertouPalavra() {
		char[] letrasArray = palavraOriginal.toCharArray();
		
		// Cria um conjunto para conter as letras (conjunto não permite elemento repetido)
		Set<Character> letras = new HashSet<Character>();
		
		for (int i = 0; i < letrasArray.length; i++) {
			letras.add(letrasArray[i]);
		}
		
		return letras.equals(caracteresEncontrados);
	}
	
	public String getPalavraOriginal() {
		return palavraOriginal;
	}
}
