package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner (System.in);
		double sal_base, tempo, imposto, grat, sal_liq;
		System.out.println("Digite o salário base.");
		sal_base = escaneador.nextDouble();
		System.out.println("Digite o tempo de serviço.");
		tempo = escaneador.nextDouble();
		if (sal_base < 200) {
			imposto = 0;
		}
		else if (sal_base <= 450) {
			imposto = sal_base * (3.0/100);
		}
		else if (sal_base < 700) {
			imposto = sal_base * (8.0/100);
		}
		else {
			imposto = sal_base * (12.0/100);
		}
		System.out.println("O imposto, calculado pelo seu salário base, é de: R$"+imposto+".");
		
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat=20;
			}
			else {
				grat=30;
			}
		}
		else {
			if (tempo <= 3) {
				grat = 23;
			}
			else if (tempo < 6){
				grat = 35;
			}
			else {
				grat = 33;
			}
		}
		System.out.println("Sua gratificação, contabilizada pelo seu tempo de serviço é: R$"+grat+".");
		sal_liq = sal_base - imposto + grat;
		System.out.println("Seu salário líquido calculado retirando o imposto e adicionando a gratificação é de: R$"+sal_liq+".");
		if (sal_liq<=350) {
			System.out.println("Como você recebe até R$350,00, sua Classificação é A.");
		}
		else if (sal_liq < 600) {
			System.out.println("Como você recebe entre R$350,00 e R$600,00, sua Classificação é B.");
		}
		else {
			System.out.println("Como você recebe de R$600,00 pra cima, sua Classificação é C.");
		}
		
	}

}
