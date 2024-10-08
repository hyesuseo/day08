package class_;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		
		System.out.println("main");
		TestClass07 t = new TestClass07();
			Scanner sc=new Scanner(System.in);
			int num =0, sum =0;
			System.out.println("수 입력");
			num = sc.nextInt();
		t.sumFunc(num); //사용자로부터 입력받은 값을 전달
		//인자값parameter라고 부른다고 
	}
}
