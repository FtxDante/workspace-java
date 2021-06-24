package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.especial.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		// TODO Auto-generated method stub
		
		ContaEspecial ce = new ContaEspecial(123,5555);
		ce.getSaldo();
		//FQN Full Qualified Name.
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		System.out.println("Cc: " + cc.getSaldo());
		System.out.println("Cp: " + cp.getSaldo());
		System.out.println("Contas Abertas: " + Conta.getTotal());
	}

}
