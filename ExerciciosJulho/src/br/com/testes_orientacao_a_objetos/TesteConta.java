package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.numero = 10001;
		c2.numero = 10002;
		c1.saldo = 1000;
		c2.saldo = 2000;
		c1.limite = 1500;
		c2.limite = 3000;
		
		System.out.println("Numero: " + c1.numero);
		System.out.println("saldo: "+c1.saldo);
		System.out.println("limite: " + c1.limite+"\n");
		System.out.println("Numero: " + c1.numero);
		System.out.print("saldo: "+c1.saldo+"\n");
		System.out.println("limite: " + c1.limite);
		

	}

}
