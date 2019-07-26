package br.com.Static;

import br.com.orientacao_a_objetos.Funcionario;

public class Telefonista extends Funcionario {

	private String codEstacaoTrabalho;

	public String getCodEstacaoTrabalho() {
		return codEstacaoTrabalho;
	}

	public void setCodEstacaoTrabalho(String codEstacaoTrabalho) {
		this.codEstacaoTrabalho = codEstacaoTrabalho;
	}

	public void mostraDadosTelefonista() {
		System.out.println("nome: " + super.getNome() + ";" + "\n" + "Salario: " + super.getSalFuncionario() + ";"
				+ "\n" + "Vale Refeição: R$" + super.getValRefeicaoDia() + ";" + "\n"
				+ "codigo de extação de Trabalho: " + codEstacaoTrabalho + ";" + "\n"+
				"Bonificação: R$"+bonificacao()+"\n");
	}

}
