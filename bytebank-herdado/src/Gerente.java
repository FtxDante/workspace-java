//Gerente é um FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
//	public Gerente(String nome, String cpf, double salario) {
//		super(nome, cpf, salario);
//		// TODO Auto-generated constructor stub
//	}
	
	private int senha;
	
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente ");
		return super.getSalario();
	}


	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}

	
	
}
