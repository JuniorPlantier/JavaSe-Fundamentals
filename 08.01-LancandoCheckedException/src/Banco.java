
public class Banco {

	public void realizarOperacao() {
		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(-100);
			System.out.println("Saque foi realizado com sucesso");
			
		} catch (SaldoInsuficienteException e1) {
			e1.printStackTrace();
			
		} catch (ValorNegativoException e1) {
			e1.printStackTrace();
			System.out.println("Você tentou sacar um valor negativo de " + e1.getValor());
			
		}
				
		System.out.println(c.getSaldo());
	}
	
}
