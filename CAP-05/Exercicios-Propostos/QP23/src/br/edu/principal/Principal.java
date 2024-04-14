package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int escolha = 0;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		while (escolha != 4) {
			System.out.println("\nMenu de opções:\n1. Novo salário\n2. Férias\n3. Décimo terceiro\n4. Sair\nDigite a opção desejada: ");
			
			escolha = sc.nextInt();
			
			System.out.println("");
			
			if (escolha == 1) {
				double salario, novoSal = 0;
				
				System.out.println("Qual o salário atual?");
				salario = sc.nextDouble();
				
				if (salario < 210) {
					novoSal = salario + ((15./100.) * salario);
				} else if (salario >= 210 && salario <= 600) {
					novoSal = salario + ((10./100.) * salario);
				} else if (salario > 600) {
					novoSal = salario + ((5./100.) * salario);
				}
				
				System.out.println("Seu novo salário será: R$" + df.format(novoSal));
			} else if (escolha == 2) {
				double salario, ferias = 0;
				
				System.out.println("Qual o salário atual?");
				salario = sc.nextDouble();
				
				ferias = salario + ((1./3.) * salario);
				
				System.out.println("Valor das férias: R$" + df.format(ferias));
			} else if (escolha == 3) {
				double salario, decterc = 0;
				int meses;
				
				System.out.println("Qual o salário atual?");
				salario = sc.nextDouble();
				
				System.out.println("Quantos meses trabalhados?");
				meses = sc.nextInt();
				
				if (meses > 12) {
					System.out.println("O máximo de meses trabalhados são 12 meses.");
				} else {
					decterc = (salario * meses) / 12;
					
					System.out.println("Seu décimo terceiro será de: R$" + df.format(decterc));
				}
				
			} else if (escolha != 4) {
				System.out.println("Opção inválida.");
			}
		}
	}

}
