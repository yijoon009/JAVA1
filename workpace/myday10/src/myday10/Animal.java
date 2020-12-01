package myday10;

public class Animal {
	String sound;
	public Animal() {;}
	
	
	public Animal(String sound) {
		super();
		this.sound = sound;
	}


	void getSound() {
		System.out.println(this.sound);
	}
}

//왜 항상 기본생성자랑 초기화생성자를 선언하는지