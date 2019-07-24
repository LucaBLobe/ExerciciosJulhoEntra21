package br.com.orientacao_a_objetos;

public class Gerente {

	public String nome;
	public double salario;
	
	public void aumentarSalario(){
		this.salario += (this.salario*0.1);
	}
	
	public void aumentarSalario(double taxa){
		this.salario += this.salario*taxa/100;
	}

	
}
