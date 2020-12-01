package bank;

public class Shinhan extends Bank {
	//단축기 안나오면 편법으로 int a=0 같은거 선언한 다음에 다시 단축기 쓰면 나와
	
	//출금시 수수료 50%
	@Override
	void outPut(int num) {
		current-=num*1.5;
	}
}
