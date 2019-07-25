package br.com.orientacao_a_objetos;

public class Funcionario {
	
	public String nome;
	public double salFuncionario = 1000.0;
	
	
	public void AumentaSalario(double valor) {
		salFuncionario += valor;
		
	}
	public void ConsultaDados() {
		System.out.println("Nome Funcionario: "+nome);
		System.out.println("Nome Funcionario: "+salFuncionario);
	}


}
