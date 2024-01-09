package lacoCondicional;

import java.util.Scanner;

/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.*/

public class Ex08 {
	public static void main(String[]args) {
		int N;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		N = scanner.nextInt();
		
		if(N > 100) {
			System.out.println(N);
		} else {
			N = 0;
			System.out.println(N);
		}
		
		scanner.close();
	}
}
