import java.io.IOException;
import java.io.PrintWriter;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		
		String s = "texto para ser gravado no arquivo";
		
		// trabalhando com bytes
//		try (OutputStream os = new FileOutputStream("saida.txt")) {
//			byte[] buffer = s.getBytes();
//			
//			os.write(buffer);
//		}
		
		// trabalhando com strings num nível mais alto
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))) {
//			writer.write(s);
//		}
		
		// opção mais intuitiva
		try(PrintWriter pw = new PrintWriter("saida.txt")) {
			pw.println(s);
		}
	}
}
