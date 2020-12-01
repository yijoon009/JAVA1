package myday09;

class Car{
	String brand;	//전부 인스턴스변수=객체
	String color;	
	int price;

	//외부에서 전달받은 값으로 필드를 초기화한다.
	//this.필드명: 해당 필드에 있는 저장공간
	//brand, color, price: 전달받은 값
	//다형성 성질 이용해서 여러개 만들 수 있어.
	
	//기본생성자는 C누르고 ctrl + spacepar
//	public Car() {
//		
//	}
	
	//생성자 빠르게 만들기 alt+Shift+s, o
	
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
		System.out.println(this.brand+"시동 켜기");
	}
	

	void engineStop() {
		System.out.println(this.brand+"시동 끄기");
	}
}

public class Road {
	public static void main(String[] args) {
		Car momCar = new Car("BMW","BLUE",15000);
		Car dadyCar = new Car("Black",10000);
		Car myCar = new Car(30000);
		
		
		
		
		
		//이럴거면 클래스 왜써?
		//이렇게 사용하는 것은 잘못되었따.
//		momCar.brand="BMW";
//		momCar.color="BLUE";
//		momCar.price=15000;
//		
//		dadyCar.brand="Benz";
//		dadyCar.color="BLACK";
//		dadyCar.price=15000;
	}
}
