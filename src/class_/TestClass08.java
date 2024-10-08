package class_;

public class TestClass08 {
	public int sumFunc(int num) {//받아주는 쪽이 괄호 arguments 
		System.out.println("08");
		int sum = 0;
		for (int i =0 ; i<=num ; i++) {
			sum +=i;
		}
		return sum; //메서드를 종료하면서 빠져나오고
		//특정 값이 있으면 돌려준다
		//대신 return쓰면 위에 반환타입을 맞춰주어야
		//void ->int

	}


	public void test1() {

	}
	public void test2( int n, String s) {

	}
	public String get( int index) {
		return "abc";
	}




}
