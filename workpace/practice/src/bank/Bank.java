package bank;

/*
 * ��������	: ��ݽ� ������ 50%
 * ��������	: �Աݽ� ������ 50%
 * �츮����	: �ܾ� ��ȸ�� ������ ����� ���丷
 */

public class Bank {
	int money;
	//������, ���¹�ȣ, ��й�ȣ, �ڵ�����ȣ
	String name;
	String account;
	String pw;
	String phone;
	
	//�Ա�
	public void deposit(int money) {
		this.money += money;
	}
	
	//���
	public boolean withdraw(int money) {
		if(money<=this.money) {
			this.money-=money;
			return true;
		}
		return false;
	}
	
	//�ܾ���ȸ
	public int showBalance() {
		return this.money;
	}
	
	
}
