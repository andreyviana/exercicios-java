package lacoCondicional;

import java.util.Scanner;

/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

public class Ex06 {
	public static void main (String[] args) {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		age = scanner.nextInt();
		
		if(age >= 18) {
			System.out.println("Adulto");
		} else if(age >= 14) {
			System.out.println("Juvenil B");
		} else if(age >= 12) {
			System.out.println("Juvenil A");
		} else if(age >= 8) {
			System.out.println("Infantil B");
		} else if(age >= 5) {
			System.out.println("Infantil A");
		} else {
			System.out.println("não tem idade para nadar");
		}
		
		scanner.close();
	}
}
