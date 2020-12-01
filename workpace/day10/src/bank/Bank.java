package bank;

public class Bank {
	//����(���� �ܾ�)
	int money;
	//������
	String name;
	//��й�ȣ
	String pw;
	
	//�⺻������
	public Bank() {;}
	//�ʱ�ȭ ������
	public Bank(int money, String name, String pw) {
		super();
		this.money = money;
		this.name = name;
		this.pw = pw;
	}
	
	//�Ա��ϱ�
	void deposit(int money) {
		this.money += money;
	}
	//����ϱ�
	boolean withdraw(int money) {
		if(this.money - money < 0) {
			return false;
		}
		this.money -= money;
		return true;
	}
	//�ܾ���ȸ
	String balance() {
		return "���� �ܾ� : " + this.money + "��";
	}
	
	//������ü
	boolean sendMoney(Bank b, int money) {
		if(this.money - money < 0) {
			return false;
		}
		this.money -= money;
		b.money += money;
		return true;
	}
}














