package br.com.classes_abstratas;

public class TestaConta {
	
	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		
		c1.setNumero(10001);
		c1.setSaldo(1000);
		c1.setLimite(1500);

		
		System.out.println("Numero: " + c1.getNumero());
		System.out.print("saldo: "+c1.getSaldo()+"\n");
		System.out.println("limite: " + c1.getLimite());
		System.out.println("");
		c1.imprimeExtratoDetalhado();
		
	}

}
