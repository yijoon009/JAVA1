package bank;

public class Woori extends Bank {
	//잔액조회시 전재산 100%
	@Override
	void see() {
	
		current+=current;
	}
}
