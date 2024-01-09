package ProgramacaoSequencial;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo:

ax + by = c
dx + ey = f

pode ser resolvido segundo mostrado abaixo:

x = (ce-bf) / (ae-bd)
y = (af-cd) / (ae-bd)

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

public class Ex07 {
	
	public static void main(String[]args) {
		double a,b,c,d,e,f;
		double x,y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o coeficiente: a");
		a = scanner.nextDouble();
		System.out.println("Insira o coeficiente: b");
		b = scanner.nextDouble();
		System.out.println("Insira o coeficiente: c");
		c = scanner.nextDouble();
		System.out.println("Insira o coeficiente: d");
		d = scanner.nextDouble();
		System.out.println("Insira o coeficiente: e");
		e = scanner.nextDouble();
		System.out.println("Insira o coeficiente: f");
		f = scanner.nextDouble();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("X\tY\n" + x + "\t" + y);
		
		scanner.close();
	}
}
