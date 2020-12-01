package bank;

public class Bank {
	//통장(현재 잔액)
	int money;
	//예금주
	String name;
	//비밀번호
	String pw;
	
	//기본생성자
	public Bank() {;}
	//초기화 생성자
	public Bank(int money, String name, String pw) {
		super();
		this.money = money;
		this.name = name;
		this.pw = pw;
	}
	
	//입금하기
	void deposit(int money) {
		this.money += money;
	}
	//출금하기
	boolean withdraw(int money) {
		if(this.money - money < 0) {
			return false;
		}
		this.money -= money;
		return true;
	}
	//잔액조회
	String balance() {
		return "현재 잔액 : " + this.money + "원";
	}
	
	//계좌이체
	boolean sendMoney(Bank b, int money) {
		if(this.money - money < 0) {
			return false;
		}
		this.money -= money;
		b.money += money;
		return true;
	}
}














