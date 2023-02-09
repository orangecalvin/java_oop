package ezen.inner;

public class Outer {
	String name = "김규래";

	public void outerMethod() {
		System.out.println("외부 클래스 출력중입니다..");
		inner inner = new inner();
		inner.innerMethod();
//		System.out.println(age); 에러코드
	}

	// 인스터스 맴버 내부클래스
	// 외부클래스의 보조적(Helper) 역할의 클래스
	class inner {
		int age = 10;
		public void innerMethod() {
			System.out.println("내부클래스 출력중입니다...");
			//외부클래스의 맴버를 접근할 수 있다.
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		//내부에서 사용시
		Outer outer = new Outer();
		outer.outerMethod();
		// 외부에서 내부클래스 사용시
		Outer outer1 = new Outer();
		Outer.inner in = outer1.new inner();
		in.innerMethod();
	}
}
