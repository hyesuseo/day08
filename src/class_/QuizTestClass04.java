package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTestClass04 {

	public ArrayList<Integer> myPut(){//입력
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.print("첫 수 입력:");
		int c = sc.nextInt();
		arr.add(c);
		
		System.out.print("두번째 수 입력:");
		int d = sc.nextInt();
		arr.add(d);
		
		return arr;
	}
	
	public int plus (int a, int b) {
		return a + b;
	}
	
	public void push(int sum) {
		System.out.println(sum);
		
	}
}
