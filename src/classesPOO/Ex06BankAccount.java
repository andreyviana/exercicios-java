package classesPOO;

public class Ex06BankAccount {
	private String user;
	private double balance;

	public void setUser(String user) {
		this.user = user;
	}
	
	public void getUser() {
		System.out.println("Usuário: " + user);
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void getBalance() {
		System.out.println("Saldo bancário: " + balance);
	}
}
