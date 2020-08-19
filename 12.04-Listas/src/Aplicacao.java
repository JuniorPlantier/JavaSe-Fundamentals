import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("abc"); 
		l.add("def");
		//l.set(0, "ghi"); // substitui
		l.add(0, "ghi");
		
		for(String s: l) {
			System.out.println(s);
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Iterator<String> ite = l.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
