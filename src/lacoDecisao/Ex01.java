package lacoDecisao;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Ex01 {
	public static void main (String[]args) {
		int n1, n2, n3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 3 números");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior número é: " + n1);
		} else if(n2>n1 && n2>n3) {
			System.out.println("O maior número é: " + n2);
		} else {
			System.out.println("O maior número é: " + n3);
		}
		
		scanner.close();
		
	}
}
