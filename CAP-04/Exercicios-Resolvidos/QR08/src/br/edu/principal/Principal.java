package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		
		System.out.println("MENU: Escolha entre(digite o número 1 ou 2): "+"\n"+"1- Somar dois números."+"\n"+"2- Raiz quadrada de um número.");
		byte op = sc.nextByte();
		
		if (op == 1) {
			System.out.println("Digite o primeiro número.");
			double n1 = sc.nextDouble();
			System.out.println("Digite o segundo número.");
			double n2 = sc.nextDouble();
			double sum = n1 + n2;
			
			System.out.println("O resultado da soma de "+ comma.format(n1)+" e "+comma.format(n2)+" é: "+comma.format(sum));
			
		} else if (op == 2) {
			System.out.println("Digite um valor.");
			double valor = sc.nextDouble();
			double raiz = Math.sqrt(valor);
			
			System.out.println("A raiz quadrada de "+comma.format(valor)+" é: "+comma.format(raiz));
			
		} else {
			System.out.println("Opção inválida.");
		}
		
	}

}
