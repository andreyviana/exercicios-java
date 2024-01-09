package lacoCondicional;

import java.util.Scanner;

/*Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

public class Ex03 {
	public static void main(String[]args) {
		double n1, n2, n3, n4;
		double powN1, powN2, powN3, powN4;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite quatro números");
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();
		n3 = scanner.nextDouble();
		n4 = scanner.nextDouble();
		
		powN1 = Math.pow(n1, 2);
		powN2 = Math.pow(n2, 2);
		powN3 = Math.pow(n3, 2);
		powN4 = Math.pow(n4, 2);
		
		if(powN3 >= 1000) {
			System.out.println("o terceiro número: " + n3 + " possui um quadrado maior que 1000: " + powN3);
		} else {
			System.out.println("NÚMERO 1: " + n1 + "\nNÚMERO 1 AO QUADRADO: " + powN1);
			System.out.println("NÚMERO 2: " + n2 + "\nNÚMERO 2 AO QUADRADO: " + powN2);
			System.out.println("NÚMERO 3: " + n3 + "\nNÚMERO 3 AO QUADRADO: " + powN3);
			System.out.println("NÚMERO 4: " + n4 + "\nNÚMERO 4 AO QUADRADO: " + powN4);
		}
		
		scanner.close();
	}
}
