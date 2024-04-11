package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		double peso;
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();
		
		int grupo = 0;
		
		if (idade < 20) {
			if (peso <= 60) {
				grupo = 9;
			} else if (peso > 60 && peso <= 90) {
				grupo = 8;
			} else if (peso > 90) {
				grupo = 7;
			}
		} else if (idade >= 20 && idade <= 50) {
			if (peso <= 60) {
				grupo = 6;
			} else if (peso > 60 && peso <= 90) {
				grupo = 5;
			} else if (peso > 90) {
				grupo = 4;
			}
		} else if (idade > 50) {
			if (peso <= 60) {
				grupo = 3;
			} else if (peso > 60 && peso <= 90) {
				grupo = 2;
			} else if (peso > 90) {
				grupo = 1;
			}
		}
		
		System.out.println("Você está no grupo de risco " + grupo + "!");

	}

}
