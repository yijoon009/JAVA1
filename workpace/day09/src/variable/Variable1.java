package variable;

public class Variable1 {
	int data = 100;
	static int data_s = 200;
	
	void increase(){
		System.out.println(++data);
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
}
