package day10;

public class Animal {
	
	String sound;
	
	public Animal() {}
	
	public Animal(String sound) {
		super();
		this.sound = sound;
	}
	void getSound() {
		System.out.println(this.sound);
	}
}
