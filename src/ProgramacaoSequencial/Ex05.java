package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
*/

public class Ex05 {
	public static void main(String[] args) {
		double grade1;
		double grade2;
		double grade3;
		double median;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva sua nota 1");
		grade1 = scanner.nextDouble();
		System.out.println("Escreva sua nota 2");
		grade2 = scanner.nextDouble();
		System.out.println("Escreva sua nota 3");
		grade3 = scanner.nextDouble();
	
		median = (grade1*2 + grade2*3 + grade3*5) / (2 + 3 + 5);
		
		System.out.println("A média ponderada é: " + median);
		
		scanner.close();
		
	}
}
