
public class ContaCorrente extends Conta {

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override//anotação da configuração.
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
}
