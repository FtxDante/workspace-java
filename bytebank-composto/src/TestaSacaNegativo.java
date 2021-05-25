
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(1002);
		System.out.println(conta.saca(101));
		conta.saca(92);
		
		System.out.println(conta.getSaldo());
	}
}
