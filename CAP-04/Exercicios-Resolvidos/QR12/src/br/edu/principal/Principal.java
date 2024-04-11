package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double salario, aumento, novo_sal, cargo;
		System.out.println("Digite o cargo do funcionário (1, 2, 3, 4 ou 5)");
		cargo = escaneador.nextDouble();
		System.out.println("Digite o valor do salário: ");
		salario = escaneador.nextDouble();
		if (cargo==1) {
			System.out.println("O cargo é Escrituário");
			aumento = (salario * 0.5);
			System.out.println("O valor do aumento é de R$"+ aumento);
			novo_sal = (salario + aumento);
			System.out.println("O novo salário é de R$"+novo_sal);
		}
		
		else if (cargo == 2){
			System.out.println("O cargo é Secretário");
			aumento = (salario * 0.35);
			System.out.println("O valor do aumento é de R$"+ aumento);
			novo_sal = (salario + aumento);
			System.out.println("O novo salário é de R$"+novo_sal);
		}
		
		else if (cargo == 3){
			System.out.println("O cargo é Caixa");
			aumento = (salario * 0.2);
			System.out.println("O valor do aumento é de R$"+ aumento);
			novo_sal = (salario + aumento);
			System.out.println("O novo salário é de R$"+novo_sal);
		}
		else if (cargo == 4){
			System.out.println("O cargo é Gerente");
			aumento = (salario * 0.1);
			System.out.println("O valor do aumento é de R$"+ aumento);
			novo_sal = (salario + aumento);
			System.out.println("O novo salário é de R$"+novo_sal);
		}
		else if (cargo == 5){
			System.out.println("O cargo é Diretor");
			aumento = (salario * 0);
			System.out.println("O valor do aumento é de R$"+ aumento);
			novo_sal = (salario + aumento);
			System.out.println("O novo salário é de R$"+novo_sal);
		}
		else {
			System.out.println("Cargo Inexistente!");
		}
	}

}
