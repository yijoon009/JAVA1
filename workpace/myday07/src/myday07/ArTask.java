package myday07;

import java.util.Random;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[�ʱ�]
		//100~1���� �迭�� ��� ����ϱ�
//		int[] arData = new int[100];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=100-i;
//		}
//		//�ְ� ����ϴ°� �и��ص� �ȴ�.
//		for(int i=0;i<arData.length;i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//1~100���� �� ¦���� �迭�� ��� ����ϱ�
//		int[] arData=new int[50];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=(i+1)*2;
//		}
//		for(int i=0;i<arData.length;i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//1~10���� �迭�� ��� �� �� ���ϱ�
//		int[] arData=new int[10];
//		int total=0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=i+1;
//			total+=arData[i];
//		}
//		System.out.println(total);
		
		
		// 1~n���� �迭�� ��� �� �� ���ϱ�
		//��
		/*
		 * int a=0;
		 * double b=0.0;
		 * char c=' ';
		 * String d=null;
		 */
//		Scanner sc=new Scanner(System.in);
//		int[] arData=null;
//		//String s=null;	//�ּ��� �ʱ�ȭ�� null�̴�. � �ּҰ��� ������ �𸦶��� null�̶�� �ʱⰪ�� �ִ´�.
//		int total=0;
//		
//		System.out.println("1~n������ ��\nn��: ");
//		arData = new int[sc.nextInt()];	//new ~ ]; �� ��°�ΰ� �ּҰ�
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=i+1;
//			total+=arData[i];
//		}
//		System.out.println(total);
		
		//�����Ѱ�
//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		System.out.println("���� �Է�: ");
//		num=sc.nextInt();
//		
//		int[] arData=new int[num];
//		int total=0;
//		for(int i=0;i<num;i++) {
//			arData[i]=i+1;
//			total+=arData[i];
//			System.out.println(arData[i]);
//		}
//		System.out.println(total);
		
		
		
		//A~F���� �迭�� ��� ����ϱ�
//		char[] arData=new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=(char)(i+65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			
//			System.out.println(arData[i]);
//		}
		
		
		//A~F���� �� C�����ϰ� �迭�� ���� �� ����ϱ�
		//��1
//		int tmp=0;
//		char[] arData = new char[5];
//		for (int i = 0; i < arData.length; i++) {
//			tmp=i;
//			if(i>1) {
//				tmp++;
//			}
//			arData[i]=(char)(tmp+65);
//		}
//		for (int j = 0; j < arData.length; j++) {
//			System.out.println(arData[j]);
//		}
		
		//��2
//		for (int i = 0; i < args.length; i++) {
//			arData[i]=(char)(i>1?66+i:65+i);
//		}
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//[�߱�]
		//aBcDeF.....Z �迭�� ��� ����ϱ�
//		char[] arData=new char[26];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=(char)(i%2==0?97+i:65+i);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//5���� ������ �Է¹ް� �ִ밪�� �ּҰ� ����ϱ�
//		Scanner sc=new Scanner(System.in);
//		int[] arData=new int[5];
//		
//		int max=0;
//		int min=0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i+1+"��° ����:");
//			arData[i]=sc.nextInt();
//		}
//		max=arData[0];
//		min=arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max<arData[i]) {
//				max=arData[i];
//			}
//			if(min>arData[i]) {
//				min=arData[i];
//			}
//		}
//		System.out.println("�ִ�: "+max);
//		System.out.println("�ּҰ�: "+min);
		
		
		//����ڰ� �Է��� �� ��ŭ ������ �Է¹ް� �迭�� ���� �� 3�� ����� ����ϱ�
//		Scanner sc=new Scanner(System.in);
//		int[] arData=null;
//		
//		System.out.println("�Է��� ������ ����: ");
//		arData=new int[sc.nextInt()];
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i+1+"���� ����: ");
//			arData[i]=sc.nextInt();
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i]%3==0) {
//				System.out.println(arData[i]);
//			}
//		}
		
		
		//���ڿ��� �Է¹ް� �ҹ��ڸ� �빮�ڷ� �ٲٱ�
//		Scanner sc=new Scanner(System.in);
//		String str=null;
//		String result="";
//		
//		System.out.print("���ڿ�: ");
//		str=sc.next();
//		for (int i = 0; i < str.length(); i++) {	//String�� Ŭ�������� str�� ���̸� �˷��� �޼ҵ� �����. str.length()
//			char c=str.charAt(i);	//str.charAt(i)�̰� ��ü�� ���ڰ�
//			if(c >=97 &&c<=122) {	
//				//�ҹ���
//				result+=(char)(c-32);	//����+����=����
//			}else {
//				result+=c;
//			}
//		}
//		System.out.println(result);
		
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		
		
		//[���]
		//90%Ȯ���� ���� ����ϰ� 10%Ȯ���� ��÷�� ����ϱ�
		//Ȯ���� ������ 10�̶��, 10ĭ �迭�� �����Ѵ�.
		//��� 0���� �ʱ�ȭ�� �� ���ϴ� Ȯ�� / 10��ŭ 1�� �������ش�
		//������ �ε��� ��ȭ�� �����Ͽ� ���� ������ ������
		//0�� ������ 100 - ���ϴ� Ȯ��,
		//1�� ������ ���ϴ� Ȯ���� ������ �ȴ�.
		
//		Random r=new Random();
//		int[] arData=new int[10];
//		int idx=r.nextInt(arData.length);	//0~9�ε��� �����ϱ� �迭 ũ�⸸ŭ
//		
//		int rating=1;	//10%��� ��							???????????????????????????
//		for (int i = 0; i < rating; i++) {
//			arData[i]=1;
//		}
//		System.out.println(arData[idx]==1?"��÷":"��");
		
		
		//������ �ѱ۷� �����ϱ�	1024 -> �ϰ��̻�
		//��1
//		String hangle="�����̻�����ĥ�ȱ�";
//		String result="";
//		
//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		
//		System.out.print("����: ");
//		num=sc.nextInt();
//		while(num!=0) {
//			result=hangle.charAt(num%10)+result;	//result+=hangle.charAt(num) �ϸ� 1024 ���̰��� �̷��� �پ 
//													//�¿��� �� ������ �°� �ڿ� +result ���
//			num/=10;
//		}
//		System.out.println(result);
		
		
		//��2
//		String hangle="�����̻�����ĥ�ȱ�";
//		St
		
		
		
		//�ѱ��� ������ �����ϱ�	�ϰ��̻� -> 1024
		
		
	}
}
