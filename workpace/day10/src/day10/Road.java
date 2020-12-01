package day10;

class Car{
	//브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	
	//기본 생성자
	public Car() {;}
	//초기화 생성자
	public Car(String brand, String color, int price) {
		super();
		System.out.println("부모 생성자 호출됨");
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//시동은 열쇠로 킴, 끔 println으로 출력하기
	//시동 켜기
	void engineStart() {
		System.out.println("열쇠로 킴");
	}
	//시동 끄기
	void engineStop() {
		System.out.println("열쇠로 끔");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		System.out.println("자식 생성자 호출됨");
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
		//부모의 메소드 호출
		super.engineStart();
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
	void openRoof() {
		System.out.println("뚜껑 열림");
	}
	
	void closeRoof() {
		System.out.println("뚜껑 닫힘");
	}
}

public class Road {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "RED", 35000, "Daily");
		
		ferrari.engineStart();
		ferrari.engineStop();
		
	}
}
















