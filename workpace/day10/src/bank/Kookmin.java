package bank;

public class Kookmin extends Bank{
	ArrayIndexOutOfBoundsException
	public Kookmin(int money, String name, String pw) {
		super(money, name, pw);
	}
	
	//�Աݽ� ��� ���丷
	@Override
	void deposit(int money) {
		this.money *= 0.5;
		super.deposit(money);
	}
}
