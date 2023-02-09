package oop;


/**
 * 자바는 다양성을 지원하기위해 클래스 자동형변환과 메소드 재정의를 지원한다
 * @author 김규래
 * @Date 2023. 1. 5.
 */
public class PolymorphismExample2 {

	public static void main(String[] args) {
		Account account1 = new Account("1111", "김규래",1111,10000);
		Account account2 = new Account("1111", "김규래",1111,10000);
		System.out.println(account1.equals(account2));
		
		String name = "김규래 바보";
		System.out.println(account1.equals(name));
		
		System.out.println("프로그램 실행중...");
		
	}

}
