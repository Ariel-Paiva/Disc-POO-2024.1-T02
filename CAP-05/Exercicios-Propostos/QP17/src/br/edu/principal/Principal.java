package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, num_canal;
		double num_pes, porcent;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			num_canal = sc.nextInt();
			if(num_canal == 4 || num_canal == 5 || num_canal == 7 || num_canal == 12) {
				num_pes = sc.nextInt();
				porcent = num_pes * num_pes / 100;
				System.out.println("A porcentagem de audiência do canal " + num_canal + " é " + porcent + "%");
			}
			if(num_canal == 0) {
				break;				}
		}while(num_canal != 4 || num_canal != 5 || num_canal != 7 || num_canal != 12);
		
	}

}