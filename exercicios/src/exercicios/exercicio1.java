package exercicios;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		// Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		//mostre-a expressa em dias. Leve em considera��o o ano com 365 dias e o m�s com 30.
		//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, soma;
		System.out.println("Quantos anos voc� tem?");
		anos = ler.nextInt();
		System.out.println("Quantos meses voc� tem?");
		meses = ler.nextInt();
		System.out.println("Quantos dias voc� tem?");
		dias = ler.nextInt();
		soma = anos*365 + meses*30 + dias;
		
		
		System.out.println("Voc� tem: "+ soma +" dias");
		
	}
	
}	
