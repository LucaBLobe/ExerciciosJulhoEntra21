package br.com.orientacao_a_objetos;

public class Aluno {
	
	private String nome;
	private int rg;
	private String dtnascimento;
	private Turma turma;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getDtnascimento() {
		return dtnascimento;
	}
	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	

}
