package br.com.classes_abstratas;

public class Gerente extends Funcionarios {

	@Override
	public void bonificacao() {
		this.setSalFuncionario(this.getSalFuncionario() * (1.10));

	}

}
