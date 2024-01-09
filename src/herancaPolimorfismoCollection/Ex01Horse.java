package herancaPolimorfismoCollection;

public class Ex01Horse extends Ex01Animal{
	@Override
	public void Sound() {
		System.out.println("Cavalo relinchou");
	}
	
	@Override
	public void Action() {
		System.out.println("Cavalo correu");
	}
}
