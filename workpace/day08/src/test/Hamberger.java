package test;

import java.util.Scanner;

public class Hamberger {
	public static void main(String[] args) {
		Hamberger h = new Hamberger();
		h.info();
	}
	//간결화의 목적
	void info() {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		String menu = "1. 주문하기\n2. 배달요청\n3. 나가기";
		System.out.println("어서오세요 햄버거집입니다.");
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
			System.out.println("안녕히 가세요");
			break;
		}
	}
	void order(String menu) {
		System.out.println(menu+"를 주문합니다.");
	}
	void delivery(String menu) {
		System.out.println(menu+"를 배달합니다.");
	}
	
}








