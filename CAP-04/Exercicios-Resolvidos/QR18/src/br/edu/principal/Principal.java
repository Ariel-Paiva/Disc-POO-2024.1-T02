package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Classificação de um triângulo."+"\n"+"Digite o valor do primeiro lado do triângulo.");
		float l1 = sc.nextFloat();
		System.out.println("Digite o valor do segundo lado do triângulo.");
		float l2 = sc.nextFloat();
		System.out.println("Digite o valor do terceiro lado do triângulo.");
		float l3 = sc.nextFloat();
		
		if ((l1<l2+l3) && (l2<l1+l3) && (l3<l1+l2)) {
			
			if ((l1==l2) && (l2==l3)) {
				System.out.println("O triângulo é equilátero.");
			} else if ((l1==l2) || (l1==l3) || (l2==l3)) {
				System.out.println("O triângulo é isósceles.");
			} else {
				System.out.println("O triângulo é escaleno.");
			}
			
		} else {
			System.out.println("As medidas fornecidas não formam um triângulo.");
		}

	}

}
