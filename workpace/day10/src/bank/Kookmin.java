package bank;

public class Kookmin extends Bank{
	ArrayIndexOutOfBoundsException
	public Kookmin(int money, String name, String pw) {
		super(money, name, pw);
	}
	
	//입금시 재산 반토막
	@Override
	void deposit(int money) {
		this.money *= 0.5;
		super.deposit(money);
	}
}
