import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {
	
	// Polimorfismo na API de IO.
	
	public static void main(String[] args) throws IOException {
	
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(fin, fout);
		
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		OutputStream cout = System.out;
//		transfer(fin, cout);

//		InputStream cin = System.in;
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(cin, fout);

		
		
		//fin.close();
		//cout.close();
	}
	
	private static void transfer(InputStream in, OutputStream out) throws IOException  {
		
		byte[] buffer = new byte[1024];
		
		int bytesLidos;
		while((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
