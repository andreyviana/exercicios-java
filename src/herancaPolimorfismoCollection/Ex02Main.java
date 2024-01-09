package herancaPolimorfismoCollection;

import java.util.ArrayList;
import java.util.Scanner;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class Ex02Main {
	public static void main(String[] args) {
		int action, productPrice, productId;
		boolean isRunning = true;
		String productName;
		
		ArrayList<Ex02Product> stock = new ArrayList<Ex02Product>();
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println(
				"\nDigite o número da ação: "
				+ "\n1- Adicionar produto"
				+ "\t2- Deletar produto"
				+ "\n3- Atualizar produto"
				+ "\t4- Listar produtos"
				+ "\n5- Encerrar programa\n"
			);
			action = scanner.nextInt();
			
			scanner.nextLine();
			
			switch(action) {
				case(1): 
					System.out.println("Digite o nome e o preço do produto respectivamente");
					productName = scanner.nextLine();
					productPrice = scanner.nextInt();
					stock.add(new Ex02Product(productName, productPrice));
				break;
				case(2):
					System.out.println("Digite o índice do produto que vai ser deletado");
					stock.remove(scanner.nextInt());
				break;
				case(3):
					System.out.println("Digite o índice do produto, o novo nome e o novo preço respectivamente");
					productId = scanner.nextInt();
					scanner.nextLine();
					productName = scanner.nextLine();
					productPrice = scanner.nextInt();
					
					stock.get(productId).setName(productName);
					stock.get(productId).setPrice(productPrice);
				break;
				case(4):
					for(int i = 0; i < stock.size(); i++) {
						System.out.println("ÍNDICE: " + i + " | NOME: " + stock.get(i).name + " | PREÇO: " + stock.get(i).price);
					}
				break;
				case(5):
					System.out.println("Programa encerrado.");
					isRunning = false;
				break;
				default:
					System.out.println("Digite um valor válido");
				break;
			}
		} while(isRunning);
		
		
		
		scanner.close();
	}
}
