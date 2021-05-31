
//Gerente é um FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {
		
//	public Gerente(String nome, String cpf, double salario) {
//		super(nome, cpf, salario);
//		// TODO Auto-generated constructor stub
//	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente ");
		return super.getSalario();
	}
	
	
}
