package br.com.arrays;

import java.util.Arrays;

public class OrdenacaoArray {
	
	public static void main(String[] args) {
		int[] numeros = new int[] {959,185,85,45,88};
		
		Arrays.sort(numeros);
		
		for(int numero: numeros) {
			System.out.println(numero);
			
		}
	}

}
