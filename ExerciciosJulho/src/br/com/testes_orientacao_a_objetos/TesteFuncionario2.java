package br.com.testes_orientacao_a_objetos;

import br.com.orientacao_a_objetos.Funcionario;
import br.com.util.Teclado;

public class TesteFuncionario2 {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		String opcao = "S";
		while (!(opcao.equalsIgnoreCase("n"))) {
			funcionario.nome = Teclado.lerTexto("Digite o nome do funcionario: ");
			funcionario.salFuncionario = Teclado.lerDouble("Digite seu salario: ");
			System.out.println("nome funcionario: " + funcionario.nome);
			System.out.println("salario funcionario funcionario: R$"+ funcionario.salFuncionario);
			opcao = Teclado.lerTexto("Dseja alterar o nome do usuario:(S/N) ");

		}

		
	}

}
