package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int pre, venda, novo_pre;
		Scanner sc = new Scanner(System.in);
		pre = sc.nextInt();
		venda = sc.nextInt();
		
		if (venda < 500 || pre < 30) {
			novo_pre = pre + pre * 10/100;
			System.out.print(novo_pre);
		}else {
			if (venda >= 500 && venda < 1200 || pre >= 30 && pre < 80){
				novo_pre = pre + pre * 15/100;
				System.out.print(novo_pre);
			}else {
				if (venda >= 1200 || pre >= 80) {
					novo_pre = pre - pre * 20/100;
					System.out.print(novo_pre);
					
				}
			}
		}

	}

}