package day08;

public class TestClass {
	public static void main(String[] args) {
//		int data=10;
		int[] data = {10};
		TestClass t = new TestClass();
		t.method(data);
		System.out.println(data[0]);
	}
	void method(int[] data) {
		data[0]=100;
	}
}
