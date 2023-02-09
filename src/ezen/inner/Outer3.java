package ezen.inner;

public class Outer3 {
	String name;

	public void doTask() {
		final int x = 10;

		System.out.println("doTask() 메소드 실행~~~~");
		//지역 내부 클래스
		class Helper {
			public void someDo() {
				System.out.println("someDo() 메소드 실행됨...");
				name = "헐....";
				System.out.println(x); // 접근할수있지만 사용할수없음
			}
		}
		Helper helper = new Helper();
		helper.someDo();

	}

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.doTask();
	}
}
