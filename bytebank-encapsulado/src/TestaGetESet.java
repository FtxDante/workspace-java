
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(132,12321);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		conta.getTitular().setProfissao("Desenvolvedor Web");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(Conta.getTotal());
		
	}
	
	
	
}
