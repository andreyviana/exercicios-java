package herancaPolimorfismoCollection;

public class Ex01Dog extends Ex01Animal{
	@Override
	public void Action() {
		System.out.println("Cachorro correu");
	}
	
	@Override
	public void Sound() {
		System.out.println("Cachorro latiu");
	}
}
