package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class bj02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);	
		int num = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>(); 
		
		
		for (int i = 0; i<num; i++ ) {
			String str = sc.next();
			arr.add(str);
		}
		
		for (int i = 0; i<num; i++) {
			String initial= arr.get(i);
			int leng = initial.length();
			System.out.print(initial.charAt(0));
			System.out.println(initial.charAt(leng-1));
			
		}
		
		
		
	}

}
