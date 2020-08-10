
public class Jeep implements Carro, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Jeep virou à esquerda");
	}

	@Override
	public void virarDireta() {
		System.out.println("Jeep virou à direta");
	}

	@Override
	public void acelerar() {
		System.out.println("Jeep acelerou");
	}

	@Override
	public void abrirPorta() {
		System.out.println("Jeep abriu a porta");
	}

	@Override
	public double getPreco() {
		return 120000;
	}

}
