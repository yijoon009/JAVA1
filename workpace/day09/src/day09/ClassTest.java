package day09;

class A{
	
	A(int num){
		System.out.println(num);
	}
	
	int data = 100;
	
	int getData() {
		//this : ������ ��ü�� ������ �ִ� �ּҰ�.
		System.out.println(this);
		return data;
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A obj = new A(10);
		A obj2 = new A(11);
		
		System.out.println(obj);
		System.out.println(obj2);
		
		obj2.data = 400;
		
		System.out.println(obj.getData());
		System.out.println(obj2.getData());
		
	}
}






