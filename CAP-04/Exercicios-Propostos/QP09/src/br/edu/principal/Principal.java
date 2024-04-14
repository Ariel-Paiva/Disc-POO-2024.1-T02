package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int saldo_medio, credito;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu saldo médio:");
		
		saldo_medio = sc.nextInt();
		System.out.println("Seu saldo médio é: " + saldo_medio);
		
		if (saldo_medio == 200) {
			credito = saldo_medio + saldo_medio * 10/100;
			System.out.println("O valor do seu crédito é: " + credito);
		}else {
			if (saldo_medio > 200 && saldo_medio <= 300) {
				credito = saldo_medio + saldo_medio * 20/100;
				System.out.println("O valor do seu crédito é: " + credito);
			}else {
				if (saldo_medio > 300 && saldo_medio <= 400) {
					credito = saldo_medio + saldo_medio * 25/100;
					System.out.println("O valor do seu crédito é: " + credito);
				}else {
					if (saldo_medio > 400) {
						credito = saldo_medio + saldo_medio * 30/100;
						System.out.println("O valor do seu crédito é: " + credito);
					}
				}
			}
		}

	}

}
