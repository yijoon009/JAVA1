package day07;

import java.util.Random;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[초급]
		//100~1까지 배열에 담고 출력하기
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 100 - i;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//1~100까지 중 짝수만 배열에 담고 출력하기
//		int[] arData = new int[50];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (i+1) * 2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		//1~10까지 배열에 담고 총 합 구하기
//		int[] arData = new int[10];
//		int total = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
////			total += arData[i];
//			total = total + arData[i];
//			//total = 0 + 1
//			//total = (0+1) + 2
//			//total = (0+1+2) + 3
//			//total = (0+1+2+3) + 4
//			
//		}
//		System.out.println(total);
		
		//1~n까지 배열에 담고 총 합 구하기
//		Scanner sc = new Scanner(System.in);
//		int[] arData = null;
//		int total = 0;
//		
//		System.out.print("1~n까지의 합\nn 값 : ");
//		arData = new int[sc.nextInt()];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			total += arData[i];
//		}
//		System.out.println(total);
		
		//A~F까지 배열에 담고 출력하기
		//A : 65
		//B : 66
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		//안타깝다.
//		char[] arData = {'A', 'B', 'C', 'D', 'F'};
//		for (int i = 0; i < arData.length; i++) {
//			arData
//		}
		//A~F까지 중 C제외하고 배열에 담은 후 출력하기
//		char[] arData = new char[5];
		
		//A : 65	0
		//B : 66	1
		//C : 67	2
		//D : 68	3
		//E : 69	4
//		int temp = 0;
//		for (int i = 0; i < arData.length; i++) {
//			temp = i;
//			if(i > 1) {
//				temp++;
//			}
//			arData[i] = (char)(temp+65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
		
		//[중급]
		//aBcDeF.....Z 배열에 담고 출력하기
//		char[] arData = new char[26];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i % 2 == 0 ? 97 + i : 65 + i); 
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i]);
//		}
		
		//5개의 정수를 입력받고 최대값과 최소값 출력하기
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		int max = 0;
//		int min = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "번째 정수 : ");
//			arData[i] = sc.nextInt();
//		}
//		
//		max = arData[0];
//		min = arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {max = arData[i];}
//			if(min > arData[i]) {min = arData[i];}
//		}
//		
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		//사용자가 입력한 값 만큼 정수를 입력받고 배열에 넣은 후 3의 배수만 출력하기
//		int[] arData = null;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력할 정수의 개수 : ");
//		arData = new int[sc.nextInt()];
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "번째 정수 : ");
//			arData[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 3 == 0) {
//				System.out.println(arData[i]);
//			}
//		}
			
		
		//문자열을 입력받고 소문자만 대문자로 바꾸기
//		Scanner sc = new Scanner(System.in);
		//문자열 값을 null로 초기화할 때에는 아래에서 대입 연산자를 사용한다는 의미이다.
//		String str = null;
		//문자열 값을 ""로 초기화할 때에는 아래에서 누적연결을 사용하겠다는 의미이다.
		//null이라는 값도 값이기 때문에 연결을 하면 null이 연결되서 사용되기 때문에
		//사용목적에 맞게 초기화해주어야 한다.
		
//		String result = "";
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(c >= 97 && c <= 122) {
//				//소문자
//				result += (char)(c - 32);
//			}else {
//				result += c;
//			}
//		}
//		System.out.println(result);
		
		//[고급]
		//90%확률로 꽝을 출력하고 10%확률로 당첨을 출력하기
		//확률의 단위가 10이라면, 10칸 배열을 선언한다.
		//모두 0으로 초기화한 후 원하는 확률 / 10 만큼 1을 대입해준다.
		//랜덤한 인덱스 번호로 접근하여 값을 가지고 왔을 때
		//0이 나오면 100 - 원하는 확률,
		//1이 나오면 원하는 확률로 나오게 된다.
		Random r = new Random();
		int[] arData = new int[10];
		int idx = r.nextInt(arData.length);
		int rating = 1;
		for (int i = 0; i < rating; i++) {
			arData[i] = 1;
		}
		
		System.out.println(arData[idx] == 1 ? "당첨" : "꽝");
		
		//정수를 한글로 변경하기	1024 -> 일공이사
		
//[1]
		String hangle = "공일이삼사오육칠팔구";
		String result = "";

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		while(num != 0) {
			result = hangle.charAt(num % 10) + result;
			num /= 10;
		}
		System.out.println(result);
		
//[2]
		String hangle = "공일이삼사오육칠팔구";
		String data = null;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		data = sc.nextInt() + "";
		
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		System.out.println(result);
		
		//한글을 정수로 변경하기	일공이사 -> 1024
		Scanner sc = new Scanner(System.in);
		String result = "";
		String hangle_org = "공일이삼사오육칠팔구";
		String hangle = null;
		
		System.out.print("한글 : ");
		hangle = sc.next();
		
		for (int i = 0; i < hangle.length(); i++) {
			result += hangle_org.indexOf(hangle.charAt(i));
		}
		System.out.println(result);
	}
}














