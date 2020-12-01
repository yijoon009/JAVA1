package day09;


class Car{
	String brand;	//인스턴스 변수(객체)
	String color;	//인스턴스 변수(객체)
	int price;		//인스턴스 변수(객체)
	
	public Car() {;}
	
	//외부에서 전달받은 값으로 필드를 초기화한다.
	//this.필드명 : 해당 필드에 있는 저장공간
	//brand, color, price : 전달받은 값
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
		System.out.println(this.brand + " 시동 켜기");
	}
	
	void engineStop() {
		System.out.println(brand + " 시동 끄기");
	}
}

public class Road {
	public static void main(String[] args) {
		Car momCar = new Car("BMW", "BLUE", 15000);
		Car dadyCar = new Car("Black", 10000);
		Car myCar = new Car(30000);
		System.out.println(momCar.brand);
		
		//이렇게 사용하는 것은 잘못되었다.
//		momCar.brand = "BMW";
//		momCar.color = "BLUE";
//		momCar.price = 15000;
//		
//		dadyCar.brand = "Benz";
//		dadyCar.color = "Black";
//		dadyCar.p
		
	}
}















