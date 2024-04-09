package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 0;
		double altura, media_alturas = 0.0, soma_alturas = 0.0;
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		do {
			System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
			idade = sc.nextInt();
			
			if(idade <= 0) {
				break;
			}
			
			System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
			altura = sc.nextDouble();
			
			if (idade > 50) {
				soma_alturas += altura;
			}
			
			i++;
		}  while (idade > 0);
		
		media_alturas = soma_alturas / (i + 1);
		System.out.println("Média das alturas das pessoas com mais de 50 anos: " + media_alturas);
	}

}
