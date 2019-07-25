package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Cliente;
import br.com.util.Teclado;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		cl1.setNomeCliente("João da Silva");
		cl1.setCodigoCliente(1234);
		
		cl2.setNomeCliente("Luana lumier");
		cl2.setCodigoCliente(4321);
		
		System.out.println("nome: "+ cl1.getNomeCliente());
		System.out.println("codigoe: "+ cl1.getCodigoCliente());
		
		System.out.println("nome: "+ cl2.getNomeCliente());
		System.out.println("codigoe: "+ cl2.getCodigoCliente());
		
		
	}

}
