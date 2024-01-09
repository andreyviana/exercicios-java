package lacoCondicional;

import java.util.Scanner;

/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variavel M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/

public class Ex01 {
	
	public static void main (String []args) {
		float P, E = 0f, M = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em quilos");
		P = scanner.nextFloat();
		
		if(P > 50) {
			E = P - 50;
			M = E*4;			
		}
		System.out.println("PESO (Kg)\tEXCESSO (Kg)\tMULTA (R$)\n" + P + "\t\t" + E + "\t\t" + M);
			
			
		scanner.close();
	}
}
