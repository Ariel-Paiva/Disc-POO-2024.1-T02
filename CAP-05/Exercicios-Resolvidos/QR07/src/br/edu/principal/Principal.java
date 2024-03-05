package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner (System.in);
		/**
		 * ALGORITMO
DECLARE cont, num1, num2, res NUMÉRICO
num1 ← 0
num2 ← 1
ESCREVA num1
ESCREVA num2
PARA cont ← 3 ATÉ 8 FAÇA
INÍCIO
res ← num1 + num2
ESCREVA res
num1 ← num2
num2 ← res
FIM
FIM_ALGORITMO.
		 */
		double cont, num1, num2, res;
		num1 = 0;
		num2= 1;
		System.out.println(num1);
		System.out.println(num2);
		for (cont=3; cont<=8; cont ++) {
			res = num1 + num2;
			System.out.println(res);
			num1 = num2;
			num2 = res;
		}
	}

}
