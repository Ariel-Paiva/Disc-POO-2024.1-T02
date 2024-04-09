package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String passwordUser = "4531", passwordInput;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LOGIN");
		System.out.println("Digite a senha: ");
		passwordInput = sc.next();
		
		if (passwordInput.equals(passwordUser)) {
			System.out.println("\nAcesso permitido. Login concluído!");
		} else {
			System.out.println("\nSenha inválida! Seu acesso foi negado. Tente novamente fazer login!");
		}
	}

}
