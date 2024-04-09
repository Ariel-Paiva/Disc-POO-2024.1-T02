package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op;
		double sal, imp = 0.0, aum = 0.0, novo_sal = 0.0;
		Scanner sc = new Scanner(System.in);
		
		do {
		  System.out.println("MENU DE OP��ES");
		  System.out.println("1 - Imposto");
		  System.out.println("2 - Novo Sal�rio");
		  System.out.println("3 - Classifica��o");
		  System.out.println("4 - Finalizar o programa");
	      System.out.println("Digite a opc�o desejada: ");
		  op = sc.nextInt();
		  
		  if (op > 4 || op < 1) {
			  System.out.println("\nOp��o inv�lida!\n");
		  } 
		  if (op == 1) {
			 System.out.println("Digite o sal�rio do funcion�rio: ");
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
			 System.out.println("Digite o sal�rio do funcion�rio: ");
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
			 
			 System.out.println("O novo sal�rio �: " + novo_sal);
		  }
		  if (op == 3) {
			  System.out.println("Digite o sal�rio do funcion�rio: ");
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
