package br.com.Static;

import br.com.orientacao_a_objetos.Funcionario;

public class Secretaria extends Funcionario {

	private int numRamal;

	public int getNumRamal() {
		return numRamal;
	}

	public void setNumRamal(int numRamal) {
		this.numRamal = numRamal;
	}

	public void mostraDadosSecretaria() {
		System.out.println("nome: " + super.getNome() + ";" + "\n" + "Salario: " + super.getSalFuncionario() + ";"
				+ "\n" + "Vale Refeição: R$" + super.getValRefeicaoDia() + ";" + "\n" +
				"Ramal: " + numRamal + ";" + "\n"+"Bonificação: R$"+bonificacao()+"\n");
	}

}
