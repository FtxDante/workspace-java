package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		//String nome = new String("Alura");
		//String nomeCorreto = "Alura"; //Object Literal
		
		String nome = "Paulo";

		String nomeModificado = nome.replace('P', 'S');
		
		System.out.println(nomeModificado);
	}

}
