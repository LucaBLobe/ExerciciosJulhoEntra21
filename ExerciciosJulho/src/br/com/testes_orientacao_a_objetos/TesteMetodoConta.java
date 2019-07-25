package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Conta;

public class TesteMetodoConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(null);
		Conta c2 = new Conta(null);
		
		c1.setNumero(10001);
		c2.setNumero(10002);
		c1.setSaldo(1000);
		c2.setSaldo(2000);
		c1.setLimite(1500);
		c2.setLimite(3000);
		c1.depositar(125);
		c1.sacar(15);
		
		System.out.println("Numero: " + c1.getNumero());
		System.out.print("saldo: "+c1.mostrarSaldo()+"\n");
		System.out.println("limite: " + c1.getLimite());
		System.out.println(c1.extrato());
		System.out.println("ID conta: " + c1.getNumeroID()+"\n");
		
		System.out.println("Numero: " + c2.getNumero());
		System.out.print("saldo: "+c2.getSaldo()+"\n");
		System.out.println("limite: " + c2.getLimite());
		System.out.println("ID conta: " + c2.getNumeroID()+"\n");
		System.out.println("quantidade de contas: " + Conta.getContador()+"\n");
		c1.zeraContador();
		System.out.println("quantidade de contas: " + Conta.getContador()+"\n");

	}

}
