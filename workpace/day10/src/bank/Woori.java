package bank;

public class Woori extends Bank{
	public Woori(int money, String name, String pw) {
		super(money, name, pw);
	}
	
	//잔액조회시 전재산 100% 증가
	@Override
	String balance() {
		this.money *= 2;
		return super.balance();
	}
}
