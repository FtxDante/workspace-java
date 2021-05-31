
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente g = new Gerente();
		g.setSenha(2322);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		FuncionarioAutenticavel fa = new Administrador();
		fa.setSenha(2222);
		si.autentica(fa);
		
	}

}
