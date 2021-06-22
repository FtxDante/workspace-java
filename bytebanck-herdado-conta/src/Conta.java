
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
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
		}
			this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	this.saca(valor);
	destino.deposita(valor);
		
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�mero n�o permitido");
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