package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class Ex03 {
	public static void main(String[]args) {
		int totalTime = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração do evento em segundos");
		totalTime = scanner.nextInt();
		
		hours = totalTime / 3600;
		minutes = totalTime / 60 - hours*60;
		seconds = totalTime - minutes*60 - hours*3600;
		
		System.out.println("HORAS\tMINUTOS\tSEGUNDOS\n" + hours + "\t" + minutes + "\t" + seconds);
		
		scanner.close();
	}
}
