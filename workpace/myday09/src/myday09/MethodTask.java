package myday09;

public class MethodTask {
	
	// �ؼ��� �� ���� �� ����ϴ� ����� �����ϸ� �����Ѵ�.
	//���콺, Ű����, ����ũ�� �����Է����� �𸣱⶧���� �Է¹��� ���� �޾ƿ���!
	
	//5���� ������ �Է¹ް� �� ���� �����ִ� �޼ҵ�
	int getTotal(int[] arData) {
		int total=0;
		for(int i=0;i<arData.length;i++) {
			total+=arData[i];
		}
		//System.out.println(total);     �̰� Ư����
		return total;
	}
	
	//5���� ������ �Է¹ް� �� ���� println���� ������ִ� �޼ҵ�
	void printTotal(int[] arData) {
		int total=0;
		for (int i = 0; i < arData.length; i++) {
			total+=arData[i];
		}
		System.out.println(total);
	}
	
}
