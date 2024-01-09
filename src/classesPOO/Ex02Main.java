package classesPOO;

public class Ex02Main {
	public static void main(String[]args) {
		Ex02AirPlane airplane = new Ex02AirPlane();
		
		airplane.setAirPlaneSize(30);
		airplane.setAirPlaneWeight(27.336);
		airplane.setPilotName("Andrey Viana");
		
		airplane.getPilotName();
		airplane.getAirPlaneLenght();
		airplane.getAirPlaneWeight();
	}
}
