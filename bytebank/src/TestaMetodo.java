
public class TestaMetodo {
		
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.saldo);
		double n = 1000;
		boolean conseguiuRetirar = contaDoPaulo.saca(n);
		System.out.println("Dinheiro Retirado: " + conseguiuRetirar);
		System.out.println("Valor Total " + contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Valor Total " + contaDaMarcela.saldo);
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println("Valor Total " + contaDaMarcela.saldo);
		System.out.println("Valor Total " + contaDoPaulo.saldo);
		
		
	}
	
}
