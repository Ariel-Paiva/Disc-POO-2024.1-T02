package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int idade;
		double tot_f, tot_m, soma1, cont_m1, cont_m2, tot, cont_f1, media_idade, perc, menor_idade;
		String sexo, exp;
		tot = 0;
		tot_f = 0;
		tot_m=0;
		soma1=0;
		cont_m1=0;
		cont_m2 = 0;
		cont_f1 = 0;
		menor_idade = 0;
		Scanner escaneador = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		idade = escaneador.nextInt();
		while (idade != 0) {
			System.out.println("Digite a seu sexo, M ou F:");
			sexo = escaneador.next();
			sexo = sexo.toUpperCase();
			System.out.println("Digite a sua experiência, S ou N:");
			exp = escaneador.next();
			exp = exp.toUpperCase();
			if (sexo.equals("F") && exp.equals("S")) {
				if(tot == 0) {
					menor_idade = idade;
					tot = 1;
				}
			}
			else if (idade < menor_idade) {
				menor_idade = idade;
			}
			
			if (sexo.equals("M")) {
				tot_m = tot_m + 1;	
			}
			if (sexo.equals("F")) {
				tot_f = tot_f + 1;
			}
			if (sexo.equals("F") && idade<21 && exp.equals("S")) {
				cont_f1 = cont_f1 + 1;
			}
			if (sexo.equals("M") && idade > 45) {
				cont_m1 = cont_m1 + 1;
			}
			if (sexo.equals("M") && exp.equals("S")) {
				soma1 = soma1 + idade;
				cont_m2 = cont_m2 + 1;
			}
			System.out.println("Digite a idade. Caso não queira prosseguir, digite 0.");
			idade = escaneador.nextInt();
		}
		System.out.println("O total de mulheres foi: " +tot_f);
		System.out.println("O total de homens foi: " +tot_m);
		if (cont_m2 == 0) {
			System.out.println("Nenhum homem com experiência");
		}else {
			media_idade  = soma1 / cont_m2;
			System.out.println("A idade media dos homens com experiência no serviço é: "+ media_idade);
			
		}
		if (tot_m == 0){
			System.out.println("Nenhum homem");
		}
		else {
			perc = cont_m1 * 100 / tot_m;
			System.out.println("A porcentagem de homens com com mais de 45 anos entre o total dos homens é: "+ perc+"%");
		}
		System.out.println("O número de mulheres com idade inferior a 21 anos e com experiência no serviço é de: "+cont_f1);
		System.out.println("A menor idade entre as mulheres que já têm experiência no serviço é de:" + menor_idade);
	}

}
