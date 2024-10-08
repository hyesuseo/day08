package class_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int num;
		System.out.print("수 입력: ");
		num = sc.nextInt();
		if(num %2 ==0 )		{
			System.out.println("짝 수");
		}
		else 
			System.out.println("홀 수");
		
		System.out.print("수 입력: ");
		num = sc.nextInt();
		if(num %3 ==0 )		{
			System.out.println("3의 배수");
		}
		else 
			System.out.println("3의배수 아님");
		
}
}
