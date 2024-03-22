package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double valor_inicial, valor_parc, total, valor_juros;	
		int i, juros = 0, num_parc = 1;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial da dívida: ");
		valor_inicial = sc.nextDouble();
		
		total = valor_inicial;
		valor_parc = valor_inicial;
		
		System.out.println("Valor da dívida: " + total);
		System.out.println("Valor dos juros: " + juros);
		System.out.println("Quantidade de parcelas: " + num_parc);
		System.out.println("Valor da parcela: " + valor_parc);
		
		juros = juros + 10;
		num_parc = num_parc + 2;
		
		for (i = 0; i < 4; i++) {
			valor_juros = valor_inicial * juros / 100;
			total = valor_inicial + valor_juros;
			valor_parc = total / num_parc;
			
			System.out.println("\nValor da dívida: " + total);
			System.out.println("Valor dos juros: " + valor_juros);
			System.out.println("Quantidade de parcelas: " + num_parc);
			System.out.println("Valor da parcela: " + valor_parc);
			
			juros = juros + 5;
			num_parc = num_parc + 3;
		}
	}

}
