package bank;

public class Bank {
	//����(�����ܾ�)
	//������
	//��й�ȣ
	int current;
	String name;
	int psw;
	
	
	//�⺻������
	public Bank() {;}	// ;�ǹ̴� �Ϻη� ����аŴϱ� �ǵ��� ��
	
	
	//�ʱ�ȭ������
	public Bank(int current, String name, int psw) {
		super();
		this.current = current;
		this.name = name;
		this.psw = psw;
	}
	
	//�Ա��ϱ�
	void inPut(int num){
		this.current+=num;
		
	}
	//����ϱ�
	void outPut(int num) {
		current-=num;
	}
	//�ܾ���ȸ
	void see() {
		System.out.println(current);
	}
	
}
