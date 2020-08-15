package plantier.jogodaforca.utils;

public class RandomUtils {

	/**
	 * O valor m�ximo que pode ser gerado ser� max-1. 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int gerarNumeroRandomico(int min, int max) {
		int intervalo = max - min;
		return (int) (Math.random() * intervalo) + min;
	}
	
}