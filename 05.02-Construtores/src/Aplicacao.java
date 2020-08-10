
public class Aplicacao {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		double area1 = r1.cacularArea();
		
		System.out.println(area1);
		
		Retangulo r2 = new Retangulo(7,6);
		double area2 = r2.cacularArea();
		System.out.println(area2);
		
		Quadrado q = new Quadrado(6);
		System.out.println(q.calcularArea());
	}
}
