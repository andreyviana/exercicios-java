package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class Ex02 {
	public static void main(String[]args) {
		int years = 0;
		int months = 0;
		int days= 0;
		int daysOld = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantos dias você nasceu");
		daysOld = scanner.nextInt();
		
		years = daysOld / 365;
		months = (daysOld % 365) / 30;
		days = daysOld - ((years * 365) + months * 30);
		
		System.out.println("Você tem:\n" + years + " anos\n" + months + " meses\n" + days + " dias");
		
		scanner.close();
	}

}
