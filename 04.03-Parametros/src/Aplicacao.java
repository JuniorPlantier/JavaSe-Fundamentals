/*
 * Passagem de par�metros no Java
 * Como as informa��es ficam armazenadas na mem�ria?
 * 
 * O Java s� permite a passagem de par�metro por copia.
 * 
 * No Java n�o existe passagem por refer�ncia(ponteiro), continua sendo uma copia.
 */

public class Aplicacao {

	public static void main(String[] args) {
		
		Operacao o = new Operacao();
		
//		int x = 10;
//		o.trocar(x);
//		System.out.println(x);
		
		Valor valor = new Valor();
		valor.v=10;
		o.alterarValor(valor);
		System.out.println(valor.v);

	}
}
