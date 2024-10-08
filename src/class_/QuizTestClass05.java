package class_;

import java.util.HashMap;
import java.util.Scanner;

public class QuizTestClass05 {
	
	public HashMap<String, Integer> map() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.print("첫번째 수 입력: ");
		int a = sc.nextInt();
		map.put("a", a);
		
		System.out.print("두번째 수 입력: ");
		int b = sc.nextInt();
		map.put("b", b);
		return map;
	}
	
	//두 수의 합
	
	public HashMap <String, Integer> hap(HashMap<String, Integer> map) {
		int sum = map.get(a) + map.get(b);
		map.put("sum", sum)
		return map;
	}
	

}
