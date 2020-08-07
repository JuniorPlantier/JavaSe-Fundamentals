
public class Aplicacao {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Baron Davis";
		p1.receber(5);
		p1.receber(7);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p1.dar(3, p2);
		
		System.out.println(p1.nome +" => "+p1.numFigurinhas);
		System.out.println(p2.nome +" => "+p2.numFigurinhas);
	}
}
