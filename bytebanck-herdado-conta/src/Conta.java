
public abstract class Conta {
		
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	public static int getTotal(){
	    return Conta.total;
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso");
			return true;
		}else {
			System.out.println("Dinheiro insuficiente");
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
			System.out.println("Dinheiro insuficiente, tranferência negada.");
			return false;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Número não permitido");
			return;
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			System.out.println("Agencia tem um valor negativo, tente novamente.");
			return;
		}
		
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}