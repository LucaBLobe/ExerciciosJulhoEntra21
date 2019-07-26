package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public interface IConta {
	public int getNumero();
	public void setNumero(int numero);
	
	public double getSaldo();
	public void setSaldo(double saldo);
	
	public void transferencia(Conta recebe, double valor);
	
	public void depositar(double valor);
	
	public void sacar(double valor);
	
	public String extrato();
	
	public double mostrarSaldo();
	

}
