package class_;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		int num = t.myInput();
		
		
		if(num %2 ==0 )		{
			System.out.println("짝 수");
		}
		else 
			System.out.println("홀 수");
		num = t.myInput();
		if(num %3 ==0 )		{
			System.out.println("3의 배수");
		}
		else 
			System.out.println("3의배수 아님");
		
}
}
