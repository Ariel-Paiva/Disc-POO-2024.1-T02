package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, codigo, nht, valor;
		int sal_min, sal_inicial, aux, sal_final;
		char turno, categoria;
		Scanner sc = new Scanner(System.in);
		
		sal_min = 450;
		
		for(cont = 1; cont <= 10; cont++)
		{
			codigo = sc.nextInt(); 
			nht = sc.nextInt();
			turno = sc.next().charAt(0);
			categoria = sc.next().charAt(0);
			while(turno != 'M' && turno != 'V' && turno != 'N')
			{
				turno = sc.next().charAt(0);
			}
			while(categoria != 'G' && categoria != 'O')
			{
				categoria = sc.next().charAt(0);
			}
			if(categoria == 'G') {
				if(turno == 'N') {
					valor = sal_min * 18/100;
				}else {
					valor = sal_min * 15/100;
				}
			}else {
				if(turno == 'N') {
					valor = sal_min * 13/100;
				}else {
					valor = sal_min * 10/100;
				}
			}
			sal_inicial = nht * valor;
			if(sal_inicial <= 300) {
				aux = sal_inicial * 20/100;
			}else if(sal_inicial < 600){
				aux = sal_inicial * 15/100;
			}else {
				aux = sal_inicial * 5/100;
			}
			sal_final = sal_inicial + aux;
			System.out.println(codigo);
			System.out.println(nht);
			System.out.println(valor);
			System.out.println(sal_inicial);
			System.out.println(aux);
			System.out.println(sal_final);
		}

	}

}