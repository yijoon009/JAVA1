package myday10;
class Car{
	//브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	
	//기본생성자
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
		System.out.println("열쇠로 켬");
	}

	//시동 끄기
	void engineStop() {
		System.out.println("시동 끔");
	}
}

class SuperCar extends Car{
	String mode;

	public SuperCar(String brand, String color, int price, String mode) {
		//System.out.println("자식생성자 호출됨");	자식보다 부모가 항상 먼저 호출되어야 해서 super 밑에 적어야해
		super(brand, color, price);
		System.out.println("자식생성자 호출됨");
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		// 부모의 메소드 호출
		super.engineStart();	//열쇠로 시동 킴	/ 덮어씌우기 전 상황	/이건 syso 밑에 써도 돼. 부르든말든 지맘
		System.out.println("음성으로 시동 킴");	//+@ 한 상황
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");	//아예 재정의 한 상황
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
		SuperCar Ferrari=new SuperCar("Ferrari", "blue", 35000,"Daily");
		
		Ferrari.engineStart();
		Ferrari.engineStop();
	}
}
