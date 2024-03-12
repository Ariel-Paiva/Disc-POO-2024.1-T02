package br.edu.principal;

import java.util.Scanner;

/*
 * Questão 10 - Exercícios resolvidos
 * Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo usuário. Cada data deve ser composta por três valores inteiros, em que o primeiro representa o dia, o segundo, o mês e o terceiro, o ano.
 */

public class Principal {

	public static void main(String[] args) {
		int d1, m1, a1, d2, m2, a2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira data");
		System.out.println("dia (dd): ");
		d1 = scan.nextInt();
		System.out.println("mês (mm): ");
		m1 = scan.nextInt();
		System.out.println("ano (aaaa): ");
		a1 = scan.nextInt();
		
		System.out.println("Digite a segunda data");
		System.out.println("dia (dd): ");
		d2 = scan.nextInt();
		System.out.println("mês (mm): ");
		m2 = scan.nextInt();
		System.out.println("ano (aaaa): ");
		a2 = scan.nextInt();
		
		if (a1 > a2) {
			System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
		} else if (a2 > a1) {
			System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
		} else if (m1 > m2) {
			System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
		} else if (m2 > m1) {
			System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
		} else if (d1 > d2) {
			System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
		} else if (d2 > d1) {
			System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
		} else {
			System.out.println("As datas são iguais!");
		}
		
	}

}
