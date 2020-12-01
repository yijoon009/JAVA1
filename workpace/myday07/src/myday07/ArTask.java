package myday07;

import java.util.Random;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[초급]
		//100~1까지 배열에 담고 출력하기
//		int[] arData = new int[100];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=100-i;
//		}
//		//넣고 출력하는곳 분리해도 된다.
//		for(int i=0;i<arData.length;i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//1~100까지 중 짝수만 배열에 담고 출력하기
//		int[] arData=new int[50];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=(i+1)*2;
//		}
//		for(int i=0;i<arData.length;i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//1~10까지 배열에 담고 총 합 구하기
//		int[] arData=new int[10];
//		int total=0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=i+1;
//			total+=arData[i];
//		}
//		System.out.println(total);
		
		
		// 1~n까지 배열에 담고 총 합 구하기
		//쌤
		/*
		 * int a=0;
		 * double b=0.0;
		 * char c=' ';
		 * String d=null;
		 */
//		Scanner sc=new Scanner(System.in);
//		int[] arData=null;
//		//String s=null;	//주소의 초기화는 null이다. 어떤 주소값을 넣을지 모를때는 null이라는 초기값을 넣는다.
//		int total=0;
//		
//		System.out.println("1~n까지의 합\nn값: ");
//		arData = new int[sc.nextInt()];	//new ~ ]; 이 통째로가 주소값
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=i+1;
//			total+=arData[i];
//		}
//		System.out.println(total);
		
		//내가한거
//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		System.out.println("정수 입력: ");
//		num=sc.nextInt();
//		
//		int[] arData=new int[num];
//		int total=0;
//		for(int i=0;i<num;i++) {
//			arData[i]=i+1;
//			total+=arData[i];
//			System.out.println(arData[i]);
//		}
//		System.out.println(total);
		
		
		
		//A~F까지 배열에 담고 출력하기
//		char[] arData=new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=(char)(i+65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			
//			System.out.println(arData[i]);
//		}
		
		
		//A~F까지 중 C제외하고 배열에 담은 후 출력하기
		//쌤1
//		int tmp=0;
//		char[] arData = new char[5];
//		for (int i = 0; i < arData.length; i++) {
//			tmp=i;
//			if(i>1) {
//				tmp++;
//			}
//			arData[i]=(char)(tmp+65);
//		}
//		for (int j = 0; j < arData.length; j++) {
//			System.out.println(arData[j]);
//		}
		
		//쌤2
//		for (int i = 0; i < args.length; i++) {
//			arData[i]=(char)(i>1?66+i:65+i);
//		}
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//[중급]
		//aBcDeF.....Z 배열에 담고 출력하기
//		char[] arData=new char[26];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=(char)(i%2==0?97+i:65+i);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//5개의 정수를 입력받고 최대값과 최소값 출력하기
//		Scanner sc=new Scanner(System.in);
//		int[] arData=new int[5];
//		
//		int max=0;
//		int min=0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i+1+"번째 정수:");
//			arData[i]=sc.nextInt();
//		}
//		max=arData[0];
//		min=arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max<arData[i]) {
//				max=arData[i];
//			}
//			if(min>arData[i]) {
//				min=arData[i];
//			}
//		}
//		System.out.println("최댓값: "+max);
//		System.out.println("최소값: "+min);
		
		
		//사용자가 입력한 값 만큼 정수를 입력받고 배열에 넣은 후 3의 배수만 출력하기
//		Scanner sc=new Scanner(System.in);
//		int[] arData=null;
//		
//		System.out.println("입력할 정수의 개수: ");
//		arData=new int[sc.nextInt()];
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i+1+"번재 정수: ");
//			arData[i]=sc.nextInt();
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i]%3==0) {
//				System.out.println(arData[i]);
//			}
//		}
		
		
		//문자열을 입력받고 소문자만 대문자로 바꾸기
//		Scanner sc=new Scanner(System.in);
//		String str=null;
//		String result="";
//		
//		System.out.print("문자열: ");
//		str=sc.next();
//		for (int i = 0; i < str.length(); i++) {	//String은 클래스여서 str의 길이를 알려면 메소드 써야해. str.length()
//			char c=str.charAt(i);	//str.charAt(i)이거 자체가 문자값
//			if(c >=97 &&c<=122) {	
//				//소문자
//				result+=(char)(c-32);	//문자+정수=정수
//			}else {
//				result+=c;
//			}
//		}
//		System.out.println(result);
		
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		
		
		//[고급]
		//90%확률로 꽝을 출력하고 10%확률로 당첨을 출력하기
		//확률의 단위가 10이라면, 10칸 배열을 선언한다.
		//모두 0으로 초기화된 후 원하는 확률 / 10만큼 1을 대입해준다
		//랜덤한 인덱스 번화로 접근하여 값을 가지고 왔을때
		//0이 나오면 100 - 원하는 확률,
		//1이 나오면 원하는 확률로 나오게 된다.
		
//		Random r=new Random();
//		int[] arData=new int[10];
//		int idx=r.nextInt(arData.length);	//0~9인덱스 있으니까 배열 크기만큼
//		
//		int rating=1;	//10%라는 뜻							???????????????????????????
//		for (int i = 0; i < rating; i++) {
//			arData[i]=1;
//		}
//		System.out.println(arData[idx]==1?"당첨":"꽝");
		
		
		//정수를 한글로 변경하기	1024 -> 일공이사
		//쌤1
//		String hangle="공일이삼사오육칠팔구";
//		String result="";
//		
//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		
//		System.out.print("정수: ");
//		num=sc.nextInt();
//		while(num!=0) {
//			result=hangle.charAt(num%10)+result;	//result+=hangle.charAt(num) 하면 1024 사이공일 이렇게 붙어서 
//													//좌에서 우 순서에 맞게 뒤에 +result 썼어
//			num/=10;
//		}
//		System.out.println(result);
		
		
		//쌤2
//		String hangle="공일이삼사오육칠팔구";
//		St
		
		
		
		//한글을 정수로 변경하기	일공이사 -> 1024
		
		
	}
}
