package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Aluno;
import br.com.orientacao_a_objetos.Turma;

public class TesteAlunoTurma {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Turma t1 = new Turma();
		
		a1.setNome("Zequinha");
		a1.setRg(84511663);
		a1.setDtnascimento("11/05/1995");
		
		t1.setPeriodo("matutino");
		t1.setSerie("1º");
		t1.setSigla("101");
		t1.setTipo("regular");
		
		a1.setTurma(t1);
		
		System.out.println("Aluno: "+a1.getNome());
		System.out.println("Aluno rg: "+a1.getRg());
		System.out.println("Data de nascimento: "+a1.getDtnascimento());
		System.out.println("Periodo: "+a1.getTurma().getPeriodo());
		System.out.println("Serie: "+a1.getTurma().getSerie());
		System.out.println("Sigla Turma: "+a1.getTurma().getSigla());
		System.out.println("Tipo Turma: "+a1.getTurma().getTipo());
	
	}

}
