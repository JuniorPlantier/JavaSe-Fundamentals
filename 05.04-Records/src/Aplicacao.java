
public class Aplicacao {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		double area1 = r1.calcularArea();
		System.out.println(area1);
		
		Retangulo r2 = new Retangulo();
		System.out.println(r1.equals(r2));
		
		Retangulo r3 = Retangulo.create(10);
		System.out.println("Largura = " + r3.largura() + "; Altura: " + r3.altura());
		System.out.println(r3);
	}
}
