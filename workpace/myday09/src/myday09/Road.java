package myday09;

class Car{
	String brand;	//���� �ν��Ͻ�����=��ü
	String color;	
	int price;

	//�ܺο��� ���޹��� ������ �ʵ带 �ʱ�ȭ�Ѵ�.
	//this.�ʵ��: �ش� �ʵ忡 �ִ� �������
	//brand, color, price: ���޹��� ��
	//������ ���� �̿��ؼ� ������ ���� �� �־�.
	
	//�⺻�����ڴ� C������ ctrl + spacepar
//	public Car() {
//		
//	}
	
	//������ ������ ����� alt+Shift+s, o
	
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
		System.out.println(this.brand+"�õ� �ѱ�");
	}
	

	void engineStop() {
		System.out.println(this.brand+"�õ� ����");
	}
}

public class Road {
	public static void main(String[] args) {
		Car momCar = new Car("BMW","BLUE",15000);
		Car dadyCar = new Car("Black",10000);
		Car myCar = new Car(30000);
		
		
		
		
		
		//�̷��Ÿ� Ŭ���� �ֽ�?
		//�̷��� ����ϴ� ���� �߸��Ǿ���.
//		momCar.brand="BMW";
//		momCar.color="BLUE";
//		momCar.price=15000;
//		
//		dadyCar.brand="Benz";
//		dadyCar.color="BLACK";
//		dadyCar.price=15000;
	}
}
