package practice;
class Car2{
	String brand;
	String color;
	int price;
	boolean isOn;
	
	public Car2() {;}

	public Car2(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	boolean engineStart() {
		if(!isOn) {
			return true;
		}return false;
	}
	
	boolean engineStop() {
		if(isOn) {
			return true;
		}return false;
	}
	
	
}
public class day09road2 {
	public static void main(String[] args) {
		Car2 myCar=new Car2("Bentley","Blue",35000);
		
		if(myCar.engineStart()) {
			myCar.isOn=true;
			System.out.println("시동 켬");
		}else {
			System.out.println("이미 시동이 켜져있습니다.");
		}
		
		if(myCar.engineStop()) {
			myCar.isOn=false;
			System.out.println("시동 끔");
		}else {
			System.out.println("이미 시동이 꺼져있습니다.");
		}
	}
}













