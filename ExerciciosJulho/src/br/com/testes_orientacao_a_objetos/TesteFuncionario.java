package br.com.testes_orientacao_a_objetos;

import br.com.Static.Gerentes;
import br.com.Static.Secretaria;
import br.com.Static.Telefonista;
import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("joao das massas");
		f2.setNome("joao das Neves");
		f1.setSalFuncionario(1200.0);
		f2.setSalFuncionario(1500.0);
		f1.setAumentaSalario(500);
		f1.ConsultaDados();
		f2.ConsultaDados();
		System.out.println(f1.getValRefeicaoDia());
		f1.setAlteraValeRefeicao(-50.0);
	
		
		System.out.println("");
		System.out.println("Numero: " + f1.getNome());
		System.out.println("Salário: " + f1.getSalFuncionario());
		System.out.println(f1.getValRefeicaoDia());
		f1.setAlteraValeRefeicao(-50.0);
		System.out.println(f1.getValRefeicaoDia());
		
		System.out.println("Numero: " + f2.getNome());
		System.out.println("Salário: " + f2.getSalFuncionario());
		
		Telefonista tele1 = new Telefonista();
		Gerentes gere1 = new Gerentes();
		Secretaria secret1 = new Secretaria();
		
		gere1.setNome("Lui Appel");
		gere1.setSenha("mamão2019");
		gere1.setUsuario("Lui.apepel01");
		
		tele1.setNome("Luana Mara");
		tele1.setCodEstacaoTrabalho("D102");
		
		secret1.setNome("Nayra Rosa");
		secret1.setNumRamal(27);
		
		System.out.println("Nome:"+ gere1.getNome());
		System.out.println("Senha:"+ gere1.getSenha());
		System.out.println("Usuario:"+ gere1.getUsuario()+"\n");
		System.out.println("Nome:"+ tele1.getNome());
		System.out.println("Código estação de trabalho:"+ tele1.getCodEstacaoTrabalho()+"\n");
		System.out.println("Nome:"+ secret1.getNome());
		System.out.println("Numero Ramal:"+ secret1.getNumRamal()+"\n");
		
		System.out.println("Nome:"+secret1.getNome()+" Salario: "+ secret1.getSalFuncionario());
		secret1.bonificacao();
		System.out.println("Nome:"+secret1.getNome()+" Salario: "+ secret1.getSalFuncionario()+"\n");
		
		System.out.println("Nome:"+gere1.getNome()+" Salario: "+ gere1.getSalFuncionario());
		gere1.bonificacao(15);
		System.out.println("Nome:"+gere1.getNome()+" Salario: "+ gere1.getSalFuncionario()+"\n");
		
		f1.mostraDados();
		f2.mostraDados();
		tele1.mostraDadosTelefonista();
		gere1.mostraDadosGerente();
		secret1.mostraDadosSecretaria();
		
		
	}

}
