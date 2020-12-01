package bank;

public class Bank {
	//통장(현재잔액)
	//예금주
	//비밀번호
	int current;
	String name;
	int psw;
	
	
	//기본생성자
	public Bank() {;}	// ;의미는 일부러 비워둔거니까 건들지 마
	
	
	//초기화생성자
	public Bank(int current, String name, int psw) {
		super();
		this.current = current;
		this.name = name;
		this.psw = psw;
	}
	
	//입금하기
	void inPut(int num){
		this.current+=num;
		
	}
	//출금하기
	void outPut(int num) {
		current-=num;
	}
	//잔액조회
	void see() {
		System.out.println(current);
	}
	
}
