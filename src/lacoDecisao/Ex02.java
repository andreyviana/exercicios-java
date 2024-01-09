package lacoDecisao;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class Ex02 {
	public static void main(String[] args) {
		int n1, n2, n3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		
		if((n1<n2 && n1<n3) && n2<n3) {
			System.out.printf("%d %d %d", n1,n2,n3);
		} else if((n1>n2 && n1<n3) && n2<n3) {
			System.out.printf("%d %d %d", n2,n1,n3);
		} else if((n1>n2 && n1>n3) && n2>n3) {
			System.out.printf("%d %d %d", n3,n2,n1);			
		} else if((n1<n2 && n1>n3) && n2>n3) {
			System.out.printf("%d %d %d", n3,n1,n2);
		} else if((n1>n2 && n1>n3) && n2<3) {
			System.out.printf("%d %d %d", n2,n3,n1);
		} else if((n1<n2 && n1<n3) && n2>n3) {
			System.out.printf("%d %d %d", n1,n3,n2);
		}
		
		scanner.close();
	}
}
