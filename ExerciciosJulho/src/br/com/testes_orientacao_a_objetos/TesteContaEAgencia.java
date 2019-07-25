package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;

public class TesteContaEAgencia {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(null);
		Conta c2 = new Conta(null);
		Agencia agenciaNova = new Agencia(0);
		agenciaNova.setNumeroAgencia(15);

		c1.setNumero(10001);
		c2.setNumero(10002);
		c1.setSaldo(1000);
		c2.setSaldo(2000);
		c1.setLimite(1500);
		c2.setLimite(3000);
		c1.setAgencia(agenciaNova);
		c2.setAgencia(agenciaNova);

		System.out.println("Numero: " + c1.getNumero());
		System.out.println("saldo c1: " + c1.getSaldo());
		System.out.println("limite: " + c1.getLimite());
		System.out.println("Numero Agencia: " + c1.getAgencia().getNumeroAgencia() + "\n");

		System.out.println("Numero: " + c2.getNumero());
		System.out.println("saldo c2: " + c2.getSaldo());
		System.out.println("limite: " + c2.getLimite());
		System.out.println("Numero Agencia: " + c2.getAgencia().getNumeroAgencia());
		
		
	}

}
