package classesPOO;
/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class Ex03Main {

	public static void main(String[] args) {
		Ex03ElectronicProduct product = new Ex03ElectronicProduct();
		
		product.name = "Celular 3000";
		product.type = "smartphone";
		product.setPrice(1200);
		
		System.out.println(product.name + " É um novo " + product.type + " sendo vendido por R$" + product.getPrice());
	}

}
