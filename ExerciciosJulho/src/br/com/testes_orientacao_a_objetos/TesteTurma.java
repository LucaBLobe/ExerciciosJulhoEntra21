package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Turma;

public class TesteTurma {
	
	public static void main(String[] args) {
		
		Turma tu1 = new Turma();
		Turma tu2 = new Turma();
	
		tu1.setPeriodo("noturno");
		tu2.setPeriodo("matutino");
		tu1.setSerie("segunda");
		tu2.setSerie("terceira");
		tu1.setSigla("102");
		tu2.setSigla("103");
		tu1.setTipo("regular");
		tu2.setTipo("extra");

		System.out.println("Periodo: " + tu1.getPeriodo());
		System.out.println("Serie: " + tu1.getSerie());
		System.out.println("Sigla: " + tu1.getSigla());
		System.out.println("Tipo: " + tu1.getTipo() + "\n");

		System.out.println("Periodo: " + tu2.getPeriodo());
		System.out.println("Serie: " + tu2.getSerie());
		System.out.println("Sigla: " + tu2.getSigla());
		System.out.println("Tipo: " + tu2.getTipo());

		
	}

}
