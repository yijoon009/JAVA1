package day06;

public class ArTest {
	public static void main(String[] args) {
		int[] arData = {3, 5, 2, 9};
		
//		System.out.println(arData);
//		System.out.println(arData.length);
		
		//for���� �� �� �߰��ؼ� 4,3,2,1�� �迭�� ��� ����غ���!
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 4 - i;
		}
		
		//for���� �� �� �߰��ؼ� 4,2,1�� �迭�� ��� ����غ���!
//		arData = new int[3];
		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (int)Math.pow(2, arData.length - 1 - i);//2��, 2��, 2��
//		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		//�����ϴ�.
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
		
		
		
	}
}
