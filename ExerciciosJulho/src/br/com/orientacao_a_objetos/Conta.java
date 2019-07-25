package br.com.orientacao_a_objetos;

public class Conta {
	
	private int numero;
	private double saldo;
	private double limite = 100.0;
	private Agencia agencia;
	private static int contador;
	private int numeroID;
	
	public Conta(Agencia agencia) {
		this.agencia = agencia;
		Conta.contador++; 
		this.numeroID = contador;
	}
	
	
	
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



	public Agencia getAgencia() {
		return agencia;
	}



	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}



	public int getNumeroID() {
		return numeroID;
	}



	public static int getContador() {
		return contador;
	}



	public static void setContador(int contador) {
		Conta.contador = contador;
	}



	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}


	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public double mostrarSaldo() {
		return saldo;
	}

	public String extrato() {
		return "Saldo: " + saldo + "\n" + "Limite: " + limite;

	}
	public void transferencia(Conta recebe, double valor) {
		this.saldo -= valor;
		recebe.saldo += valor;
	}
	public double zeraContador() {
		int qtConta = contador;
		contador = 0;
		return qtConta;
	}
	
}
