package vetorMatriz;

import java.util.Random;
import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

public class Ex01 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		int highScore = 0;

		Random random = new Random();

		for(int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(11);
			System.out.println("pontuação " + (i+1) + " - Pontos: " + scores[i]);
			
			if(scores[i]>highScore) {
				highScore = scores[i];
			}
		}
		
		System.out.println("A maior pontuação é: " + highScore);
	}
}
