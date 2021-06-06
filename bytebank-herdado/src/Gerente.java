//Gerente é um FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
//	public Gerente(String nome, String cpf, double salario) {
//		super(nome, cpf, salario);
//		// TODO Auto-generated constructor stub
//	}
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente ");
		return super.getSalario();
	}


	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
		
	}

	
	
}
