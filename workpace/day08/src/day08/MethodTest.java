package day08;

import java.util.Scanner;

public class MethodTest {
	//static : �����Ͻ� �޸𸮿� ���� ���� �ö�
	public static void main(String[] args) {
		//f(x)=2x+1
//		Scanner sc=new Scanner(System.in);
		MethodTest m = new MethodTest();
//		System.out.println(m.f(3));
//		m.sayHi(7);
//		m.sum(10, 3);
//		m.printMsg("JAVA ����־�~~",5);
		myPrint();
	}
	static void myPrint() {
		System.out.println("static �޼ҵ� �Դϴ�.");
	}
	void printMsg(String msg,int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(msg);
		}
	}
	int f(int x) {
		return x*2+1;
	}
//	void sayHi() {
//		System.out.println("����");
//	}
	void sayHi(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("����");
		}
	}
	void sum(int num1,int num2) {
		int result = num1+num2;
		System.out.println(result);
	}
}













