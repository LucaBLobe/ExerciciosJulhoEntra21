package br.com.classes_abstratas;

public abstract class Conta {
	
	private int numero;
	private double saldo;
	private double limite = 100.0;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public abstract void imprimeExtratoDetalhado();


}
