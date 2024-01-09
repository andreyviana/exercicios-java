package repeticao;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Ex02 {
	public static void main(String[]args) {
		int[] numbers = new int[10];
		int evenNumber = 0, oddNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 10 números");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int number : numbers) {
			if(number%2 == 0) {
				evenNumber++;
			} else {
				oddNumber++;
			}
		}
		
		System.out.println(evenNumber + " números pares e " + oddNumber + " números ímpares");
	}
}
