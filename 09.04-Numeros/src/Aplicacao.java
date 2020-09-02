import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		double d = 1145.4;
		
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println(nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getInstance(new Locale("en", "US"));
		System.out.println(nf2.format(d));
		
		// --
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		System.out.println(nf3.format(d));
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		System.out.println(nf4.format(d));
		
		// -- 

		DecimalFormat df1 = new DecimalFormat("00,000.00");
		df1.setGroupingUsed(true);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('-');
		df1.setDecimalFormatSymbols(dfs);
		System.out.println(df1.format(d));
	}
}
