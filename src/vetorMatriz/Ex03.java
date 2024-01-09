package vetorMatriz;

import java.util.Random;

/*
3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

public class Ex03 {
	public static void main(String[] args) {
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		Random random = new Random();
		
		System.out.println("\nN1\n");
		
		for(int i = 0; i < N1.length; i++) {
			for(int j = 0; j < N1[i].length; j++) {
				N1[i][j] = random.nextInt(10)+1;
				N2[i][j] = random.nextInt(10)+1;
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.print(N1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nN2\n");
		
		for(int i = 0; i < N2.length; i++) {
			for(int j = 0; j < N2[i].length; j++) {
				System.out.print(N2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nM1\n");
		
		for(int i = 0; i < M1.length; i++) {
			for(int j = 0; j < M1[i].length; j++) {
				System.out.print(M1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nM2\n");
		
		for(int i = 0; i < M2.length; i++) {
			for(int j = 0; j < M2[i].length; j++) {
				System.out.print(M2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}



