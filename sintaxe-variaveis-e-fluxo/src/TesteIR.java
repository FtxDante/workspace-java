
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900 && salario <= 2800) {

			System.out.println("Seu sal?rio ?: " + salario + ", o IR ? de 7.5% e pode deduzir na declara??o o valor de R$ 142");

		} else {
			if (salario <= 3751) {
				System.out.println("Seu sal?rio ?: " + salario +" ,o IR ? de 15% e pode deduzir R$ 350");
			} else {
				if (salario <= 4664) {
					System.out.println("Seu sal?rio ?: " + salario +", o IR ? de 22.5% e pode deduzir R$ 636");
				}
			}
		}
	}
}
