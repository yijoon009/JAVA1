package bank;

public class Woori extends Bank{
	public Woori(int money, String name, String pw) {
		super(money, name, pw);
	}
	
	//�ܾ���ȸ�� ����� 100% ����
	@Override
	String balance() {
		this.money *= 2;
		return super.balance();
	}
}
