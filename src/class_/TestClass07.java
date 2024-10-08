package class_;

import java.util.Scanner;

public class TestClass07 {
	public void sumFunc(int num) {//받아주는 쪽이 괄호 arguments 
	System.out.println("07동작");
	int sum = 0;
	for (int i =0 ; i<=num ; i++) {
		sum +=i;
	}
	System.out.println("1 ~ "+num +" : "+sum);
	}
}
