package classesPOO;
/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Ex06Main {

	public static void main(String[] args) {
		Ex06BankAccount bankAccount = new Ex06BankAccount();
		
		bankAccount.setUser("Andrey");
		bankAccount.setBalance(500);
		
		bankAccount.getUser();
		bankAccount.getBalance();
	}

}
