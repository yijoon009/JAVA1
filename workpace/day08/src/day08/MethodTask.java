package day08;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
//		m.print1_10();
		m.changeToKor(1024);
	}
//		1~10까지 출력하는 메소드
	void print1_10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
//		1~10까지의 합 출력하는 메소드
	void sum1_10() {
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
//		-----------------
//		1~n 까지의 합 구하는 메소드
	int sum1_n(int n) {
		int sum=0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
//		두 정수의 나눗셈 메소드
	double div(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return -1;
		}
		return (num1+0.0)/num2;
	}
//		-----------------
//		소문자를 대문자로 바꿔주는 메소드
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
//		입력한 문자열을 반대로 출력하는 메소드
	void reverse(String msg) {
		String result="";
		for (int i = msg.length()-1; i >= 0; i--) {
			result+=msg.charAt(i);
		}
		System.out.println(result);
	}
//		정수를 한글로 바꿔주는 메소드(1024 -> 일공이사)
//	void changeToKor(int num) {
//		String data = num+"";
//		String hangle="공일이삼사오육칠팔구"; //hangle.charAt(i)
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
		String hangle="공일이삼사오육칠팔구";
		String result="";
		//'0'-48 => 0
		//'1'-48 => 1
		for (int i = 0; i < data.length(); i++) {
			result+=hangle.charAt(data.charAt(i)-'0');
		}
		System.out.println(result);
	}
}












