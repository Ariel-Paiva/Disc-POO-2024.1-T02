package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Questão 15 - Exercícios resolvidos
 * Faça um programa que receba o valor do salário mínimo, o número de horas trabalhadas, o número de dependentes do funcionário e a quantidade de horas extras trabalhadas. Calcule e mostre o salário a receber do funcionário de acordo com as regras...
 */

public class Principal {
	public static void main(String[] args) {
		double sal_min, sal_receber, vh, smes, vdep, vhe, imp = 0, sbruto, sliq, grat = 0;
		int nht, ndep, nhet;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mínimo: ");
		sal_min = sc.nextDouble();
		System.out.println("Digite o número de horas trabalhadas: ");
		nht = sc.nextInt();
		System.out.println("Digite o número de dependentes: ");
		ndep = sc.nextInt();
		System.out.println("Digite o número de horas extras trabalhadas: ");
		nhet = sc.nextInt();
		
		vh = 1F/5F * sal_min;
		smes = nht * vh;
		vdep = 32 * ndep;
		vhe = nhet * (vh + (vh * 50F/100F));
		sbruto = smes + vdep + vhe;
		
		if (sbruto < 200) {
			imp = 0;
		} else if (sbruto >= 200 && sbruto <= 500) {
			imp = sbruto * 10F/100F;
		} else if (sbruto > 500) {
			imp = sbruto * 20F/100F;
		}
		
		sliq = sbruto - imp;
		
		if (sliq <= 350) {
			grat = 100;
		} else if (sliq > 350) {
			grat = 50;
		}
		
		sal_receber = sliq + grat;
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("O salário a receber será de R$ " + df.format(sal_receber));
		
	}
}
