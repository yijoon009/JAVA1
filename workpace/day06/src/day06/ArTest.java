package day06;

public class ArTest {
	public static void main(String[] args) {
		int[] arData = {3, 5, 2, 9};
		
//		System.out.println(arData);
//		System.out.println(arData.length);
		
		//for문을 한 개 추가해서 4,3,2,1을 배열에 담고 출력해보기!
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 4 - i;
		}
		
		//for문을 한 개 추가해서 4,2,1을 배열에 담고 출력해보기!
//		arData = new int[3];
		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (int)Math.pow(2, arData.length - 1 - i);//2², 2¹, 2ⁿ
//		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		//불쾌하다.
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
		
		
		
	}
}
