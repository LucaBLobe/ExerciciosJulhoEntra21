package br.com.orientacao_a_objetos;

public class Funcionario {
	
	public String nome;
	public double salFuncionario = 1000.0;
	public double valRefeicaoDia = 12.5;
	
	public void AumentaSalario(double valor) {
		salFuncionario += valor;
		
	}
	public void ConsultaDados() {
		System.out.println("Nome Funcionario: "+nome);
		System.out.println("Nome Funcionario: "+salFuncionario);
	}
	public void AlteraValeRefeicao(double taxa) {
		this.valRefeicaoDia += valRefeicaoDia*(taxa/100);
	}



}
