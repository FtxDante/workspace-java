package exercicios;

public class exercicio2 {
	
	public static void main(String[] args) {
		//Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
		//n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
		
		int media1, media2, mediaDasMedias;
		
		media1 = (8+9+7)/3;
		media2 = (4+5+6)/3;
		mediaDasMedias = (media1+media2)/2;
		System.out.println("A media de 8, 9 e 7 �: " + media1);
		System.out.println("A media de 4, 5 e 6 �: " + media2);
		System.out.println("A soma das medias �: " + (media1+media2));
		System.out.println("A media das medias �: " + mediaDasMedias);
		
	
	}
	
	
	
}
