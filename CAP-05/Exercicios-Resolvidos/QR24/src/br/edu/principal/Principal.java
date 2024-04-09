package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op;
		double sal, imp = 0.0, aum = 0.0, novo_sal = 0.0;
		Scanner sc = new Scanner(System.in);
		
		do {
		  System.out.println("MENU DE OPÇÕES");
		  System.out.println("1 - Imposto");
		  System.out.println("2 - Novo Salário");
		  System.out.println("3 - Classificação");
		  System.out.println("4 - Finalizar o programa");
	      System.out.println("Digite a opcão desejada: ");
		  op = sc.nextInt();
		  
		  if (op > 4 || op < 1) {
			  System.out.println("\nOpção inválida!\n");
		  } 
		  if (op == 1) {
			 System.out.println("Digite o salário do funcionário: ");
			 sal = sc.nextDouble();
			 if (sal < 500.0) {
				imp = sal * 5.0/100.0;
			 }
			 if (sal >= 500.0 && sal <= 850) {
				imp = sal * 10.0/100.0;
			 }
			 if (sal > 850.0) {
				 imp = sal * 15.0/100.0;
			 }
			 System.out.println("Valor do imposto: " + imp);
		  }
		  if (op == 2) {
			 System.out.println("Digite o salário do funcionário: ");
			 sal = sc.nextDouble();
			 
			 if (sal > 1500.0) {
				 aum = 25.0;
			 }
			 if (sal >= 750.0 && sal <= 1500.0) {
				 aum = 50.0;
			 }
			 if (sal >= 450.0 && sal < 750.0) {
				 aum = 75.0;
			 }
			 if (sal < 450.0) {
				 aum = 100.0;
			 }
			 novo_sal = sal + aum;
			 
			 System.out.println("O novo salário é: " + novo_sal);
		  }
		  if (op == 3) {
			  System.out.println("Digite o salário do funcionário: ");
			  sal = sc.nextDouble();
			  
			  if (sal <= 700) {
				  System.out.println("Mal Remunerado");
			  } else {
				  System.out.println("Bem Remunerado");
			  }
		  }
		} while (op != 4);
	}

}
