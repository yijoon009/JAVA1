package day09;

import java.util.Random;
import java.util.Scanner;

public class MethodTask {
	
	//�� ���� �� ���� �� ����ϴ� ����� �����ϸ� �����Ѵ�.
		
	//5���� ������ �Է¹ް� �� ���� �����ִ� �޼ҵ�
	int getTotal(int[] arData) {
		int total = 0;
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		return total;
	}
	
	//5���� ������ �Է¹ް� �� ���� println���� ������ִ� �޼ҵ�
	void printTotal(int[] arData){
		int total = 0;
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		String name = new String();
		new Scanner(System.in).next();
	}
}










