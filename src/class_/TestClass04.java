package class_;

import java.util.Scanner;

public class TestClass04 {
	public int myInput() {
		Scanner sc= new Scanner (System.in);
		
		int num;
		System.out.print("수 입력: ");
		num = sc.nextInt();
		return num;
	}
}
