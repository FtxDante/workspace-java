package exercicios;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		// Informar um saldo e imprimir o saldo com reajuste de 1%.
		Scanner ler = new Scanner(System.in);
		
		double saldo, novoSaldo;
		System.out.println("Informe o seu saldo: ");
		saldo = ler.nextDouble();
		novoSaldo = saldo + (saldo*1)/100;
		System.out.println(saldo);
		System.out.println(novoSaldo);
	}

}
