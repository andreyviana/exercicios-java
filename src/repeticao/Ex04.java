package repeticao;

import java.util.Random;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
O número de pessoas calmas;		Ok
O número de mulheres nervosas;	Ok
O número de homens agressivos;	OK
O número de outros calmos;	   	OK
O número de pessoas nervosas com mais de 40 anos OK;
O número de pessoas calmas com menos de 18 anos. OK*/

public class Ex04 {
	public static void main(String[] args) {
		int nervousFemale = 0, aggressiveMale = 0, calmAnother = 0, calmPerson = 0;
		int youngCalm = 0, elderlyNervous = 0;
		int gender, age, temperament, totalPerson = 0; 
		
		Random random = new Random();
		
		while(totalPerson != 150) {
			
			totalPerson++;
			
			age = random.nextInt(76);
			gender = random.nextInt(4);
			temperament = random.nextInt(4);
			
			if(temperament == 1) {
				calmPerson++;
				if(gender == 3) {
					calmAnother++;
				}
				if(age < 18) {
					youngCalm++;
				}
			}
			if(temperament == 2) {
				if(gender == 1) {
					nervousFemale++;
				}
				if(age > 40) {
					elderlyNervous++;
				}
			}
			if(temperament == 3 && gender == 2) {
				aggressiveMale++;
			}
		}
		
		System.out.println(
					"O número de pessoas calmas: " + calmPerson +
					"\nO número de mulheres nervosas: " + nervousFemale +
					"\nO número de homens agressivos: " + aggressiveMale +
					"\nO número de outros calmos: " + calmAnother +
					"\nO número de pessoas nervosas com mais de 40 anos: " + elderlyNervous +
					"\nO número de pessoas calmas com menos de 18 anos: " + youngCalm
				);
	}
}
