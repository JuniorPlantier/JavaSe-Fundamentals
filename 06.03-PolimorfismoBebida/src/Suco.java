
public class Suco extends Bebida {

	public Suco() {
		super("Suco", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando o copo");
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o suco");
	}

}
