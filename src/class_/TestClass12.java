package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass12 {
	public int[] test1() {
		int n1 = 100, n2 = 200;
		int [] arr = {n1, n2};
		//return n1, n2 이렇게 쓰는게 아니라
		return arr; //이렇게 써야함!
	
	}
	
	
	public HashMap<String, String> test2(ArrayList<String> a, String s) {
		System.out.println("----test2----");
		System.out.println("arr: "+a);
		System.out.println("str: "+s);
		
		HashMap<String, String> map =
				new HashMap<String, String>();
		 map.put("1",  a.get(0));
		 map.put("2",  a.get(1));
		 map.put("str",  s);
		 
		 return map;
	 }
}
