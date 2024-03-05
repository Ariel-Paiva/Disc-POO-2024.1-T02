/**
 * ALGORITMO
DECLARE i, ano_atual, salario NUMÉRICO
novo_salario, percentual NUMÉRICO
LEIA ano_atual
salario ← 1000
percentual ← 1.5/100
novo_salario ← salario + percentual * salario
PARA i ← 2007 ATÉ ano_atual FAÇA
INÍCIO
percentual ← 2 * percentual
novo_salario ← novo_salario + percentual * novo_salario
FIM
ESCREVA novo_salario
FIM_ALGORITMO.
 */

package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner (System.in);
		int ano_atual, i;
		double salario, novo_salario, percentual;
		System.out.println("Digite o ano atual");
		ano_atual = escaneador.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		salario = 1000;
		percentual = 0.015;
		novo_salario = salario + percentual * salario;
		//for (i = 10; i >= 1; i--)
		for (i = 2007; i<= ano_atual; i++) {
			percentual = 2*percentual;
			novo_salario = novo_salario + percentual * novo_salario;
		}
		System.out.println(df.format(novo_salario));
	}

}
