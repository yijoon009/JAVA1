package daks;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		//닥스 회장
		//강남점 홍대점 신촌점
		//일반
		//키즈
		//
		//각 지점별 총 매출액, 평균 매출액
		//각 연령별 총 매출액, 평균 매출액
		//닥스 총 매출액, 평균 매출액
		//
		//닥스 평균 매출액보다 높은 매출액 매장은 인센티브 매장으로 출력
		
		String[] arBranch= {"강남점","홍대점","신촌점"};
		String[] arAge= {"일반","키즈"};
		
		int[][] arrIncome=new int[arBranch.length][arAge.length];
		int length=0;
		
		int[] arBranchTotal=new int[3];
		int[] arAgeAvg=new int[2];
		
		int total=0;
		double avg=0.0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arrIncome.length;i++) {
			length +=arrIncome[i].length;			//이 줄이 무슨 의미인지 모르겠어요...
			for(int j=0;j<arrIncome[i].length;j++) {
				System.out.println(arBranch[i]+" "+arAge[j]+"매장 매출액을 입력하시요. (단위: 만원) ");
				
				
				
			}
		}
		
	}
}
