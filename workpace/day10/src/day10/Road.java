package day10;

class Car{
	//�귣��, ����, ����
	String brand;
	String color;
	int price;
	
	//�⺻ ������
	public Car() {;}
	//�ʱ�ȭ ������
	public Car(String brand, String color, int price) {
		super();
		System.out.println("�θ� ������ ȣ���");
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//�õ��� ����� Ŵ, �� println���� ����ϱ�
	//�õ� �ѱ�
	void engineStart() {
		System.out.println("����� Ŵ");
	}
	//�õ� ����
	void engineStop() {
		System.out.println("����� ��");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		System.out.println("�ڽ� ������ ȣ���");
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
		//�θ��� �޼ҵ� ȣ��
		super.engineStart();
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
		SuperCar ferrari = new SuperCar("Ferrari", "RED", 35000, "Daily");
		
		ferrari.engineStart();
		ferrari.engineStop();
		
	}
}
















