package br.com.orientacao_a_objetos;

public class Funcionario {
	
	
	private String nome;
	private double salFuncionario = 1000.0;
	private double valRefeicaoDia = 12.5;
	
	
	public void setAumentaSalario(double valor) {
		salFuncionario += valor;
		
		
	}
	public void ConsultaDados() {
		System.out.println("Nome Funcionario: "+nome);
		System.out.println("Nome Funcionario: "+salFuncionario);
	}
	public void setAlteraValeRefeicao(double taxa) {
		this.valRefeicaoDia += valRefeicaoDia*(taxa/100);
	}
	public double bonificacao() {
		double bonificacao = this.salFuncionario*0.10;
		this.salFuncionario += bonificacao;
		return bonificacao;
	}
	
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
	public double getValRefeicaoDia() {
		return valRefeicaoDia;
	}
	public void setValRefeicaoDia(double valRefeicaoDia) {
		this.valRefeicaoDia = valRefeicaoDia;
	}
	public void mostraDados() {
		System.out.println("nome: "+ nome+";"+"\n"+
							"Salario: "+salFuncionario+";"+"\n"+
							"Vale Refeição: R$"+valRefeicaoDia+";"+"\n"+
							"Bonificação: R$"+bonificacao()+"\n");
		
	}
		



}
