package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, cod, num_vei, num_acid, maior = 0, cid_maior = 0, menor = 0, cid_menor = 0, soma_vei = 0, soma_acid = 0, cont_acid = 0;
		double media_vei, media_acid;
		
		Scanner sc = new Scanner(System.in);
		
		for (cont = 1; cont <= 5; cont++) {
			System.out.println("Código da cidade: ");
			cod = sc.nextInt();
			System.out.println("Número de veículos de passeio: ");
			num_vei = sc.nextInt();
			System.out.println("Número de acidentes de trânsito com vítimas: ");
			num_acid = sc.nextInt();
			
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			} else {
				if (num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				}
				if(num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			}
			soma_vei = soma_vei + num_vei;
			
			if (num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid + 1;
			}
		}
		
		System.out.println("A cidade " + cid_maior + " tem o maior índice de acidentes de trânsito: " + maior);
		System.out.println("A cidade " + cid_menor + " tem o menor índice de acidentes de trânsito: " + menor);
		
		media_vei = soma_vei / 5;
		
		System.out.println("Média de veículos nas cinco cidades juntas: " + media_vei);
		
		if (cont_acid == 0) {
			System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
		} else {
			media_acid = soma_acid / cont_acid;
			System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio: " + media_acid);
		}
	}

}
