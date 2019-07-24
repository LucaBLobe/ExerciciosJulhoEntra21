package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 =  new Gerente();
		g1.nome = "Luandrea";
		g1.salario = 1500.0;
		System.out.println("salario: "+g1.salario);
		g1.aumentarSalario();
		System.out.println("salario: "+g1.salario);
		g1.aumentarSalario(25);
		System.out.println("salario: "+g1.salario);

	}

}
