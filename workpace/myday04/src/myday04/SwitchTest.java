package myday04;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		//혈액형별 성격 테스트
		String msg="Q. 당신의 혈액형은?";
		String choiceMsg="1.A\n2.B\n3.O\n4.AB";
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		String a_msg="꼼꼼하고 세심하다.";
		String b_msg="추진력이 있다.";
		String o_msg="사교성이 좋다.";
		String ab_msg="착하다.";
		String resultMsg="";
		
		System.out.println(msg+"\n"+choiceMsg);
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			resultMsg=a_msg;
			break;	//가장 근접한 중괄호 탈출
		case 2:
			resultMsg=b_msg;
			break;
		case 3:
			resultMsg=o_msg;
			break;
		case 4:
			resultMsg=ab_msg;
			break;
		default:
			resultMsg="?";
		}
		System.out.println(resultMsg);
		
		
		
		
		
//		if(choice==1) {
//			//A형
//			resultMsg=a_msg;
//		}else if(choice==2) {
//			//B형
//			resultMsg=b_msg;
//		}else if(choice==3) {
//			//O형
//			resultMsg=o_msg;
//		}else if(choice==4) {
//			//AB형
//			resultMsg=ab_msg;
//		}else {
//			resultMsg="?";
//		}
//		System.out.println(resultMsg);
		
		
		
	}
}
