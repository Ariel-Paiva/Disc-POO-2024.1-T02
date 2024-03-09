package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totm=0, totf=0, tot24=0;
		
		System.out.println("Índice de mortalidade infantil."+"\nDigite o número de crianças nascidas no período.");
		int child = sc.nextInt();
		
		for (byte x = 1; x <= child; x++) {
			System.out.println("Digite o sexo da "+x+"ª criança(digite M para masculino e F para feminino).");
			String sexo = sc.next();
			System.out.println("Digite, em meses, o tempo de vida da "+x+"ª criança.");
			byte mes = sc.nextByte();
			
			if (sexo.equals("M") | sexo.equals("m")) {
				totm += 1;
			} else if (sexo.equals("F") | sexo.equals("f")) {
				totf += 1;
			} else {
				System.out.println("O sexo da criança não foi definido corretamente.");
			}
			
			if (mes <= 24) {
				tot24 += 1;
			}
		}
		
		if (child <= 0) {
			System.out.println("Nenhuma criança registrada.");
		} else {
			int porcm = (totm * 100)/child;
			int porcf = (totf * 100)/child;
			int porc24 = (tot24 * 100)/child;
			System.out.println("O perceuntual de crianças do sexo masculino e feminino mortas é, respectivamente: "+porcm+"% "+porcf+"%.");
			System.out.println("O percentual de crianças com 24 meses ou menos mortas é: "+porc24+"%.");
		}
		
	}

}
