package br.com.orientacao_a_objetos;

public class Gerente {

	private String nome;
	private double salario;
	
	public void aumentarSalario(){
		this.salario += (this.salario*0.1);
	}
	
	public void aumentarSalario(double taxa){
		this.salario += this.salario*taxa/100;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
