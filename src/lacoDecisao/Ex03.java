package lacoDecisao;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

import java.util.Scanner;

public class Ex03 {
	public static void main (String[] args) {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		age = scanner.nextInt();
		scanner.close();
		
		if(age>=18 && age<=25) {
			System.out.println("adulto");
		} else if(age>=15 && age<=17) {
			System.out.println("juvenil");
		} else if(age>=10 && age<=14) {
			System.out.println("infantil");
		} else {
			System.out.println("não se encontra em nenhuma categoria");
		}
	}
}
