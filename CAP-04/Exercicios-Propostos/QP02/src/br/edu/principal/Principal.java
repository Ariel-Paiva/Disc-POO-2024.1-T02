package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner (System.in);
		double n1, n2, media;
		System.out.println("Digite a nota 1: ");
		n1 = escaneador.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = escaneador.nextDouble();
		media = (n1+n2)/2;
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if (media<7 && media>=3) {
			System.out.println("Exame");
		}
		else if(media<3 && media >=0) {
			System.out.println("Reprovado");
		}
		else {
			System.out.println("Tente novamente.");
		}
	}

}
