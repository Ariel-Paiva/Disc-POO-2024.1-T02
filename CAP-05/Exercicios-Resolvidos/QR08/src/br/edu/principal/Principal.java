package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de termos desejados:");
        int ntermos = sc.nextInt();
        int n1 = 2;
        int n2 = 7;
        int n3 = 3;

        System.out.println("Os valores da série são: \nValor 1: " + n1 + " \nValor 2: " + n2 + " \nValor 3: " + n3);

        for (int x = 4; x <= ntermos; x++) {
            n1 *= 2;
            System.out.println("Valor " + x + ": " + n1);
            x += 1;

            if (x <= ntermos) {
                n2 *= 3;
                System.out.println("Valor " + x + ": " + n2);
                x += 1;
            }

            if (x <= ntermos) {
                n3 *= 4;
                System.out.println("Valor " + x + ": " + n3);
            }
        }

    }
}
