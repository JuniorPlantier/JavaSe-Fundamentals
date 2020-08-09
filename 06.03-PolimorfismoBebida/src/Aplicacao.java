
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		
		LeiteQuente leite = new LeiteQuente();
		Suco suco = new Suco();
		
		preparador.prepararBebida(suco);
		
	}
}
