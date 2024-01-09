package lacoCondicional;

import java.util.Scanner;

/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.*/

public class Ex05 {
	public static void main(String[] args) {
		double x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nível de poluição");
		x = scanner.nextDouble();
		
		if(x >= 0.5) {
			System.out.println("Todos os grupos devem paralisar suas atividades");
		} else if(x >= 0.4){
			System.out.println("1º e 2 grupo de indústrias devem suspender as atividades");
		} else if(x >= 0.3) {
			System.out.println("1º grupo de indústrias deve suspender as atividades");
		} else {
			System.out.println("Nível de poluiçao aceitável");
		}
		
		scanner.close();
	}
}
