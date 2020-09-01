
public class Aplicacao {

	/*
	 * Apareceu no Java a partir do Java 13.
	 * 
	 * O TextBlocks, permite criar strings em bloco.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		String html = 
//				"<html>\n" + 
//				 " <body>\n" +
//					"  <h1> texto qualquer </h1>\n" +
//				 " </body>\n" +
//				"</html>";
		
		String html2 = """
					   <html>
					     <body>
					      <h1> texto qualquer </h1>
					     </body>
					   </html>
					   """;
		
		System.out.println(html2);
	}
}
