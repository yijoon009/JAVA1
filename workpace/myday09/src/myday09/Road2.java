package myday09;

class Car2{
	//�ν��Ͻ� ����
	//�귣��, ����, ����
	String brand;
	String color;
	int price;
	boolean isOn;
	
	//������
	//�⺻������
	public Car2() {
	;
	}
	//�ʱ�ȭ ������(��� �ʵ�)

	public Car2(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	//�޼ҵ�
	//�õ� �ѱ�(�̹� �õ��� �����ִٸ� ��� �޼��� ���)
	boolean engineStart() {
		if(!isOn) {
			return true;
		}
		return false;
		
	}
	
	//�õ� ����(�̹� �õ��� �����ִٸ� ��� �޼��� ���)
	boolean engineStop() {
		if(isOn) {
			return true;
		}
		return false;
	}
}

public class Road2 {
	public static void main(String[] args) {
		Car2 myCar=new Car2();
		
	}
}
