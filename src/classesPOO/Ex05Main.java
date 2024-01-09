package classesPOO;
/*
Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Ex05Main {

	public static void main(String[] args) {
		Ex05Scooter scooter = new Ex05Scooter();
		
		scooter.setColor("Vermelho");
		scooter.setSpeed(30);
		scooter.setWeight(15);
		
		System.out.println("O patinete tem a cor: " + scooter.getColor() 
				+ "\nvelocidade: " + scooter.getSpeed() 
				+ "\nPeso: " + scooter.getWeight());
	}

}
