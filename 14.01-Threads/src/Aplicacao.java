
public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		 * Quando você tem threads executando "simultaneamente" quem controla isso é o escalonador.
		 */
		//Contador c = new Contador();
		//c.start();
		
		Contador c2 = new Contador();
		Thread t = new Thread(c2);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
