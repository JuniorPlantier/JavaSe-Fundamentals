
public interface Automovel {

	void virarEsquerda();
	void virarDireta();
	
	public void acelerar();
	public void frear();
	
	default void derrapar() {
		acelerar();
		acelerar();
		frear();
	};
	
	// pertence a interface e não objetos que implementaram a interface
	static int getVelocidadeMaxima() {
		return 300;
	}
	
}
