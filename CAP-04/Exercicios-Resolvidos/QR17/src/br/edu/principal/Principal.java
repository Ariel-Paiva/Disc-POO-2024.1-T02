package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	/**
	 * ax²+bx+c=0
	 * a!=0
	 * D=b²-4*a*c
	 * D<0 nao existe raiz real
	 * D=0 existe uma raiz real
	 * x=(-b)/(2*a)
	 * D>0 existem duas raízes reais
	 * x1= (=b + sqrtD)/(2*a)
	 * x1= (=b - sqrtD)/(2*a)
	 */

	public static void main(String[] args) {
		Scanner escaneador = new Scanner (System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Digite a: ");
		a = escaneador.nextDouble();
		System.out.println("Digite b: ");
		b = escaneador.nextDouble();
		System.out.println("Digite c: ");
		c = escaneador.nextDouble();
		if (a == 0) {
			System.out.println("Estes valores não formam uma equação de segundo grau.");
		}
		else {
			//início
			delta = (b * b) - (4 * a * c);
			if (delta<0) {
				System.out.println("Não existe raiz real.");
			}
			if (delta == 0) {
				System.out.println("Existe uma raiz real.");
				x1 = (-b) / (2*a);
				System.out.println(x1);
			}
			if (delta>0) {
				System.out.println("Existem duas raízes reais.");
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println(x1);
				System.out.println(x2);
			}
		}
	}

}
