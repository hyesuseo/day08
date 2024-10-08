package class_;

import java.util.ArrayList;

public class QuizMainClass04 {

	public static void main(String[] args) {
		QuizTestClass04 t = new QuizTestClass04();
		
		
		ArrayList<Integer> arr = t.myPut();
		int sum = t.plus(arr.get(0), arr.get(1));
		System.out.println(arr);
		t.push(sum);
		
	}

}
