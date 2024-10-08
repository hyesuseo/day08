package class_;

import java.util.Scanner;

public class MainClass08 {
public static void main(String[] args) {

	System.out.println("main");
	TestClass08 t = new TestClass08();
	Scanner sc=new Scanner(System.in);
	int num =0, sum =0;
	System.out.println("수 입력");
	num = sc.nextInt();
	
	t.sumFunc(num); //사용자로부터 입력받은 값을 전달
	//인자값parameter라고 부른다고 
	sum = t.sumFunc(num);

	System.out.println("1 ~ "+num +" : "+sum);
	t.test1(); 
	t.test2(num, null);
	String a = t.get(11111);
	


}
}
