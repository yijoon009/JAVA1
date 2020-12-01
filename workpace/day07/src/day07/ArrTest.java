package day07;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = {{1,2,5}, {7,9,0}};
		
		int length = arrData.length * arrData[0].length;
		System.out.println(arrData.length);
		System.out.println(arrData[0].length);
//		System.out.println(arrData.length);
//		System.out.println(arrData[0].length);
//		System.out.println(length);
		for(int i=0; i<arrData.length; i++) {
			for(int j=0; j<arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
//		for (int i = 0; i < length; i++) {
//			//행 : 0 0 0 1 1 1
//			//열 : 0 1 2 0 1 2
//			//i : 0 1 2 3 4 5 / 3 : 행
//			//i : 0 1 2 3 4 5 % 3 : 열
//			System.out.println(arrData[i / 3][i % 3]);
//		}
	}
}










