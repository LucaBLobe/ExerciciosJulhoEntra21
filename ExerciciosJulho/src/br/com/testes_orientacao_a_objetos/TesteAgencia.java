package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Agencia;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia ramiro = new Agencia(0);
		Agencia centro = new Agencia(0);

		ramiro.setNumeroAgencia(15);
		centro.setNumeroAgencia(25);

		System.out.println("Agencia: " + ramiro.getNumeroAgencia() + "\n");
		System.out.println("Agencia: " + centro.getNumeroAgencia() + "\n");

	}

}
