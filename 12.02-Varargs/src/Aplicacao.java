
public class Aplicacao {

	public static void main(String[] args) {
		imprimir("a");
		imprimir("a", "b");
		imprimir("a", "b", "c");
		imprimir();
		
		String[] array = {"a","b","c"};
		imprimir(array);
	}
	
	public static void imprimir(String... textos) {
		
		for(String s: textos) {
			System.out.print(s+" ");
		}
		System.out.println();
		
	}
}
