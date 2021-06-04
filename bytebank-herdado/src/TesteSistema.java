
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autenticavel g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Autenticavel fa = new Administrador();
		fa.setSenha(2222);
		si.autentica(fa);
		
	}

}
