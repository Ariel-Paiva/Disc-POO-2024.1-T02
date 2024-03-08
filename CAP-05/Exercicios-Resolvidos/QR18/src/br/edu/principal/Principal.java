package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		double n, quad, cubo, raiz;
		
		System.out.println("Potenciação e raiz");
		
		while (true) {
			System.out.println("\nDigite um número(caso queira finalizar o programa, digite zero ou um número negativo).");
			n = sc.nextDouble();
			
			if (n <= 0) {
				System.out.println("O programa foi finalizado com sucesso.");
				break;
			}
			
			quad = n * n;
			cubo = Math.pow(n, 3);
			raiz = Math.sqrt(n);
			System.out.println("O quadrado, cubo e raiz de "+ comma.format(n)+" são, respectivamente: "+comma.format(quad)+" "+comma.format(cubo)+" "+comma.format(raiz));
			
		}
		
		
	}

}
