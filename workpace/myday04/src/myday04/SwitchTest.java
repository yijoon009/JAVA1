package myday04;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		//�������� ���� �׽�Ʈ
		String msg="Q. ����� ��������?";
		String choiceMsg="1.A\n2.B\n3.O\n4.AB";
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		String a_msg="�Ĳ��ϰ� �����ϴ�.";
		String b_msg="�������� �ִ�.";
		String o_msg="�米���� ����.";
		String ab_msg="���ϴ�.";
		String resultMsg="";
		
		System.out.println(msg+"\n"+choiceMsg);
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			resultMsg=a_msg;
			break;	//���� ������ �߰�ȣ Ż��
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
//			//A��
//			resultMsg=a_msg;
//		}else if(choice==2) {
//			//B��
//			resultMsg=b_msg;
//		}else if(choice==3) {
//			//O��
//			resultMsg=o_msg;
//		}else if(choice==4) {
//			//AB��
//			resultMsg=ab_msg;
//		}else {
//			resultMsg="?";
//		}
//		System.out.println(resultMsg);
		
		
		
	}
}