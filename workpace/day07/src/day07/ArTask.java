package day07;

import java.util.Random;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[�ʱ�]
		//100~1���� �迭�� ��� ����ϱ�
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 100 - i;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//1~100���� �� ¦���� �迭�� ��� ����ϱ�
//		int[] arData = new int[50];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (i+1) * 2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		//1~10���� �迭�� ��� �� �� ���ϱ�
//		int[] arData = new int[10];
//		int total = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
////			total += arData[i];
//			total = total + arData[i];
//			//total = 0 + 1
//			//total = (0+1) + 2
//			//total = (0+1+2) + 3
//			//total = (0+1+2+3) + 4
//			
//		}
//		System.out.println(total);
		
		//1~n���� �迭�� ��� �� �� ���ϱ�
//		Scanner sc = new Scanner(System.in);
//		int[] arData = null;
//		int total = 0;
//		
//		System.out.print("1~n������ ��\nn �� : ");
//		arData = new int[sc.nextInt()];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			total += arData[i];
//		}
//		System.out.println(total);
		
		//A~F���� �迭�� ��� ����ϱ�
		//A : 65
		//B : 66
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//��Ÿ����.
//		char[] arData = {'A', 'B', 'C', 'D', 'F'};
//		for (int i = 0; i < arData.length; i++) {
//			arData
//		}
		//A~F���� �� C�����ϰ� �迭�� ���� �� ����ϱ�
//		char[] arData = new char[5];
		
		//A : 65	0
		//B : 66	1
		//C : 67	2
		//D : 68	3
		//E : 69	4
//		int temp = 0;
//		for (int i = 0; i < arData.length; i++) {
//			temp = i;
//			if(i > 1) {
//				temp++;
//			}
//			arData[i] = (char)(temp+65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
		//[�߱�]
		//aBcDeF.....Z �迭�� ��� ����ϱ�
//		char[] arData = new char[26];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i % 2 == 0 ? 97 + i : 65 + i); 
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i]);
//		}
		
		//5���� ������ �Է¹ް� �ִ밪�� �ּҰ� ����ϱ�
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		int max = 0;
//		int min = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "��° ���� : ");
//			arData[i] = sc.nextInt();
//		}
//		
//		max = arData[0];
//		min = arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {max = arData[i];}
//			if(min > arData[i]) {min = arData[i];}
//		}
//		
//		System.out.println("�ִ밪 : " + max);
//		System.out.println("�ּҰ� : " + min);
		
		//����ڰ� �Է��� �� ��ŭ ������ �Է¹ް� �迭�� ���� �� 3�� ����� ����ϱ�
//		int[] arData = null;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�Է��� ������ ���� : ");
//		arData = new int[sc.nextInt()];
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "��° ���� : ");
//			arData[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 3 == 0) {
//				System.out.println(arData[i]);
//			}
//		}
			
		
		//���ڿ��� �Է¹ް� �ҹ��ڸ� �빮�ڷ� �ٲٱ�
//		Scanner sc = new Scanner(System.in);
		//���ڿ� ���� null�� �ʱ�ȭ�� ������ �Ʒ����� ���� �����ڸ� ����Ѵٴ� �ǹ��̴�.
//		String str = null;
		//���ڿ� ���� ""�� �ʱ�ȭ�� ������ �Ʒ����� ���������� ����ϰڴٴ� �ǹ��̴�.
		//null�̶�� ���� ���̱� ������ ������ �ϸ� null�� ����Ǽ� ���Ǳ� ������
		//�������� �°� �ʱ�ȭ���־�� �Ѵ�.
		
//		String result = "";
//		
//		System.out.print("���ڿ� : ");
//		str = sc.next();
//
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(c >= 97 && c <= 122) {
//				//�ҹ���
//				result += (char)(c - 32);
//			}else {
//				result += c;
//			}
//		}
//		System.out.println(result);
		
		//[����]
		//90%Ȯ���� ���� ����ϰ� 10%Ȯ���� ��÷�� ����ϱ�
		//Ȯ���� ������ 10�̶��, 10ĭ �迭�� �����Ѵ�.
		//��� 0���� �ʱ�ȭ�� �� ���ϴ� Ȯ�� / 10 ��ŭ 1�� �������ش�.
		//������ �ε��� ��ȣ�� �����Ͽ� ���� ������ ���� ��
		//0�� ������ 100 - ���ϴ� Ȯ��,
		//1�� ������ ���ϴ� Ȯ���� ������ �ȴ�.
		Random r = new Random();
		int[] arData = new int[10];
		int idx = r.nextInt(arData.length);
		int rating = 1;
		for (int i = 0; i < rating; i++) {
			arData[i] = 1;
		}
		
		System.out.println(arData[idx] == 1 ? "��÷" : "��");
		
		//������ �ѱ۷� �����ϱ�	1024 -> �ϰ��̻�
		
//[1]
		String hangle = "�����̻�����ĥ�ȱ�";
		String result = "";

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("���� : ");
		num = sc.nextInt();
		
		while(num != 0) {
			result = hangle.charAt(num % 10) + result;
			num /= 10;
		}
		System.out.println(result);
		
//[2]
		String hangle = "�����̻�����ĥ�ȱ�";
		String data = null;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		data = sc.nextInt() + "";
		
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		System.out.println(result);
		
		//�ѱ��� ������ �����ϱ�	�ϰ��̻� -> 1024
		Scanner sc = new Scanner(System.in);
		String result = "";
		String hangle_org = "�����̻�����ĥ�ȱ�";
		String hangle = null;
		
		System.out.print("�ѱ� : ");
		hangle = sc.next();
		
		for (int i = 0; i < hangle.length(); i++) {
			result += hangle_org.indexOf(hangle.charAt(i));
		}
		System.out.println(result);
	}
}













