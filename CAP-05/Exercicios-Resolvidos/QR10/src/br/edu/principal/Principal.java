package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont_time, cont_jog, idade, qtde, tot80;
		double media_idade, media_altura = 0, peso, porc, alt;
		
		Scanner sc = new Scanner(System.in);
		
		qtde = 0;
		tot80 = 0;
		
		for (cont_time = 0; cont_time < 5; cont_time ++) {
			media_idade = 0;
			
			for (cont_jog = 0; cont_jog < 11; cont_jog ++) {
				System.out.println("--- " + (cont_jog + 1) + "º jogador ---");
				
				System.out.println("Informe idade: ");
				idade = sc.nextInt();
				
				System.out.println("Informe peso: ");
				peso = sc.nextDouble();
				
				System.out.println("Informe altura: ");
				alt = sc.nextDouble();
				
				if (idade < 18) {
					qtde = qtde + 1;
				}
				
				media_idade += idade;
				media_altura += alt;
				
				if (peso > 80)
					tot80 += 1;
			}
			
			media_idade = media_idade / 11;
			System.out.println("A média das idades da " + (cont_time + 1) + "ª equipe é " + media_idade + "\n");
		}
		
		System.out.println("No total, há " + qtde + " jogadores menores de 18 anos.");
		
		media_altura = media_altura / 55;
		
		System.out.println("A média de altura de todos os jogadores é " + media_altura);
		
		porc = tot80 * 100./55.;
		
		System.out.println("Porcentagem de jogadores com +80kg: " + porc + "%");
	}

}
