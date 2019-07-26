package br.com.interfaces;

public class TesteConta {
	
	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaPoupanca poupa1 = new ContaPoupanca();
		
		conta1.setNumero(15205);
		conta1.depositar(100.0);
		
		poupa1.setNumero(2525);
		poupa1.depositar(1000.0);
		
		System.out.println("Numero: "+conta1.getNumero());
		System.out.println("saldo: "+conta1.getSaldo());
		System.out.println("");
		System.out.println("Numero: "+poupa1.getNumero());
		System.out.println("saldo: "+poupa1	.getSaldo());
		
	}

}
