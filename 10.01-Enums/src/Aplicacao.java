
public class Aplicacao {

	private enum Sexo {
		MASCULINO, FEMININO
	}
	
	public static void main(String[] args) {
		
		DiaDaSemana hoje = DiaDaSemana.DOMINGO;
		
		int num = DiaDaSemana.QUARTA.getValor();
		System.out.println(num);
		
		String s = "TERCA"; // "terca"; -> lança uma exceção.
		DiaDaSemana d = DiaDaSemana.valueOf(s);
		System.out.println(d.getValor());
		
		Sexo sexo = Sexo.MASCULINO;
	}
}
