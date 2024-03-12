package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		byte cod_prod, cod_pais;
		double peso_quilos, peso_gramas, pre_total, imposto = 0, valor_total, pre_grama = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		cod_prod = sc.nextByte();
		System.out.println("Digite o peso do produto em quilos: ");
		peso_quilos = sc.nextDouble();
		System.out.println("Digite o código do país de origem: ");
		cod_pais = sc.nextByte();
		
		DecimalFormat virgulaOpcional = new DecimalFormat("#,##0.#");
		peso_gramas = peso_quilos * 1000;
		System.out.println("O peso do produto em gramas é " + virgulaOpcional.format(peso_gramas) + " g");
		
		if (cod_prod >= 1 && cod_prod <= 4)
			pre_grama = 10;
		
		if (cod_prod >= 5 && cod_prod <= 7)
			pre_grama = 25;
		
		if (cod_prod >= 8 && cod_prod <= 10)
			pre_grama = 35;
		
		DecimalFormat reais = new DecimalFormat("#,##0.00");
		
		pre_total = peso_gramas * pre_grama;
		System.out.println("O preço total do produto é R$ " + reais.format(pre_total));
		
		if (cod_pais == 1)
			imposto = 0;
		
		if (cod_pais == 2)
			imposto = pre_total * 15F/100F;
		
		if (cod_pais == 3)
			imposto = pre_total * 25F/100F;
		
		System.out.println("O valor do imposto é R$ " + reais.format(imposto));
		
		valor_total = pre_total + imposto;
		
		System.out.println("O valor total incluindo impostos é R$ " + reais.format(valor_total));
	}
}
