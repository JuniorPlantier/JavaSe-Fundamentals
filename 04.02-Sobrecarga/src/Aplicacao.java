
public class Aplicacao {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		var x1 = m.somar(1,2,3);
		System.out.println(x1);
		
		var x2 = m.somar(4,5);
		System.out.println(x2);
		
		var x3 = m.somar(5.0, 20); // Cast implícito
		System.out.println(x3);
	}
}
