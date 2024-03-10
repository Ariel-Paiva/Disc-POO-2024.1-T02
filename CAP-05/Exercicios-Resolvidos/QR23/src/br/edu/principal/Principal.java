package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");

		System.out.println("Digite o valor do salário mínimo.");
		double sal = sc.nextDouble();
		double qwval = sal/8;
		byte tipocons, cons = 0;
		double qwcons, acres, fat = 0, total;

		do {
			System.out.println("Digite a quantidade de quilowatts consumidos(caso deseje finalizar o programa, digite zero).");
			qwcons = sc.nextDouble();
			double gasto = qwval * qwcons;

			if (qwcons > 0) {
				System.out.println("Defina o tipo de consumidor(digite o número que o representa):"+"\n1- Residencial"+"\n2- Comercial"+"\n3- Industrial");
				tipocons = sc.nextByte();

				switch (tipocons) {
				case 1:
					acres = (gasto * 5)/100;
					break;
				case 2:
					acres = (gasto * 10)/100;
					break;
				case 3:
					acres = (gasto * 15)/100;
					break;
				default:
					acres = 0;
				}

				total = gasto + acres;
				fat += total;

				if (total >=500 && total <=1000) {
					cons++;
				}

				System.out.println("Os valores de gasto e acréscimo são, respectivamente: R$"+comma.format(gasto)+" e R$"+comma.format(acres));
				System.out.println("O valor a ser pago pelo consumidor é: R$" + comma.format(total));

			}

		} while (qwcons > 0);

		System.out.println("\nO faturamento geral da empresa foi de: R$" + comma.format(fat));
        System.out.println("A quantidade de consumidores que pagam entre 500 e 1000 reais é: " + cons);

	}

}