package test;

import java.util.Scanner;

public class Hamberger {
	public static void main(String[] args) {
		Hamberger h = new Hamberger();
		h.info();
	}
	//����ȭ�� ����
	void info() {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		String menu = "1. �ֹ��ϱ�\n2. ��޿�û\n3. ������";
		System.out.println("������� �ܹ������Դϴ�.");
		System.out.println(menu);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			order(sc.next());
			break;
		case 2:
			delivery(sc.next());
			break;
		case 3:
			System.out.println("�ȳ��� ������");
			break;
		}
	}
	void order(String menu) {
		System.out.println(menu+"�� �ֹ��մϴ�.");
	}
	void delivery(String menu) {
		System.out.println(menu+"�� ����մϴ�.");
	}
	
}








