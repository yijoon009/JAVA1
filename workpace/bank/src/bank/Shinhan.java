package bank;

public class Shinhan extends Bank {
	//����� �ȳ����� ������� int a=0 ������ ������ ������ �ٽ� ����� ���� ����
	
	//��ݽ� ������ 50%
	@Override
	void outPut(int num) {
		current-=num*1.5;
	}
}
