package day09;


class Car{
	String brand;	//�ν��Ͻ� ����(��ü)
	String color;	//�ν��Ͻ� ����(��ü)
	int price;		//�ν��Ͻ� ����(��ü)
	
	public Car() {;}
	
	//�ܺο��� ���޹��� ������ �ʵ带 �ʱ�ȭ�Ѵ�.
	//this.�ʵ�� : �ش� �ʵ忡 �ִ� �������
	//brand, color, price : ���޹��� ��
	//alt + shift + s, o
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public Car(int price) {
		this.price = price;
	}

	void engineStart() {
		System.out.println(this.brand + " �õ� �ѱ�");
	}
	
	void engineStop() {
		System.out.println(brand + " �õ� ����");
	}
}

public class Road {
	public static void main(String[] args) {
		Car momCar = new Car("BMW", "BLUE", 15000);
		Car dadyCar = new Car("Black", 10000);
		Car myCar = new Car(30000);
		System.out.println(momCar.brand);
		
		//�̷��� ����ϴ� ���� �߸��Ǿ���.
//		momCar.brand = "BMW";
//		momCar.color = "BLUE";
//		momCar.price = 15000;
//		
//		dadyCar.brand = "Benz";
//		dadyCar.color = "Black";
//		dadyCar.p
		
	}
}














