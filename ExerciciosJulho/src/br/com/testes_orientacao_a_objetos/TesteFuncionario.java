package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("joao das massas");
		f2.setNome("joao das Neves");
		f1.setSalFuncionario(1200.0);
		f2.setSalFuncionario(1500.0);
		f1.setAumentaSalario(500);
		f1.ConsultaDados();
		f2.ConsultaDados();
		System.out.println(f1.getValRefeicaoDia());
		f1.setAlteraValeRefeicao(-50.0);
	
		
		System.out.println("");
		System.out.println("Numero: " + f1.getNome());
		System.out.println("Salário: " + f1.getSalFuncionario());
		System.out.println(f1.getValRefeicaoDia());
		f1.setAlteraValeRefeicao(-50.0);
		System.out.println(f1.getValRefeicaoDia());
		
		System.out.println("Numero: " + f2.getNome());
		System.out.println("Salário: " + f2.getSalFuncionario());
		
	}

}
