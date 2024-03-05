package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner (System.in);
		double sal_carlos, sal_joao;
		int meses;
		System.out.println("Digite o salário do Carlos.");
		sal_carlos = escaneador.nextDouble();
		sal_joao = sal_carlos / 3;
		meses = 0;
		while (sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos *2 / 100);
			sal_joao = sal_joao+(sal_joao * 5 / 100);
			meses += 1;
		}
		System.out.println("Meses necessários para João ultrapassar Carlos: " + meses);
	}

}
