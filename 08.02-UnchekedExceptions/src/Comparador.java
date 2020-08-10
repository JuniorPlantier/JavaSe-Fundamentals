
public class Comparador {

	public static boolean comparar(Object o1, Object o2) {
		if(o1 == null) {
			return false;
		}
		
		return o1.equals(o2);
	}
	
}
