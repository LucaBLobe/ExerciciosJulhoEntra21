package br.com.classes_abstratas;

public abstract class Funcionarios {

	private String nome;
	private double salFuncionario = 1000.0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalFuncionario() {
		return salFuncionario;
	}

	public void setSalFuncionario(double salFuncionario) {
		this.salFuncionario = salFuncionario;
	}
	public abstract void bonificacao();
	
}
