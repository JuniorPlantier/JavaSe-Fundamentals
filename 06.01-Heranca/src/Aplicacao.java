
public class Aplicacao {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		System.out.println("***** Carro ***** ***** ");
		c.setMarca("XYZ");
		c.setModelo("ABC");
		c.setAno(2020);
		c.setQuatroPortas(true);
		c.buzinar();
		c.imprimirDados();
		
		System.out.println("***** Motocicleta ***** ***** ");
		Motocicleta m = new Motocicleta();
		m.setMarca("TYR");
		m.setModelo("UYI");
		m.setAno(2020);
		m.imprimirDados();
		
		//Caminhao cam = new Caminhao();
		//cam.buzinar();
	}
}
