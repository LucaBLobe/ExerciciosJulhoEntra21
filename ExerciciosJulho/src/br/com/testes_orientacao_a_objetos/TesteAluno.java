package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Aluno;

public class TesteAluno {
	
	public static void main(String[] args) {

	
	Aluno a1 = new Aluno();
	Aluno a2 = new Aluno();
	
	a1.setNome("Lucas Murta");
	a2.setNome("Lucas Daniel");
	
	a1.setDtnascimento("11/01/1993");
	a2.setDtnascimento("12/02/1996");
			
	a1.setRg(654425142);
	a2.setRg(54147887);		
	
	System.out.println("nome: "+ a1.getNome());
	System.out.println("rg: "+ a1.getRg());
	System.out.println("data nacimento: "+ a1.getDtnascimento());
	
	System.out.println("nome: "+ a2.getNome());
	System.out.println("rg: "+ a2.getRg());
	System.out.println("data nacimento: "+ a2.getDtnascimento());
	
}

}
