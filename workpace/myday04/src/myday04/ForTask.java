package myday04;

public class ForTask {
	public static void main(String[] args) {
		//100~1까지 출력하기
//		for(int i=100;i>0;i--) {
//			System.out.print(i+" ");
//		}
		
		//1~100까지 중 짝수만 출력하기
//		for(int j=1;j<=100;j++) {
//			if(j%2==0) {
//				System.out.print(j+" ");
//			}
//		}
		
		//1~10까지의 합 구하기
//		int count=0;
//		for(int i=1;i<=10;i++) {
//			count+=i;
//		}
//		System.out.println(count);
		
		//A~F까지 출력하기
//		for(char x='A';x<='F';x++) {
//			System.out.println(x);
//		}
		
		
		//A~F까지 중 C 제외하고 출력하기
//		for(char x='A';x<='F';x++) {
//			if(x==67) {
//				continue;
//			}
//			System.out.println(x);
//		}
		
		//aBcDeFgH...출력하기
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
		
		
		
		//0 1 2 0 1 2 0 1 2 출력하기(% 모듈러스 사용하기)
		//%: 나머지 연산자
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
