package br.edu.principal;
import java.util.Scanner;
public class Principal {

	//QR07
	//020324
	
	
	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double I, A, B, C;
		System.out.println("Digite um valor para A:");
		A = escaneador.nextDouble();
		System.out.println("Digite um valor para B:");
		B = escaneador.nextDouble();
		System.out.println("Digite um valor para C:");
		C = escaneador.nextDouble();
		System.out.println("Digite um valor para I (1, 2 ou 3):");
		I = escaneador.nextDouble();
		
		
		if (I==1) {
			if (A<B && A<C){
				if (B<C) {
					System.out.println("A ordem crescente dos números é:"+A+"; "+B+"; "+C);
				}
				else {
					System.out.println("A ordem crescente dos números é:"+A+"; "+C+"; "+B);
				}
			}	
			if (B<A && B<C){
				if (A<C) {
					System.out.println("A ordem crescente dos números é:"+B+"; "+A+"; "+C);
				}
				else {
					System.out.println ("A ordem crescente dos números é:"+B+"; "+C+"; "+A);
				}
			}
			if (C<A && C<B){
				if (A<B) {
					System.out.println ("A ordem crescente dos números é:"+C+"; "+A+"; "+B);
				}
				else {
					System.out.println(("A ordem crescente dos números é:"+C+"; "+B+"; "+A));
				}
			}
		}
		
		if (I==2){
			if (A>B && A>C) {
				if (B>C) {
					System.out.println ("A ordem decrescente dos números é:"+A+"; "+B+"; "+C);
				}
				else {
					System.out.println ("A ordem decrescente dos números é:"+A+"; "+C+"; "+B);
				}
			}
			if (B>A && B>C) {
				if (A>C) {
					System.out.println ("A ordem decrescente dos números é:"+B+"; "+A+"; "+C);
				}
				else {
					System.out.println ("A ordem decrescente dos números é:"+B+"; "+C+"; "+A);
				}
			}
			if (C>A && C>B) {
				if (A>B) {
					System.out.println ("A ordem decrescente dos números é:"+C+"; "+A+"; "+B);
				}
				else {
					System.out.println ("A ordem decrescente dos números é:"+C+"; "+B+"; "+A);
				}
			}
		}
		
		if (I==3){
			if (A>B && A>C) {
				System.out.println ("O maior fica entre os dois números: "+B+"; "+A+"; "+C);
			}
			if (B>A && B>C) {
				System.out.println ("O maior fica entre os dois números: "+A+"; "+B+"; "+C);
			}
			if (C>A && C>B) {
				System.out.println ("O maior fica entre os dois números: "+A+"; "+C+"; "+B);
			}
		}
	}

}
