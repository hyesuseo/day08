package class_;

public class MainClass09 {
	public static void main(String[] args) {
		
		TestClass09 t = new TestClass09();
		int num = t.inputData();
		//옮겨받은 값을 num 변수에 저장한다
		int s = t.sumFunc( num );
		t.print(num, s);
		
	}
}
