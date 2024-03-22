package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double media, media_classe, total_classe = 0, n1, n2;
		int cont, ta = 0, te = 0, tr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (cont = 1; cont <= 6; cont++) {
			System.out.println("Digite a nota 1 do aluno " + cont + ": ");
			n1 = sc.nextDouble();
			System.out.println("Digite a nota 2 do aluno " + cont + ": ");
			n2 = sc.nextDouble();
			
			media = (n1 + n2) / 2;
			System.out.println("\nA média do aluno " + cont + " é: " + media);
			
			if (media <= 3) {
				tr = tr + 1;
				System.out.println("Aluno " + cont + " está reprovado!\n");
			}
			if (media > 3 && media < 7) {
				te = te + 1;
				System.out.println("Aluno " + cont + " está de exame!\n");
			}
			if(media >= 7) {
				ta = ta + 1;
				System.out.println("Aluno " + cont + " está aprovado!\n");
			}
			
			total_classe = total_classe + media;
		}
		
		System.out.println("Total de alunos reprovados: " + tr);
		System.out.println("Total de alunos de exame: " + te);
		System.out.println("Total de alunos aprovados: " + ta + "\n");
		
		media_classe = total_classe / 6;
		
		System.out.println("A média da classe é: " + media_classe);
	}

}
