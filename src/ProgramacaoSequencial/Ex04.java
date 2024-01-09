package ProgramacaoSequencial;

import java.util.Scanner;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:

R = ( A + B )^2
S = ( B + C )^2
D = ( R + S )/2

*/

public class Ex04 {
	public static void main(String[]args) {
		
		int A;
		int B;
		int C;
		
		int R;
		int S;
		int D;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para A");
		A = scanner.nextInt();
		System.out.println("Digite um número para B");
		B = scanner.nextInt();
		System.out.println("Digite um número para C");
		C = scanner.nextInt();
		
		R = (int) Math.pow(A + B, 2);
		S = (int) Math.pow(B + C, 2);
		D = (R + S) / 2;
		
		System.out.println("O resultado da expressão é: " + D);
		
		scanner.close();
		
	}
}
