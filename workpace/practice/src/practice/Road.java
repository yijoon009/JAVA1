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
		System.out.println("����� �õ� Ŵ");
	}
	void engineStop() {
		System.out.println("�õ� ��");
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
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	
	void openRoof() {
		System.out.println("�Ѳ� ����");
	}
	
	void closeRoof() {
		System.out.println("�Ѳ� ����");
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












