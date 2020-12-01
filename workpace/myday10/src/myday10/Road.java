package myday10;
class Car{
	//�귣��, ����, ����
	String brand;
	String color;
	int price;
	
	//�⺻������
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
		System.out.println("����� ��");
	}

	//�õ� ����
	void engineStop() {
		System.out.println("�õ� ��");
	}
}

class SuperCar extends Car{
	String mode;

	public SuperCar(String brand, String color, int price, String mode) {
		//System.out.println("�ڽĻ����� ȣ���");	�ڽĺ��� �θ� �׻� ���� ȣ��Ǿ�� �ؼ� super �ؿ� �������
		super(brand, color, price);
		System.out.println("�ڽĻ����� ȣ���");
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		// �θ��� �޼ҵ� ȣ��
		super.engineStart();	//����� �õ� Ŵ	/ ������ �� ��Ȳ	/�̰� syso �ؿ� �ᵵ ��. �θ��縻�� ����
		System.out.println("�������� �õ� Ŵ");	//+@ �� ��Ȳ
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");	//�ƿ� ������ �� ��Ȳ
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
		SuperCar Ferrari=new SuperCar("Ferrari", "blue", 35000,"Daily");
		
		Ferrari.engineStart();
		Ferrari.engineStop();
	}
}
