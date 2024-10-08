package class_;

public class TestClass11 {
 public void test1() {
	 int num = 1;
	 if( num ==1 ) {
		 System.out.println("if 실행");
		 return; 
		 // 조건이 맞다면 더 이상 실행하기 싫을때
		 //여기서 멈출때 return 사용
	 }
	 System.out.println("다음 문장들 실행");
 }
 public int test2() { //반환타입이 int 면 무조건 int값이 있어야
	 int num = 10;
	 if (num <10 ) {
		 return 1;
	 }else if(num<10) {
		 return 2; 
	 }
	 return 0; // if와 else if 가 실행되지 못하면 에러가 나므로
	 //return  0 값을 넣어주어야 한다.
	 }
 
 public String test3() {
	 int num =5;
	 if (num ==5) {
		 return "5와 같다";
	 }//return 100; //이런식으로 문자 혹은 숫자로 돌려준다는 방식은 사용불가
	 // return은 한 번에 하나씩만 돌려줄 수 있다.
	 //여러 값을 돌려주고싶을 때는 배열을 사용해야한다.
	return null;
	 
 }
 
 
 
 
 
 
 
 
 }

