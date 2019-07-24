package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Aluno;
import br.com.orientacao_a_objetos.Turma;

public class TesteAlunoTurma {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Turma t1 = new Turma();
		
		a1.nome = "Zequinha";
		a1.rg = 84511663;
		a1.dtnascimento = "11/05/1995";
		
		t1.periodo = "matutino";
		t1.serie = "1º";
		t1.sigla = "101";
		t1.tipo = "regular";
		
		a1.turma = t1;
		
		System.out.println("Aluno: "+a1.nome);
		System.out.println("Aluno rg: "+a1.rg);
		System.out.println("Data de nascimento: "+a1.dtnascimento);
		System.out.println("Periodo: "+a1.turma.periodo);
		System.out.println("Serie: "+a1.turma.serie);
		System.out.println("Sigla Turma: "+a1.turma.sigla);
		System.out.println("Tipo Turma: "+a1.turma.tipo);
	
	}

}
