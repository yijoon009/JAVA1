package myday05;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
		String msg="1.��ſ�� ��ȸ\n2.�нǽŰ�\n3.�ܸ��� ��ݳ���\n0.���� ����";
		do {System.out.println(msg);
			choice=sc.nextInt();
			
			//if(choice==0) {break;}
		}while(choice!=0);
	}
}