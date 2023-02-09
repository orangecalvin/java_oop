package oop;
// 중복정의 규칙
// 메소드 이름을 똑같이 하면 정의 하고자할때는 
// 매개변수 갯수나 데이터 타입이 반드시 달라야 한다.
class Calculator{
	// 메소드 오버로딩(중복정의)
	public static int sum(int x,int y) {
		return x + y;
	}
	
	public static int sum(int x,int y, int z) {
		return x + y + z;
	}
	
	public static double sum(double x,double y) {
		return x + y;
	}
}
public class OverloadingExample {


	public static void main(String[] args) {
		System.out.println(Calculator.sum(10, 20));
		System.out.println(Calculator.sum(10.8, 20.9));
		
	}

}
