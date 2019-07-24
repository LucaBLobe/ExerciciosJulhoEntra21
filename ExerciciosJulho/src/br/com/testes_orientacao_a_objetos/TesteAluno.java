package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Aluno;

public class TesteAluno {
	
	public static void main(String[] args) {

	
	Aluno a1 = new Aluno();
	Aluno a2 = new Aluno();
	
	a1.nome = "Lucas Murta";
	a2.nome = "Lucas Daniel";
	
	a1.dtnascimento = "11/01/1993";
	a2.dtnascimento = "12/02/1996";
			
	a1.rg = 654425142;
	a2.rg = 54147887;		
	
	System.out.println("nome: "+ a1.nome);
	System.out.println("rg: "+ a1.rg);
	System.out.println("data nacimento: "+ a1.dtnascimento);
	
	System.out.println("nome: "+ a2.nome);
	System.out.println("rg: "+ a2.rg);
	System.out.println("data nacimento: "+ a2.dtnascimento);
	
}

}
