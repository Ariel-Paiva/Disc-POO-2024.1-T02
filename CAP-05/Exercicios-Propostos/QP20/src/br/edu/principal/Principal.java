package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		byte exit = 0;
		
		System.out.println("Média aritmética e ponderada.");
		do {
			System.out.println("Menu de escolhas (digite o número correspondente a cada opção):"+"\n1. Média aritmética \n2. Média ponderada \n3. Sair");
			exit = sc.nextByte();
			
			if (exit == 1) {
				System.out.println("Média aritmética \nDigite o valor da primeira nota.");
				double n1 = sc.nextDouble();
				System.out.println("Digite o valor da segunda nota.");
				double n2 = sc.nextDouble();
				
				double ma = (n1 + n2)/2;
				System.out.println("A média aritmética obtida foi: "+comma.format(ma));
			} else if (exit == 2) {
				System.out.println("Média ponderada \nDigite o valor da primeira nota.");
				double n11 = sc.nextDouble();
				System.out.println("Digite o peso da primeira nota.");
				byte p1 = sc.nextByte();
				
				System.out.println("Digite o valor da segunda nota.");
				double n22 = sc.nextDouble();
				System.out.println("Digite o peso da segunda nota.");
				byte p2 = sc.nextByte();
				
				System.out.println("Digite o valor da terceira nota.");
				double n33 = sc.nextDouble();
				System.out.println("Digite o peso da terceira nota.");
				byte p3 = sc.nextByte();
				
				double mp = ((p1 * n11) + (p2 * n22) + (p3 * n33))/(p1 + p2 + p3);
				System.out.println("A média ponderada obtida foi: "+comma.format(mp));
			} else if (exit == 3) {
				continue;
			} else {
				System.out.println("Opção inválida.");
			}
			
		} while (exit != 3);
		
		System.out.println("O programa foi finalizado com sucesso.");
	}

}
