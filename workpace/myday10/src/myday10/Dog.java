package myday10;

public class Dog extends Animal {
	public Dog(String sound) {	//단축기 안써지면 내가 알아서 써야해
		super(sound);
	}
	
	
	void walk() {
		System.out.println("산책가요 주인님.");
	}
}
