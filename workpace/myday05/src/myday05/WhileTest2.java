package myday05;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {

		String qMsg = "Q.다음 중 동물이 아닌 것은?";
		String choiceMsg = "1.사자\n2.호랑이\n3.지우개\n4.토끼";
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int answer = 3;
		
		String resultMsg = "";
		
		//문자열은 절대로 ==으로 비교하지 않는다.
		//문자열 비교는 반드시 equals()를 사용한다.
		//예) 문자열.equals("문자열");
		//	두 문자열이 같으면 true, 다르면 false이다.
		while(!resultMsg.equals("정답!")) {
			System.out.println(qMsg + "\n" + choiceMsg);
			choice = sc.nextInt();
			
			if(choice == answer) {
				resultMsg = "정답!";
			}else if(choice >= 1 && choice <= 4) {
				resultMsg = "오답ㅠㅠ";
			}else {
				resultMsg = "?";
			}
			//일괄처리
			System.out.println(resultMsg);
		}
	}
}
