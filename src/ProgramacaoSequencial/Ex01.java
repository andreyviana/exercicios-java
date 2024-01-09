package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class Ex01 {

	public static void main(String[]args) {
		int years = 0;
		int months = 0;
		int days = 0;
		int daysOld = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		years = scanner.nextInt();
		
		System.out.println("Fazem quantnos meses completos desde o seu aniversário?");
		months = scanner.nextInt();

		System.out.println("Fazem quantos dias desde o último mês completo?");
		days = scanner.nextInt();
		
		daysOld = (years * 365) + (months * 30) + days;
		
		System.out.println("você tem: " + daysOld + " dias de idade");
		
		scanner.close();
	}

}
