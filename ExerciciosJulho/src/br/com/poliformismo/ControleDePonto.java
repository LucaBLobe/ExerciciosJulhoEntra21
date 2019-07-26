package br.com.poliformismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");

	public void registraEntrada(FuncionarioBanco f) {
		Date agora = new Date();
		System.out.println("Entrada do Funcionario Código: " + f.getCodigo());
		System.out.println("Em : " + data.format(agora));
	}

	public void registraSaida(FuncionarioBanco f) {
		Date agora = new Date();
		System.out.println("Entrada do Funcionario Código: " + f.getCodigo());
		System.out.println("Em : " + data.format(agora));
	}
}