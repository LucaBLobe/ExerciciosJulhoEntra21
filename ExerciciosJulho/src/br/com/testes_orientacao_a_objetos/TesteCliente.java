package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Cliente;
import br.com.util.Teclado;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		cl1.nomeCliente = "João da Silva";
		cl1.codigoCliente = 1234;
		
		cl2.nomeCliente = "Luana lumier";
		cl2.codigoCliente = 4321;
		
		System.out.println("nome: "+ cl1.nomeCliente);
		System.out.println("codigoe: "+ cl1.codigoCliente);
		
		System.out.println("nome: "+ cl2.nomeCliente);
		System.out.println("codigoe: "+ cl2.codigoCliente);
		
		
	}

}
