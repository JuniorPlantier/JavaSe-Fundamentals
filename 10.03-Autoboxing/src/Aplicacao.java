
public class Aplicacao {

	public static void main(String[] args) {
		
		Handler h = new Handler();
		
		//Integer i = Integer.valueOf(10);
		//h.setObj(i);
		
		//Integer i2 = (Integer) h.getObj();
		//int i3 = i2.intValue();
		
		// Faz a conversão no momento da compilação.
		//int i = 10;
		//h.setObj(i);
		
		//int i2 = (int) h.getObj();
		
		double d1 = somar(4, 6);
		
		Double d2 = Double.valueOf(65);
		Double d3 = 55.0;
		Double d4 = somar(d2, d3);
		
		// --
		Integer i = Integer.valueOf(5);
		int i2 = i.intValue();
		i2++;
		i = Integer.valueOf(i2);
		
		Integer i3 = 5;
		i3++;
		
	}
	
	private static double somar(double d1, double d2) {
		return d1 + d2;
	}
}
