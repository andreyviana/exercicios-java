package lacoCondicional;

import java.util.Scanner;

/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

public class Ex07 {
	public static void main(String[]args) {
		double base, height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo");
		base = scanner.nextDouble();
		System.out.println("Digite a altura do triângulo");
		height = scanner.nextDouble();
		
		if(base>0 && height>0) {
			System.out.println("Área do triângulo: " + (base*height)/2);
		} else {
			System.out.println("Insira valores válidos (maiores que zero)");
		}
		
		scanner.close();
	}
}
