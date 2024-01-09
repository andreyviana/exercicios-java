package lacoCondicional;

import java.util.Scanner;

/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrario zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/

public class Ex02 {
	public static void main (String[] args) {
		int C, N, E = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de C e N respectivamente para código e número de horas de trabalho");
		C = scanner.nextInt();
		N = scanner.nextInt();
		
		if(N > 50) {
			E = (N - 50) * 20;
			N = N*10 + E;
		} else {
			N *= 10;
		}
		
		System.out.println("CÓDIGO\tSALÁRIO TOTAL\tSALÁRIO EXCEDENTE\n" + C + "\t" + N + "\t\t" + E);
		
		scanner.close();
		
	}
}
