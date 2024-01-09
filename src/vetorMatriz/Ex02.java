package vetorMatriz;

import java.util.Random;

import java.util.Arrays;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class Ex02 {
	public static void main(String[] args) {
		int dices[] = new int[10];
		int sum = 0, count = 0, highRoll = 0;
		
		Random roll = new Random();
		
		for(int i = 0; i < dices.length; i++) {
			dices[i] = roll.nextInt(6)+1;
			
			sum += dices[i];
			count++;
			
			if(dices[i] > highRoll) {
				highRoll = dices[i];
			}	
		}
		System.out.println("Pontos tirados no dado: " + Arrays.toString(dices));
		System.out.println("A maior pontuação foi: " + highRoll);
		System.out.println("A média dos pontos é: " + (sum/count)); 
	}
}
