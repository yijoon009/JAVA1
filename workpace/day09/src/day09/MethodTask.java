package day09;

import java.util.Random;
import java.util.Scanner;

public class MethodTask {
	
	//※ 선언 후 구현 시 사용하는 사람을 생각하며 개발한다.
		
	//5개의 정수를 입력받고 총 합을 구해주는 메소드
	int getTotal(int[] arData) {
		int total = 0;
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		return total;
	}
	
	//5개의 정수를 입력받고 총 합을 println으로 출력해주는 메소드
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










