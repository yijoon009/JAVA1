package myday09;

public class MethodTask {
	
	// ※선언 후 구현 시 사용하는 사람을 생각하며 개발한다.
	//마우스, 키보드, 마이크로 정수입력하지 모르기때문에 입력받은 값을 받아오자!
	
	//5개의 정수를 입력받고 총 합을 구해주는 메소드
	int getTotal(int[] arData) {
		int total=0;
		for(int i=0;i<arData.length;i++) {
			total+=arData[i];
		}
		//System.out.println(total);     이건 특정성
		return total;
	}
	
	//5개의 정수를 입력받고 총 합을 println으로 출력해주는 메소드
	void printTotal(int[] arData) {
		int total=0;
		for (int i = 0; i < arData.length; i++) {
			total+=arData[i];
		}
		System.out.println(total);
	}
	
}
