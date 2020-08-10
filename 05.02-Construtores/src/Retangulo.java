
public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo() {
		//System.out.println("Construtor ()");
		this(4, 3);
		//this.largura = 3;
		//this.altura = 4;
	}
	
	public Retangulo(double largura, double altura) {
		//System.out.println("Construtor (double v1, double v2)");
		this.largura = largura;
		this.altura = altura;
	}
	
	public double cacularArea() {
		return largura * altura;
	}
}
