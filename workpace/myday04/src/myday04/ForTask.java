package myday04;

public class ForTask {
	public static void main(String[] args) {
		//100~1���� ����ϱ�
//		for(int i=100;i>0;i--) {
//			System.out.print(i+" ");
//		}
		
		//1~100���� �� ¦���� ����ϱ�
//		for(int j=1;j<=100;j++) {
//			if(j%2==0) {
//				System.out.print(j+" ");
//			}
//		}
		
		//1~10������ �� ���ϱ�
//		int count=0;
//		for(int i=1;i<=10;i++) {
//			count+=i;
//		}
//		System.out.println(count);
		
		//A~F���� ����ϱ�
//		for(char x='A';x<='F';x++) {
//			System.out.println(x);
//		}
		
		
		//A~F���� �� C �����ϰ� ����ϱ�
//		for(char x='A';x<='F';x++) {
//			if(x==67) {
//				continue;
//			}
//			System.out.println(x);
//		}
		
		//aBcDeFgH...����ϱ�
//		for(char x='A';x<='Z';x++) {
//			if(x%2==1) {
//				x+=32;	
//				System.out.print(x+" ");
//				x-=32;
//			}
//			else {
//				System.out.print(x+" ");
//			}
//			
//		}
		
		
		
		//0 1 2 0 1 2 0 1 2 ����ϱ�(% ��ⷯ�� ����ϱ�)
		//%: ������ ������
		//10 / 3 == 3
		//10 % 3 == 1
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(j%3+" ");
//			}
//		}
		
		for(int k=0;k<9;k++) {
			System.out.print(k%3+" ");
		}
		
		
	}
}