
public class Aplicacao {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		
		//System.out.println(s1 == s2); // false
		//System.out.println(s3 == s2); // true
		
		//System.out.println(s1.equals(s2)); // true
		//System.out.println(s3.equals(s3)); // true
		
		String s4 = s2.toUpperCase();
		System.out.println(s4);
		
		s3.concat("def");
		System.out.println(s3);
	}
}
