package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double angulo, voltas;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o ângulo em graus: ");
		angulo = sc.nextDouble();
		
		if (angulo > 360 || angulo < -360) {
			voltas = Math.abs((int)(angulo / 360));
			angulo = angulo % 360;
		} else voltas = 0;
		
		if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360)
			System.out.println("Está em cima de algum dos eixos.");

		if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360))
			System.out.println("1º Quadrante");
		
		if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270))
			System.out.println("2º Quadrante");
		
		if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180))
			System.out.println("3º Quadrante");
		
		if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90))
			System.out.println("4º Quadrante");
		
		DecimalFormat df = new DecimalFormat("0.#");
		System.out.println(df.format(voltas) + " volta(s) no sentido " + (angulo < 0 ? "horário" : "anti-horário"));
	}

}
