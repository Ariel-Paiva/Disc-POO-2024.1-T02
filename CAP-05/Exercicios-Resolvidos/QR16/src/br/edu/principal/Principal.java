package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			base = sc.nextInt();
		}
		while(base <= 0);
		
		do
		{
			altura = sc.nextInt();
		}
		while(altura <= 0);
		
		area = base * altura / 2;
		
		System.out.println(area);
	}
	
}