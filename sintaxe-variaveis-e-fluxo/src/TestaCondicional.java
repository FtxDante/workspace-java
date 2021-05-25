
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 2;
		int quantidade = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");

		} else {
			if (quantidade >= 2) {
				System.out.println("Pode entrar pois está acompanhado");
			} else {
				System.out.println("Get out here!!!!!");
			}
		}
	}

}
