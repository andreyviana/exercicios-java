package lacoCondicional;

import java.util.Scanner;

/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo*/
public class Ex04 {
	public static void main(String[] args) {
		int x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		x = scanner.nextInt();
		
		if(x%2 == 0) {
			System.out.println("o número: " + x + " é par");
		} else {
			System.out.println("o número: " + x + " é ímpar");			
		}
		
		if(x > 0) {
			System.out.println("é positivo");
		} else {
			System.out.println("é negativo");
		}
		
		scanner.close();
	}
}
