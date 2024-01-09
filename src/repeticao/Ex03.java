package repeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Ex03 {
	public static void main(String[]args) {
		int young = 0, elderly = 0, ages = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(ages != -99) {
			System.out.println("Digite a idade de alguém. Digite -99 para terminar o programa");
			ages = scanner.nextInt();
			
			if(ages<21 && ages>0) {
				young++;
			} else if(ages > 50) {
				elderly++;
			}
		}
		scanner.close();
		System.out.println("Total de pessoas com menos 21 anos: " + young + "\nTotal de pessoas com mais de 50 anos: " + elderly);
	}
}
