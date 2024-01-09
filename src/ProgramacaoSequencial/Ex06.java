package ProgramacaoSequencial;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: d = raiz((x2-x1)^2 + (y2-y2)^2)*/

public class Ex06 {
	
	public static void main(String[]args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double d;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Atribua um ponto qualquer no plano para x1");
		x1 = scanner.nextDouble();
		System.out.println("Atribua um ponto qualquer no plano para y1");
		y1 = scanner.nextDouble();
		System.out.println("Atribua um ponto qualquer no plano para x2");
		x2 = scanner.nextDouble();
		System.out.println("Atribua um ponto qualquer no plano para y2");
		y2 = scanner.nextDouble();
		
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
		
		System.out.println("A distância entre os pontos é: " + d);
		
		scanner.close();
		
	}
	

	
}
