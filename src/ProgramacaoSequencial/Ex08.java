package ProgramacaoSequencial;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[]args) {
		double factoryValue;
		double distributorValue; 
		double taxValue;
		double costumerValue;

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preço do automóvel");
		factoryValue = scanner.nextDouble();
		
		distributorValue = factoryValue + factoryValue*0.28;
		taxValue = factoryValue + factoryValue * 0.45;
		costumerValue = factoryValue + distributorValue + taxValue;
		
		System.out.println("Preço final do automóvel: R$" + costumerValue);
		
		scanner.close();
	}
}
