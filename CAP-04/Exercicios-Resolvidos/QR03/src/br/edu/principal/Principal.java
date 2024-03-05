package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		
		System.out.println("Digite um número.");
		double n1 = sc.nextDouble();
		System.out.println("Digite outro número.");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println("O maior número é: "+ comma.format(n1));
		} else if (n2 > n1){
			System.out.println("O maior número é: "+ comma.format(n2));
		} else if (n1 == n2) {
			System.out.println("Os número são iguais.");
		}
		
	} 

}
