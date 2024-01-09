package classesPOO;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Ex01Main {
	public static void main(String[]args) {
		Ex01Client client = new Ex01Client();
		
		client.setId(1); 
		client.setName("Andrey");
		client.email = "andrey@email";
		client.setWalletMoney(15.50);
		
		System.out.println("ID: " + client.Id + "\tNOME: " + client.name + "\tEMAIL: " + client.email);
		client.getWalletMoney();
	}
}
