package class_;

public class TestClass09 {
	public int inputData() { //반환타입 int로 맞춰준다
		//입력기능
		int num = 5;
		return num; //입력받은 값을 전달함
	}
	
	
	
	public int sumFunc(int num) {
		//연산기능
		num +=100;
		return num;
	}
	
	
	public void print(int num, int s) {
		System.out.println(num + ", "+s);
	}
}
