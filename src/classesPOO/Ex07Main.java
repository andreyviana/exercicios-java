package classesPOO;

/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Ex07Main {

	public static void main(String[] args) {
		Ex07Patient patient = new Ex07Patient();
		
		patient.name = "Andrey Viana";
		patient.setDiagnosis("Curado");
		patient.setDischargeDays(3);
		
		System.out.println("O paciente: " + patient.name);
		patient.getDiagnosis();
		patient.getDischargeDays();
	}

}
