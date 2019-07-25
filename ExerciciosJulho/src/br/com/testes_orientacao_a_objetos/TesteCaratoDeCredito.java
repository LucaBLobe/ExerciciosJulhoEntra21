package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.CartaoDeCredito;

public class TesteCaratoDeCredito {
	
	public static void main(String[] args) {
		
		CartaoDeCredito ct1 = new CartaoDeCredito();
		CartaoDeCredito ct2 = new CartaoDeCredito();
		
		ct1.setNumeroCartao(55554444);
		ct1.setDataValidade("12/26");
		
		ct2.setNumeroCartao(66664444);
		ct2.setDataValidade("12/28");

		System.out.println("numero: " + ct1.getNumeroCartao());
		System.out.println("validade: " + ct1.getDataValidade() + "\n");

		System.out.println("numero: " + ct2.getNumeroCartao());
		System.out.println("validade: " + ct2.getDataValidade());

	}

}
