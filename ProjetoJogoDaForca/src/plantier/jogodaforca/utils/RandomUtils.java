package plantier.jogodaforca.utils;

public class RandomUtils {

	/**
	 * O valor máximo que pode ser gerado será max-1. 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int gerarNumeroRandomico(int min, int max) {
		int intervalo = max - min;
		return (int) (Math.random() * intervalo) + min;
	}
	
}