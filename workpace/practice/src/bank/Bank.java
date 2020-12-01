package bank;

/*
 * 국민은행	: 출금시 수수료 50%
 * 신한은행	: 입금시 수수료 50%
 * 우리은행	: 잔액 조회시 수수료 전재산 반토막
 */

public class Bank {
	int money;
	//예금주, 계좌번호, 비밀번호, 핸드폰번호
	String name;
	String account;
	String pw;
	String phone;
	
	//입금
	public void deposit(int money) {
		this.money += money;
	}
	
	//출금
	public boolean withdraw(int money) {
		if(money<=this.money) {
			this.money-=money;
			return true;
		}
		return false;
	}
	
	//잔액조회
	public int showBalance() {
		return this.money;
	}
	
	
}
