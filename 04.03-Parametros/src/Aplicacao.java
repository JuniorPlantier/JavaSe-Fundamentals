/*
 * Passagem de parâmetros no Java
 * Como as informações ficam armazenadas na memória?
 * 
 * O Java só permite a passagem de parâmetro por copia.
 * 
 * No Java não existe passagem por referência(ponteiro), continua sendo uma copia.
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
