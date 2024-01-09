package classesPOO;
/*Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Ex04Main {

	public static void main(String[] args) {
		Ex04Employee employee = new Ex04Employee();
		
		employee.setName("Andrey");
		employee.setOffice("Desenvolvedor");
		employee.setWage(3700.50);
		
		System.out.println("O empregado " + employee.getName() + " Trabalha como " 
				+ employee.getOffice() + " e ganha R$" + employee.getWage());
	}

}
