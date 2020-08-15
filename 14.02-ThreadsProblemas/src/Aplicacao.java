
public class Aplicacao {

	public static void main(String[] args) throws Exception {
		/*
		 * V�rias threads pordem compartilha o mesmo c�digo, o mesmo objeto e isso pode gerar v�rios problemas.
		 */
		
		MyThread[] threads = new MyThread[1000];
		
		Contador contador = new Contador();
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(contador);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			// faz com que a thread seja aguardada at� ser finalizar.
			threads[i].join();
		}
		
		System.out.println("Valor = " + contador.getValor());
	}
}
