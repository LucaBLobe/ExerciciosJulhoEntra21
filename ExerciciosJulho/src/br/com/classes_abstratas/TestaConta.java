package br.com.classes_abstratas;

import br.com.orientacao_a_objetos.Conta;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(null);
		Conta c2 = new Conta(null);
		
		c1.setNumero(10001);
		c1.setSaldo(1000);
		c1.setLimite(1500);

		
		System.out.println("Numero: " + c1.getNumero());
		System.out.print("saldo: "+c1.mostrarSaldo()+"\n");
		System.out.println("limite: " + c1.getLimite());
		
		
	}

}
