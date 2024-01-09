package repeticao;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class Ex06 {
	public static void main(String[]args) {
		int x, sum = 0, count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número. Para sair digite 0 (zero).");
			x = scanner.nextInt();
			
			if(x%3 == 0 && x != 0) {				
				sum += x;
				count++;
			}
		} while(x != 0);
		
		scanner.close();
		
		System.out.println("A média dos números múltiplos de 3 é: " + sum/count);
	
	}
}
