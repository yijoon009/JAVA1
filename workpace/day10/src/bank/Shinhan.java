package bank;

public class Shinhan extends Bank {
	public Shinhan(int money, String name, String pw) {
		super(money, name, pw);
	}
	//��ݽ� ������ 50%
	@Override
	boolean withdraw(int money) {
		money *= 1.5;
		return super.withdraw(money);
	}
}
