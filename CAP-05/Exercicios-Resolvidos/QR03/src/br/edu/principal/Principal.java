package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat comma = new DecimalFormat("0.00");
        System.out.println("Fatorial." + "\nDigite um valor equivalente à quantidade de vezes que deseja calcular o fatorial de um número.");
        int n = sc.nextInt();
        
        for (int x = 1; x <= n; x++) {
            System.out.println("\nDigite outro número (positivo e inteiro).");
            int num = sc.nextInt();
            int fat = 1;

            for (int y = 1; y <= num; y++) {
                fat = fat * y;
            }

            System.out.println("Fatorial de " + num + ": " + comma.format(fat));
        }

    }
}