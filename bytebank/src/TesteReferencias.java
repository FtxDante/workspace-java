
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		System.out.println("saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("segunda conta " + segundaConta);

		System.out.println("primeira conta " + primeiraConta);

		if (primeiraConta == segundaConta) {
			System.out.println("� a mesma conta");
		}

	}
}
