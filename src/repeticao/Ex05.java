package repeticao;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class Ex05 {
	public static void main(String[] args) {
		int x, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número. Digite 0 (zero) para sair");
			x = scanner.nextInt();
			sum += x;
		}while(x != 0);
		
		System.out.println("A soma dos números digitados é: " + sum);
		
		scanner.close();
	}

}
