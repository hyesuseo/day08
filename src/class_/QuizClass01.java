package class_;

import java.util.Scanner;

public class QuizClass01 {
	String name []; 
	
	
	//배열에 이름 입력하는 기능
	public String[] myName() {
		String name [] = new String [3];
		Scanner sc = new Scanner (System.in);
		for (int i = 0 ; i<name.length; i++) {
			System.out.print("이름을 입력: ");
			String abc = sc.next();
			name [i] = abc; 
		}
		return name;
	}
	//배열 값을 출력하는 기능
	public void mypush(String[] name) {
		
		for (int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}
	
	public int[] input() {
		int [] arr = new int [2];
		System.out.println("두 수를 입력");
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
	return arr;
	}
	
	public int sum(int[] arr) {
		int sum = arr[0]+arr[1];
		return sum;
	}
	
	public void print(int a) {
		System.out.println(a);
	}
	
	
	
}
