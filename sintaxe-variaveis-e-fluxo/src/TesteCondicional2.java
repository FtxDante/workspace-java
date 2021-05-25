
public class TesteCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 51;
		int quantidade = 2;
		boolean acompanhado = quantidade >= 2;
		System.out.println("Está acompanhado: " + acompanhado);
		if (idade >= 18 || quantidade >= 2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}

}
