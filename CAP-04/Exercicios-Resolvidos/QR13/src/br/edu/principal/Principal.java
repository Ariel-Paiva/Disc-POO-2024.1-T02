package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		
		System.out.println("Menu de escolhas(escolha/digite 1, 2 ou 3): "+"\n"+"1- Imposto."+"\n"+"2- Novo salário."+"\n"+"3- Classificação.");
		byte op = sc.nextByte();
		
		if (op == 1) {
			
			System.out.println("Digite o valor do salário recebido.");
			float sal = sc.nextFloat();
			float imp = 0f;
			
			if (sal < 500) {
				imp = (sal * 5)/100;
			} else if ((sal>=500) && (sal<=850)) {
				imp = (sal * 10)/100;
			} else if (sal > 850) {
				imp = (sal * 15)/100;
			}
			
			System.out.println("O valor do imposto a ser pago é: R$"+comma.format(imp));
		} else if (op == 2) {
			
			System.out.println("Digite o valor do salário recebido.");
			float sal = sc.nextFloat();
			float bonus = 0f;
			
			if (sal > 1500) {
				bonus = 25;
			} else if ((sal>=750) && (sal<=1500)) {
				bonus = 50;
			} else if ((sal>=450) && (sal<750)) {
				bonus = 75;
			} else if (sal<450) {
				bonus = 100;
			}
		    
			float sal2 = sal + bonus;
			System.out.println("O valor do novo salário será de: R$"+ comma.format(sal2));
		} else if (op == 3) {
			
			System.out.println("Digite o valor do salário recebido.");
			float sal = sc.nextFloat();
			
			if (sal<=700) {
				System.out.println("Mal remunerado.");
			} else if (sal>700) {
				System.out.println("Bem remunerado.");
			}
			
		} else {
			System.out.println("Opção inválida.");
		}
	}

}
