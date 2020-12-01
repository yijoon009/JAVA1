package bank;

public class Kookmin extends Bank{
//입금시  재산 반토막
	@Override
	void inPut(int num) {
		current-=current/2;
	}
}
