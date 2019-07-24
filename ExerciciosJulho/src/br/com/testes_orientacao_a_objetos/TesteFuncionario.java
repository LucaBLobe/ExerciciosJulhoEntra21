package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "joao das massas";
		f2.nome = "joao das Neves";
		f1.salFuncionario = 1200.0;
		f1.ConsultaDados();
		f2.salFuncionario = 1500.0;
		
		System.out.println("");
		f1.AumentaSalario(500);
		f1.ConsultaDados();
		f2.ConsultaDados();
		
		System.out.println("");
		System.out.println("Numero: " + f1.nome);
		System.out.println("Salário: " + f1.salFuncionario);
		
		System.out.println("Numero: " + f2.nome);
		System.out.println("Salário: " + f2.salFuncionario);
		
	}

}
