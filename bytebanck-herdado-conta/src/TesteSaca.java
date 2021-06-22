
public class TesteSaca {

	public static void main(String[] args){
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
		conta.saca(210);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Exece��o: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());

	}

}
