package myday09;

class Car2{
	//인스턴스 변수
	//브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	boolean isOn;
	
	//생성자
	//기본생성자
	public Car2() {
	;
	}
	//초기화 생성자(모든 필드)

	public Car2(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	//메소드
	//시동 켜기(이미 시동이 켜져있다면 경고 메세지 출력)
	boolean engineStart() {
		if(!isOn) {
			return true;
		}
		return false;
		
	}
	
	//시동 끄기(이미 시동이 꺼져있다면 경고 메세지 출력)
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
