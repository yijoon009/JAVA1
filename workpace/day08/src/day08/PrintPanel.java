package day08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrintPanel {
	public static void main(String[] args) {
		String msg="";
		int num=0;
		PrintPanel p = new PrintPanel();
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 문자열 : ");
		msg=sc.next();
		System.out.print("출력할 횟수 : ");
		num=sc.nextInt();
		System.out.println(num);
		
		JOptionPane.showMessageDialog(null, p.myPrint(msg,num));
		
	}
	String myPrint(String msg,int num) {
		String result="";
		for (int i = 0; i < num; i++) {
			result+=msg+"\n";
		}
		return result;
	}
}









