package classesPOO;

public class Ex01Client {
	public int Id;
	public String name;
	public String email;
	private double wallet;
	
	public void setId(int Id){
		this.Id = Id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWalletMoney(double money) {
		this.wallet = money;
	}
	
	public void getWalletMoney() {
		System.out.println("Dinheiro na carteira: R$" + this.wallet);
	}
	
}
