package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Turma;

public class TesteTurma {
	
	public static void main(String[] args) {
		
		Turma tu1 = new Turma();
		Turma tu2 = new Turma();
	
		tu1.periodo = "noturno";
		tu2.periodo = "matutino";
		tu1.serie = "segunda";
		tu2.serie = "terceira";
		tu1.sigla = "102";
		tu2.sigla = "103";
		tu1.tipo = "regular";
		tu2.tipo = "extra";

		System.out.println("Periodo: " + tu1.periodo);
		System.out.println("Serie: " + tu1.serie);
		System.out.println("Sigla: " + tu1.sigla);
		System.out.println("Tipo: " + tu1.tipo + "\n");

		System.out.println("Periodo: " + tu2.periodo);
		System.out.println("Serie: " + tu2.serie);
		System.out.println("Sigla: " + tu2.sigla);
		System.out.println("Tipo: " + tu2.tipo);

		
	}

}
