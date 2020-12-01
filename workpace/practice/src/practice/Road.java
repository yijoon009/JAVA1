package practice;
class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
	void engineStop() {
		System.out.println("½Ãµ¿ ²û");
	}
	
}

class SuperCar extends Car{
	String mode;
	public SuperCar() {;}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
	}
	
	@Override
	void engineStop() {
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ²û");
	}
	
	void openRoof() {
		System.out.println("¶Ñ²± ¿­¸²");
	}
	
	void closeRoof() {
		System.out.println("¶Ñ²± ´ÝÈû");
	}
	
}
public class Road {
	public static void main(String[] args) {
		SuperCar Ferrari = new SuperCar("Ferrari","blue",35000,"Daily");
		
		Ferrari.engineStart();
		Ferrari.engineStop();
		Ferrari.openRoof();
	}
}












