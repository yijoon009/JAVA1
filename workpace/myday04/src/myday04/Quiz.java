package myday04;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		String q_Msg="다음 중 동물이 아닌것은?";
		String choiceMsg="1.사자\n2.호랑이\n3.지우개\n4.토끼\n"
				+ "정답 사이에 공백을 넣어 입력해주세요. 예: 1 3";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(q_Msg+"\n"+choiceMsg);
		int choice1=0;
		int choice2=0;
		String corMsg="정답입니다.";
		String wrongMsg="오답입니다.";
		String errorMsg="다시 입력해주세요.";
		String resultMsg="";
		
			

	
		
		choice1=Integer.parseInt(sc.next());
		choice2=Integer.parseInt(sc.next());
		
		if(choice1==1||choice1==3) {
			
		}
		
		
		
		
		
	}
}
