package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco, imp, transp = 0, seguro, vfinal, total_imp = 0;
		int origem;
		String meio_t, carga;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		System.out.println("Informe o preço do produto (0 para terminar): ");
		preco = sc.nextDouble();
		
		while (preco > 0) {
			System.out.println("Informe o país de origem (1/2/3): ");
			origem = sc.nextInt();
			
			System.out.println("Informe o meio de transporte (T/F/A): ");
			meio_t = sc.next();
			
			System.out.println("É carga perigosa? (S/N) ");
			carga = sc.next();
			
			if (preco <= 100)
				imp = preco * 5./100.;
			else imp = preco * 10./100.;
			
			if (carga.equals("S")) {
				if (origem == 1)
					transp = 50;
				else if (origem == 2)
					transp = 21;
				else if (origem == 3)
					transp = 24;
			} else if (carga.equals("N")) {
				if (origem == 1)
					transp = 12;
				else if (origem == 2)
					transp = 21;
				else if (origem == 3)
					transp = 60;
			}
			
			if (origem == 2 || meio_t.equals("A"))
				seguro = preco/2.;
			else seguro = 0;
			
			vfinal = preco + imp + transp + seguro;
			total_imp += imp;
			
			System.out.println("Valor de impostos: R$" + df.format(imp));
			System.out.println("Valor do transporte: R$" + df.format(transp));
			System.out.println("Valor do seguro: R$" + df.format(seguro));
			System.out.println("Valor final: R$" + df.format(vfinal));
			
			System.out.println("\nInforme o preço do produto (0 para terminar): ");
			preco = sc.nextDouble();
		}
	}

}
