
public class ContaCorrente extends Conta {

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override//anota��o da configura��o.
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
}