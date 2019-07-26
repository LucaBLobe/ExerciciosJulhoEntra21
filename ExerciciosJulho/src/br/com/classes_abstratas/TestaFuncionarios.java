package br.com.classes_abstratas;

public class TestaFuncionarios {
	
	public static void main(String[] args) {
		Gerente fun = new Gerente();
		
		fun.setNome("Luca");
		fun.setSalFuncionario(1500);
		
		System.out.println("nome: "+fun.getNome());
		System.out.println("Salario: "+fun.getSalFuncionario());
		fun.bonificacao();
		System.out.println("Salario: "+fun.getSalFuncionario());
		
	}
	

}
