package br.com.classes_abstratas;

import br.com.classes_abstratas.Conta;;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.setNumero(10001);
		c1.setSaldo(1000);
		c1.setLimite(1500);

		
		System.out.println("Numero: " + c1.getNumero());
		System.out.print("saldo: "+c1.getSaldo()+"\n");
		System.out.println("limite: " + c1.getLimite());
		
		
	}

}
