
public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		 * Internamente a StringBuilder trabalha com um array de caracteres
		 * */
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < args.length; i++) {
			sb.append("X");
		}
		
		String s = sb.toString();
		
		System.out.println(s);
		
		System.out.println("A" + "B" + "C" + "D"); // internamente o compilador usa o StringBuilder
	}
}
