package br.com.Static;

import br.com.orientacao_a_objetos.Funcionario;

public class Gerentes extends Funcionario {
	
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void bonificacao(double taxa) {
		double bonificacao = super.getSalFuncionario()*(taxa/100+1);
		super.setSalFuncionario(bonificacao);
		
	}	
	public void mostraDadosGerente() {
		System.out.println("nome: "+ super.getNome()+";"+"\n"+
							"Salario: "+super.getSalFuncionario()+";"+"\n"+
							"Vale Refeição: R$"+super.getValRefeicaoDia()+";"+"\n"+
							"Usuario: "+usuario+";"+"\n"+
							"Senha: "+senha+";"+"\n"+"Bonificação: R$"+bonificacao()+"\n");
							
		}

	
}
