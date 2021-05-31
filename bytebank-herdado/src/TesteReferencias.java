
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NOME CPF SALARIO
		
		ControleBonificacao  controle = new ControleBonificacao();
		Gerente g1 = new Gerente();
		EditorVideo ev = new EditorVideo();
		Designer d = new Designer();
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
