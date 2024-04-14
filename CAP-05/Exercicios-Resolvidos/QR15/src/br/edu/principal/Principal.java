package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco, custo_est = 0, imp, preco_final, adicional, maior_p = 0, menor_p = 0, tot_imp;
		int i, qtd_b, qtd_n, qtd_c;
		
		String refri, categ;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		adicional = 0;
		tot_imp = 0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;
		
		for (i = 0; i < 12; i++) {
			System.out.println("--- " + (i + 1) + "º produto ---");
			
			System.out.println("Informe o preço do produto: ");
			preco = sc.nextDouble();
			
			System.out.println("Necessita refrigeração? (S/N) ");
			refri = sc.next();
			
			System.out.println("Informe a categoria do produto (A/L/V): ");
			categ = sc.next();
		
			if (preco <= 20) {
				if (categ.equals("A"))
					custo_est = 2;
				else if (categ.equals("L"))
					custo_est = 3;
				else if (categ.equals("V"))
					custo_est = 4;
			} else if (preco > 20 && preco <= 50) {
				if (refri.equals("S"))
					custo_est = 6;
				else custo_est = 0;
			} else if (preco > 50) {
				if (refri.equals("S")) {
					if (categ.equals("A"))
						custo_est = 5;
					else if (categ.equals("L"))
						custo_est = 2;
					else if (categ.equals("V"))
						custo_est = 4;
				} else {
					if (categ.equals("A") || categ.equals("V"))
						custo_est = 0;
					else if (categ.equals("L"))
						custo_est = 1;
				}
			}
			
			if (!categ.equals("A") && !refri.equals("S"))
				imp = preco * 2./100.;
			else imp = preco * 4./100.;
			
			preco_final = preco + custo_est + imp;
			
			System.out.println("Custo de estocagem: R$" + df.format(custo_est));
			System.out.println("Imposto: R$" + df.format(imp));
			System.out.println("Preço final: R$" + df.format(preco_final));
			
			if (preco_final <= 20) {
				qtd_b += 1;
				System.out.println("Classificação Barato");
			} else if (preco_final > 20 && preco_final <= 100) {
				qtd_n += 1;
				System.out.println("Classificação Normal");
			} else if (preco_final > 100) {
				qtd_c += 1;
				System.out.println("Classificação Caro");
			}
			
			adicional += custo_est + imp;
			tot_imp += imp;
			
			if (i == 0) {
				maior_p = preco_final;
				menor_p = preco_final;
			} else {
				if (preco_final > maior_p)
					maior_p = preco_final;
				
				if (preco_final < menor_p)
					menor_p = preco_final;
			}
			
			System.out.println("");
		}
		
		adicional = adicional / 12;
		
		System.out.println("Média dos valores adicionais: R$" + df.format(adicional));
		System.out.println("Maior preço final: R$" + df.format(maior_p));
		System.out.println("Menor preço final: R$" + df.format(menor_p));
		System.out.println("Total de impostos: R$" + df.format(tot_imp));
		System.out.println("Quantidade de produtos baratos: " + qtd_b);
		System.out.println("Quantidade de produtos normais: " + qtd_n);
		System.out.println("Quantidade de produtos caros: " + qtd_c);
	}

}
