package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.CartaoDeCredito;

public class TesteCaratoDeCredito {
	
	public static void main(String[] args) {
		
		CartaoDeCredito ct1 = new CartaoDeCredito();
		CartaoDeCredito ct2 = new CartaoDeCredito();
		
		ct1.numeroCartao = 55554444;
		ct1.dataValidade = "12/26";
		
		ct2.numeroCartao = 66664444;
		ct2.dataValidade = "12/28";

		System.out.println("numero: " + ct1.numeroCartao);
		System.out.println("validade: " + ct1.dataValidade + "\n");

		System.out.println("numero: " + ct2.numeroCartao);
		System.out.println("validade: " + ct2.dataValidade);

	}

}
