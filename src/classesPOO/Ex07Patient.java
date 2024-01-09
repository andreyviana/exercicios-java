package classesPOO;

public class Ex07Patient {
	public String name;
	private String diagnosis;
	private int dischargeDays;
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public void getDiagnosis() {
		System.out.println("O diagnóstico é: " + diagnosis);
	}
	
	public void setDischargeDays(int dischargeDays) {
		this.dischargeDays = dischargeDays;
	}
	
	public void getDischargeDays() {
		System.out.println("O paciente receberá alta em: " + dischargeDays + " dias.");
	}
}
