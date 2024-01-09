package vetorMatriz;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class Ex04 {
	public static void main(String[] args) {
		int[][] array = new int[3][3];
		int sum = 0;
		int diagonalSum = 0;
		
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println("Preencha uma matriz 3x3");
				array[i][j] = scanner.nextInt();
				sum += array[i][j];
			}
		}
		scanner.close();

		System.out.println("A soma de todos os elementos digitados é: " + sum);

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < 1 ; j++) {
					diagonalSum += array[i][i];
			 }
		}
		System.out.println("A soma da diagonal principal é: " + diagonalSum);
	}
}
