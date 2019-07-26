package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public class ContaPoupanca implements IConta{

	private int numero;
	private double saldo;
	
	
	@Override
	public int getNumero() {
		return numero;
	}

	@Override
	public void setNumero(int numero) {
		this.numero = numero;
		
	}

	@Override
	public double getSaldo() {
		
		return saldo;
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}

	@Override
	public void transferencia(Conta recebe, double valor) {
		this.saldo -= valor;
		recebe.setSaldo(recebe.getSaldo() + valor);
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public String extrato() {
		
		return null;
	}

	@Override
	public double mostrarSaldo() {
		
		return saldo;
	}
	

}
