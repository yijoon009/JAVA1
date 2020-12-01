package bank;

public class Shinhan extends Bank{
	static int cnt;
	
	@Override
	public void deposit(int money) {
		money/=2;
		super.deposit(money);
	}
}
