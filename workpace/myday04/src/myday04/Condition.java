package myday04;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		String n1Msg="ù��° ����: ";
		String n2Msg="�ι�° ����: ";
		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		String bigNum1="";
		String bigNum2="";
		String equalsMsg="";
		//�ϰ�ó���� ���� ���� resultMsg
		String resultMsg="";
		
		System.out.print(n1Msg);
		num1=sc.nextInt();
		System.out.print(n2Msg);
		num2=sc.nextInt();
		
		bigNum1="ū ��: " +num1;
		bigNum2="ū ��: " +num2;
		equalsMsg="�� ���� �����ϴ�.";
		
		if(num1>num2) {
			resultMsg=bigNum1;
		}else if(num1<num2) {	//num1 != num2 �� ����. else�� �������� �����̶�, num1�� �� ũ�� �ʰ�! �μ��� ���� �ʴٸ� num2�� �� ū��.
			resultMsg=bigNum2;
		}else {
			resultMsg=equalsMsg;
		}
		System.out.println(resultMsg);
	}
}
