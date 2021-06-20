package exercicios;

public class exercicio2 {
	
	public static void main(String[] args) {
		//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
		//números 4, 5 e 6. A soma das duas médias. A média das médias.
		
		int media1, media2, mediaDasMedias;
		
		media1 = (8+9+7)/3;
		media2 = (4+5+6)/3;
		mediaDasMedias = (media1+media2)/2;
		System.out.println("A media de 8, 9 e 7 é: " + media1);
		System.out.println("A media de 4, 5 e 6 é: " + media2);
		System.out.println("A soma das medias é: " + (media1+media2));
		System.out.println("A media das medias é: " + mediaDasMedias);
		
	
	}
	
	
	
}
