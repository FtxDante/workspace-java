package exercicios;

import java.util.Scanner;

/** 
 * <hr>
 * <article style="background:linear-gradient(45deg,aqua 10%, aquamarine); padding: 1rem; border-radius:10px; border:1px solid black;">
 * <h2 style="font-weight:bold; font-size:1.5em; margin:0;">Como responder:</h2>
 * Sua <em style="font-weight:bold;">idade</em> em anos deve ser seu ultimo aniversário <br>
 * Seus <em style="font-weight:bold;">meses</em> devem ser em que mês você está agora <br>
 * Seus <em style="font-weight:bold;">dias</em> devem ser o dia de hoje (Espresso em números). <br>
 * </article>
 * 
 *  	@author Dante Rodrigues
 */

public class exercicio1 {
	
	public static void main(String[] args) {
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
		//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

		
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, soma;
		System.out.println("Quantos anos você tem?");
		anos = ler.nextInt();
		System.out.println("Quantos meses você tem?");
		meses = ler.nextInt();
		System.out.println("Quantos dias você tem?");
		dias = ler.nextInt();
		
		soma = anos*365 + meses*30 + dias;
		
		
		System.out.println("Você tem: "+ soma +" dias");
		
	}
	
}	
