package myday07;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData= {{1,2,5},{7,9,0}};
		int length=arrData.length*arrData[0].length;
//		for (int i = 0; i < length; i++) {
//			
//			System.out.println(arrData[i/3][i%3]);
//		}
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {	//arrData[i]는 정방/비정방 모두 대비
				System.out.println(arrData[i][j]);
			}
		}
		
	}
}
