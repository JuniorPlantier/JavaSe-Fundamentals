
public class Caminhao extends Veiculo {

	public Caminhao(String marca) {
		super(marca);
	}

	public Caminhao() {
		super("Caminh�o");
	}
	
	@Override
	public void buzinar() {
		System.out.println("FOM FOM");
	}
}
