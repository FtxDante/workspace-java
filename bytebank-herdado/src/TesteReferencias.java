
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NOME CPF SALARIO
		
		ControleBonificacao  controle = new ControleBonificacao();
		Gerente g1 = new Gerente("Marcos","23214124-2", 5000.00);
		EditorVideo ev = new EditorVideo("Marcio", "41241241-3", 2500.00);
		Designer d = new Designer("Jennifer","0956341323-2",2000.00);
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
