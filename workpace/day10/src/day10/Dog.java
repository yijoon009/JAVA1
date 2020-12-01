package day10;

public class Dog extends Animal{
	public Dog(String sound) {
		super(sound);
	}
	
	void walk() {
		System.out.println("산책가요 주인님.");
	}
	
}
