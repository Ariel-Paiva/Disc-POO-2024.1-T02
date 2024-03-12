package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pre, valor_adic = 0, imposto = 0, pre_custo = 0, desconto = 0, novo_pre = 0;
		String tipo, refrig;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		pre = sc.nextDouble();
		System.out.println("Digite o tipo do produto (A — alimentação; L — limpeza; e V — vestuário): ");
		tipo = sc.next();
		System.out.println("Digite a refrigeração do produto (S — produto que necessita de refrigeração; e N — produto que não necessita de refrigeração): ");
		refrig = sc.next();
		
		if (refrig.equals("N")) {
			if (tipo.equals("A")) {
				if (pre < 15) {
					valor_adic = 2;
				} else {
					valor_adic = 5;
				}
			} else
            if (tipo.equals("L")) {
            	if (pre < 10) {
					valor_adic = 1.50;
				} else {
					valor_adic = 2.50;
				}
			}else
            if (tipo.equals("V")) {
            	if (pre < 30) {
					valor_adic = 3;
				} else {
					valor_adic = 2.50;
				}
            }
		} else {
            if (tipo.equals("A")) {
				valor_adic = 8;
			}else
            if (tipo.equals("L")) {
				valor_adic = 0;
			}else
            if (tipo.equals("V")) {
	            valor_adic = 0;
            }
		}
		System.out.println("Valor adicional: " + valor_adic);
		
		if (pre < 25) {
			imposto = (5./100.) * pre;
		} else {
			imposto = (8./100.) * pre;
		}
		System.out.println("Imposto: " + imposto);
		
		pre_custo = pre + imposto;
		System.out.println("Preço de custo: " + pre_custo);
		if (!tipo.equals("A") && !refrig.equals("S")) {
			desconto = 3./100. * pre_custo;
		} else {
			desconto = 0;
		}
		System.out.println("Desconto: " + desconto);
		
		novo_pre = pre_custo + valor_adic - desconto;
		
		System.out.println("Novo preço: " + novo_pre);
		if(novo_pre <= 50) {
			System.out.println("Barato");
		}else if (novo_pre < 100) {
			System.out.println("Normal");
		} else {
			System.out.println("Caro");
		}
	}
}