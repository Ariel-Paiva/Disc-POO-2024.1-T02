package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num1,num2,num3,num4;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros em ordem crescente: ");
		
		num1 = escaneador.nextDouble();
		num2 = escaneador.nextDouble();
		num3 = escaneador.nextDouble();
		
		System.out.println("Digite um n�mero (fora de ordem):");
		
		num4 = escaneador.nextDouble();
		
		if (num4 > num3) {
			System.out.println("A ordem decrescente �: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
		} else if (num4 > num2 && num4 < num3) {
			System.out.println("A ordem decrescente �: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
		} else if (num4 > num1 && num4 < num2) {
			System.out.println("A ordem decrescente �: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
		} else if (num4 < num1) {
			System.out.println("A ordem decrescente �: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
		}
		
	}

}
