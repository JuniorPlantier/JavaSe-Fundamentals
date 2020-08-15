package plantier.jogodaforca.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import plantier.jogodaforca.CaractereInvalidoException;
import plantier.jogodaforca.JogoDaForcaException;

public class ConsoleUtils {

	public static char lerLetra() throws JogoDaForcaException {
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			String linha = reader.readLine();
			
			if(linha.trim().isEmpty()) {
				throw new CaractereInvalidoException("Nenhuma letra foi digitada");
			}
			
			if(linha.length() > 1) {
				throw new CaractereInvalidoException("Apenas uma letra deve ser digitada");
			}
			
			char letra = linha.toUpperCase().charAt(0);
			
			if(!Character.isLetter(letra))
				throw new CaractereInvalidoException("Apenas uma letra deve ser digitada");
			
			return letra;
			
		} catch (IOException e) {
			throw new JogoDaForcaException("Problema ao ler caractere do teclado", e);
		}
	}
}
