package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int m, n, soma, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro positivo [m]: ");
		m = sc.nextInt();
		System.out.println("Digite um n�mero inteiro positivo [n]: ");
		n = sc.nextInt();
		
		while (m < n) {
			soma = 0;
			
			for (i = 0; i <= n; i++) {
				soma = soma + i;
			}
			
			System.out.println("Soma de todos os n�meros inteiros entre os pares [m,n]: " + soma);
			
			System.out.println("\nDigite um n�mero inteiro positivo [m]: ");
			m = sc.nextInt();
			System.out.println("Digite um n�mero inteiro positivo [n]: ");
			n = sc.nextInt();
		}
	}

}
