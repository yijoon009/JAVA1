package day08;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
//		m.print1_10();
		m.changeToKor(1024);
	}
//		1~10���� ����ϴ� �޼ҵ�
	void print1_10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
//		1~10������ �� ����ϴ� �޼ҵ�
	void sum1_10() {
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
//		-----------------
//		1~n ������ �� ���ϴ� �޼ҵ�
	int sum1_n(int n) {
		int sum=0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
//		�� ������ ������ �޼ҵ�
	double div(int num1, int num2) {
		if(num2==0) {
			System.out.println("0���� ������ �����ϴ�.");
			return -1;
		}
		return (num1+0.0)/num2;
	}
//		-----------------
//		�ҹ��ڸ� �빮�ڷ� �ٲ��ִ� �޼ҵ�
	String changeUpper(String msg) {
		int length=msg.length();
		String result="";
		for (int i = 0; i < length; i++) {
			char ch = msg.charAt(i);
			if('z'>=ch && ch>='a') {
				result+=(char)(ch-32);
			}else {
				result+=ch;
			}
		}
		return result;
	}
//		�Է��� ���ڿ��� �ݴ�� ����ϴ� �޼ҵ�
	void reverse(String msg) {
		String result="";
		for (int i = msg.length()-1; i >= 0; i--) {
			result+=msg.charAt(i);
		}
		System.out.println(result);
	}
//		������ �ѱ۷� �ٲ��ִ� �޼ҵ�(1024 -> �ϰ��̻�)
//	void changeToKor(int num) {
//		String data = num+"";
//		String hangle="�����̻�����ĥ�ȱ�"; //hangle.charAt(i)
//		String result="";
//		int length = data.length();
//		//1024 / 10 : 102
//		//1024 % 10 : 4
//		//102 / 10 : 10
//		//102 % 10 : 2
//		while(num!=0) {
//			result+=hangle.charAt(num%10);
//			num/=10;
//		}
//		reverse(result);
//	}
	void changeToKor(int num) {
		String data = num+"";
		String hangle="�����̻�����ĥ�ȱ�";
		String result="";
		//'0'-48 => 0
		//'1'-48 => 1
		for (int i = 0; i < data.length(); i++) {
			result+=hangle.charAt(data.charAt(i)-'0');
		}
		System.out.println(result);
	}
}












