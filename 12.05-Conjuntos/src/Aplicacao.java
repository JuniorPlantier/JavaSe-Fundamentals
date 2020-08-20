import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * São semelhantes as listas no entando não permitem elementos duplicados (equals() e hasCode()).
		 * Os elementos não índices.
		 */
		
		// Não tem uma ordem específica
		// Set<String> set = new HashSet<>();
		
		// A ordem de inserção é a ordem do retorno
		// Set<String> set = new LinkedHashSet<>();
		
		// Conjunto ordenado com critério
		Set<String> set = new TreeSet<>();
		set.add("E2");
		set.add("B5");
		set.add("A7");
		set.add("C6");
		set.add("D1");
		set.add("G9");
		set.add("F8");
		set.add("G9");
		set.add("G9");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
