package lacoDecisao;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		double x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		x = scanner.nextDouble();
		
		scanner.close();
		
		if(x%2 == 0) {
			System.out.println("O número é par e sua raíz é: " + Math.sqrt(x));
		} else {
			System.out.println("O número é ímpar e seu quadrado é: " + Math.pow(x, 2));
		}
	}
}
