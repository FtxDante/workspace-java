package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(100, 22);
		conta.deposita(10);
		System.out.println(conta);
		
	}
	
}
