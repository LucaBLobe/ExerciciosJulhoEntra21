package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.CartaoDeCredito;
import br.com.orientacao_a_objetos.Cliente;

public class TesteClienteCartaoDeCredito {
	
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();

		cl1.nomeCliente = "Joao da Cunha";
		cl1.codigoCliente = 1234;
		CartaoDeCredito cartaoCl1 = new CartaoDeCredito();
		cartaoCl1.cliente = cl1;
		cartaoCl1.dataValidade = "04/26";
		cartaoCl1.numeroCartao = 55554446;

		cl2.nomeCliente = "Marilia Mendonca";
		cl2.codigoCliente = 2345;
		CartaoDeCredito cartaoCl2 = new CartaoDeCredito();
		cartaoCl2.cliente = cl2;
		cartaoCl2.dataValidade = "06/22";
		cartaoCl2.numeroCartao = 56654346;

		System.out.println("nome: " + cl1.nomeCliente);
		System.out.println("codigo: " + cl1.codigoCliente);
		System.out.println("nome no cartao: " + cartaoCl1.cliente.nomeCliente + "\n");

		System.out.println("nome: " + cl2.nomeCliente);
		System.out.println("codigo: " + cl2.codigoCliente);
		System.out.println("nome no cartao: " + cartaoCl2.cliente.nomeCliente + "\n");
		
	}

}
