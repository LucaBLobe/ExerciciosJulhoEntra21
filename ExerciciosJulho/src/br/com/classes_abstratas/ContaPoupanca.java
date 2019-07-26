package br.com.classes_abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void imprimeExtratoDetalhado(){
		System.out.println("EXTRATO DETALHADO DE CONTA POUPANÇA");
		Date agora = new Date();
		System.out.println("DATA : " + data.format(agora));
		System.out.println("NÚMERO : " + this.getNumero());
		System.out.println("SALDO : " + this.getSaldo());
		System.out.println("LIMITE : " + this.getLimite());
		}
	
}
