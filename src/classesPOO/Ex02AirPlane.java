package classesPOO;

public class Ex02AirPlane {
	private double weight;
	private int lenght;
	private String pilotName;
	
	public void setPilotName(String name) {
		this.pilotName = name;
	}
	
	public void getPilotName() {
		System.out.println("O nome do piloto é: " + pilotName);
	}
	
	public void setAirPlaneWeight(double weight) {
		this.weight = weight;
	}
	
	public void getAirPlaneWeight() {
		System.out.println("O avião tem: " + this.weight + "Kg");
	}
	
	public void setAirPlaneSize(int lenght) {
		this.lenght = lenght;
	}
	
	public void getAirPlaneLenght() {
		System.out.println("O avião tem: " + this.lenght + " metros de comprimento");
	}
}
