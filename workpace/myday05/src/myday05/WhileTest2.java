package myday05;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {

		String qMsg = "Q.���� �� ������ �ƴ� ����?";
		String choiceMsg = "1.����\n2.ȣ����\n3.���찳\n4.�䳢";
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int answer = 3;
		
		String resultMsg = "";
		
		//���ڿ��� ����� ==���� ������ �ʴ´�.
		//���ڿ� �񱳴� �ݵ�� equals()�� ����Ѵ�.
		//��) ���ڿ�.equals("���ڿ�");
		//	�� ���ڿ��� ������ true, �ٸ��� false�̴�.
		while(!resultMsg.equals("����!")) {
			System.out.println(qMsg + "\n" + choiceMsg);
			choice = sc.nextInt();
			
			if(choice == answer) {
				resultMsg = "����!";
			}else if(choice >= 1 && choice <= 4) {
				resultMsg = "����Ф�";
			}else {
				resultMsg = "?";
			}
			//�ϰ�ó��
			System.out.println(resultMsg);
		}
	}
}
