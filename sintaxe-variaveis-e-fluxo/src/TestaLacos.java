
public class TestaLacos {
		
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <=10; multiplicador++) {
			System.out.println("---------------");
			for (int numero = 0; numero <= 10; numero++) {
				System.out.println(multiplicador + " x " + numero + " = " + numero*multiplicador);
			}
			System.out.println("---------------");
		}
	}
	
}
