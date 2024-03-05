package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat comma = new DecimalFormat("0.00");
        double coe = 0;
        double imp = 0;
        int grat = 0;
        double aux = 0;
        int ht;
        double salbruto = 0;
        float salmin = 0f;
        double salL = 0;
        String turn;
        String cat;

        System.out.println("Digite o valor do salário mínimo.");
        salmin = sc.nextFloat();
        System.out.println("Digite a letra equivalente ao turno(maiúscula):" + "\n" + "M- Matutino." + "\n" + "V- Vespertino." + "\n" + "N- Noturno.");
        turn = sc.next();
        System.out.println("Digite a letra equivalente à categoria(maiúscula):" + "\n" + "O- Operário." + "\n" + "G- Gerente.");
        cat = sc.next();
        System.out.println("Digite o número de horas trabalhadas.");
        ht = sc.nextInt();

        if (turn.equals("M")) {
            coe = (salmin * 10) / 100;
        } else if (turn.equals("V")) {
            coe = (salmin * 15) / 100;
        } else if (turn.equals("N")) {
            coe = (salmin * 12) / 100;
        }

        System.out.println("O valor do coeficiente do salário é: R$" + comma.format(coe));
        salbruto = ht * coe;
        System.out.println("O valor do salário bruto é: R$" + comma.format(salbruto));

        if (cat.equals("O")) {
            if (salbruto >= 300) {
                imp = (salbruto * 5) / 100;
            } else {
                imp = (salbruto * 3) / 100;
            }
        } else {
            if (salbruto >= 400) {
                imp = (salbruto * 6) / 100;
            } else {
                imp = (salbruto * 4) / 100;
            }
        }

        System.out.println("O imposto sobre o salário bruto é igual a: R$" + comma.format(imp));

        if ((turn.equals("N")) && (ht > 80)) {
            grat = 50;
        } else {
            grat = 30;
        }

        System.out.println("A gratificação é de: R$" + grat);

        if ((cat.equals("O")) || (coe <= 25)) {
            aux = salbruto / 3;
        } else {
            aux = salbruto / 2;
        }

        System.out.println("O auxílio alimentação é igual a " + comma.format(aux) + " do salário bruto.");
        salL = (salbruto - imp) + grat + aux;
        System.out.println("O valor do salário líquido é: R$" + comma.format(salL));

        if (salL < 350) {
            System.out.println("Mal remunerado.");
        } else if ((salL >= 350) && (salL <= 600)) {
            System.out.println("Normal.");
        } else if (salL > 600) {
            System.out.println("Bem remunerado.");
        }
    }
}
