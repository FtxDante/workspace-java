
public class ExercicioMultiploDe3 {
	
	public static void main(String[] args) {
		System.out.println("Metódo 1");
		for(int contador = 1; contador <= 100; contador++) {
			if (contador % 3 == 0) {
				System.out.println(contador);
			}
		}

		System.out.println("Metódo 2");
		for (int contador = 0; contador <= 100; contador += 3) {
			if(contador != 0) {
				System.out.println(contador);
			}
		
		}
	}
	
}
