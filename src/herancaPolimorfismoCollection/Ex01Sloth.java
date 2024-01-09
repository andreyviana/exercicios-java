package herancaPolimorfismoCollection;

public class Ex01Sloth extends Ex01Animal implements Ex01AnimalInterface{
	@Override
	public void Sound() {
		System.out.println("Preguiça fez barulho");
	}
	
	@Override
	public void Action() {
		System.out.println("Preguiça subiu a árvore");
	}

	@Override
	public void getName(){
		System.out.println(this.name);
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void getAge() {
		System.out.println(this.age);
	}
	
	
}
