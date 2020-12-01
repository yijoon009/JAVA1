package myday04;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		String n1Msg="첫번째 정수: ";
		String n2Msg="두번째 정수: ";
		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		String bigNum1="";
		String bigNum2="";
		String equalsMsg="";
		//일괄처리를 위한 변수 resultMsg
		String resultMsg="";
		
		System.out.print(n1Msg);
		num1=sc.nextInt();
		System.out.print(n2Msg);
		num2=sc.nextInt();
		
		bigNum1="큰 값: " +num1;
		bigNum2="큰 값: " +num2;
		equalsMsg="두 수는 같습니다.";
		
		if(num1>num2) {
			resultMsg=bigNum1;
		}else if(num1<num2) {	//num1 != num2 도 가능. else는 위에것이 거짓이라, num1이 더 크지 않고! 두수가 같지 않다면 num2가 더 큰값.
			resultMsg=bigNum2;
		}else {
			resultMsg=equalsMsg;
		}
		System.out.println(resultMsg);
	}
}
