package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		double desc = 0;
		
		System.out.println("Digite o código do produto.");
		String produto = sc.next();
		System.out.println("Digite o atual preço do produto.");
		double preço = sc.nextDouble();
		
		if (preço <= 30) {
			desc = 0;
		} else if (preço > 30 && preço <= 100) {
			desc = (preço * 10)/100;
		} else if (preço > 100) {
			desc = (preço * 15)/100;
		} else {
			System.out.println("O valor do preço digitado é inválido.");
		}
		
		double novo_preço = preço - desc;
		System.out.println("O produto "+produto+" custa R$"+comma.format(novo_preço)+".\nDesconto aplicado: R$"+comma.format(desc));

	}

}
