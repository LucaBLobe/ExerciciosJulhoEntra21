package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.CartaoDeCredito;
import br.com.orientacao_a_objetos.Cliente;

public class TesteClienteCartaoDeCredito {
	
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();

		cl1.setNomeCliente("Joao da Cunha");
		cl1.setCodigoCliente(1234);
		CartaoDeCredito cartaoCl1 = new CartaoDeCredito();
		cartaoCl1.setCliente(cl1);
		cartaoCl1.setDataValidade("04/26");
		cartaoCl1.setNumeroCartao(55554446);

		cl2.setNomeCliente("Marilia Mendonca");
		cl2.setCodigoCliente(2345);
		CartaoDeCredito cartaoCl2 = new CartaoDeCredito();
		cartaoCl2.setCliente(cl2);
		cartaoCl2.setDataValidade("06/22");
		cartaoCl2.setNumeroCartao(56654346);

		System.out.println("nome: " + cl1.getNomeCliente());
		System.out.println("codigo: " + cl1.getCodigoCliente());
		System.out.println("nome no cartao: " + cartaoCl1.getCliente().getNomeCliente() + "\n");

		System.out.println("nome: " + cl2.getNomeCliente());
		System.out.println("codigo: " + cl2.getCodigoCliente());
		System.out.println("nome no cartao: " + cartaoCl2.getCliente().getNomeCliente() + "\n");
		
	}

}
