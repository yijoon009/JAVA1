package myday09;

class A{
	/*
	 * �̷��� ���� �����ϸ� �̰� �⺻�����ڰ� ��.
	A(int num){
		System.out.println(num);
	}
	*/
	int data=100;
	
	int getData() {
		//this : ������ ��ü�� ������ �ִ� �ּҰ�.
		System.out.println(this);
		return data;	//return this.data	<<this�� �����Ȱ�
	}
}


public class ClassTest {
	public static void main(String[] args) {
		A obj=new A();	//��üȭ instance
		A obj2=new A();	//���� �����ľߵ�. A() �̰� ���������� ���.
		
		System.out.println(obj);
		System.out.println(obj2);
		
		obj2.data=400;
		System.out.println(obj.getData());
		System.out.println(obj2.getData());
		
	}
}
