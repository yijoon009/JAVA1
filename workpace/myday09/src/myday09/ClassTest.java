package myday09;

class A{
	/*
	 * 이렇게 내가 선언하면 이게 기본생성자가 돼.
	A(int num){
		System.out.println(num);
	}
	*/
	int data=100;
	
	int getData() {
		//this : 접근한 객체가 가지고 있는 주소값.
		System.out.println(this);
		return data;	//return this.data	<<this가 생략된거
	}
}


public class ClassTest {
	public static void main(String[] args) {
		A obj=new A();	//객체화 instance
		A obj2=new A();	//원래 오류냐야돼. A() 이걸 선언한적이 없어서.
		
		System.out.println(obj);
		System.out.println(obj2);
		
		obj2.data=400;
		System.out.println(obj.getData());
		System.out.println(obj2.getData());
		
	}
}
