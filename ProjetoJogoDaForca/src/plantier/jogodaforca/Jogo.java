package plantier.jogodaforca;

import java.util.HashSet;
import java.util.Set;

import plantier.jogodaforca.utils.ConsoleUtils;

public class Jogo {
	
	private static final int MAX_ERROS = 5;
	
	public void iniciar() throws JogoDaForcaException {
		
		Set<Character> letrasUsadas = new HashSet<Character>();
		int erros = 0;
		
		Dicionario dicionario = Dicionario.getInstance();
		Palavra palavra = dicionario.proximaPalavra();
		
		System.out.println("Bem vindo ao Jogo da Forca!");
		System.out.println("A palavra tem " + palavra.tamanho() + " letras");
		
		// Fica em loop
		while (true) {
			System.out.println(palavra);
			
			System.out.println();
			
			char letra;
			try {
				System.out.print("Digite uma letra: ");
				letra = ConsoleUtils.lerLetra();
				
				if (letrasUsadas.contains(letra)) {
					throw new CaractereInvalidoException("Esta letra já foi utilizada");
				}
				
				letrasUsadas.add(letra);
				
				if(palavra.possuiLetra(letra)) {
					System.out.println("Você acertou uma letra!");
				} else {
					erros++;
					
					if (erros < MAX_ERROS) {
						System.out.println("Você errou! Você ainda pode errar " + (MAX_ERROS - erros) + " vez(es)");
					}
				}
				
				System.out.println();
				
				if (palavra.acertouPalavra()) {
					System.out.println("Parabéns! Você acertou a palavra completa: " + palavra.getPalavraOriginal());
					System.out.println("Fim do Jogo!");
					break;
				}
				
				if (erros == MAX_ERROS) {
					System.out.println("Você perdeu o jogo! A palavra correta era " + palavra.getPalavraOriginal());
					System.out.println("Fim do Jogo!");
					break;
				}
				
			} catch (CaractereInvalidoException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}	
	}
}
