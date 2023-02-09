package oop;

/**
 * @author 김규래
 *
 */
public class AccountApplication {
//     애프리케이션의 엔트리 포인트(실행진입점)
	public static void main(String[] args) {
		System.out.println("애플리케이션 시작됨...");
		// 기본데이터타입 변수 선언 및 할당
		int age = 50;
		System.out.println("나이: " + age);
		
		// 참조변수 선언 및 인스턴스 할당(객채 생성)
		Account account;
		account = new Account();
		// 메모리에 생선된 인스턴스(객체)의 필드와 메소드 사용
//		account.accountNumber ="1111-2222-3333";
		account.setAccountNumber("1111-2222-3333");
//		account.accountOwner = "김규래";
		account.setAccountOwner("김규래");
//		account.restMoney = 1000000L;
		account.setRestMoney(1000000);
//		account.password = 1234;
		account.setPassword(1234);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getAccountOwner());
		System.out.println(account.getRestMoney());
		System.out.println(account.getPassword());
		// 인스턴스 메소드 사용 (호출)
		boolean confirm = account.checkPasswd(1234);
		if (confirm) {// 비번 일치시
			long restMoney = account.deposit(100000);
			System.out.println("입금후 잔액: " + restMoney);
			restMoney = account.withdraw(10000);
			System.out.println("출금후 잔액:" + restMoney);
			
			restMoney = account.getRestMoney();
			System.out.println("현재 잔액" + restMoney);
		}else {//비밀번호 불일치시
			System.out.println("비밀번호를 확인하여 주세요");
		}
		// 하나의 클래스로 부터 여려개의 인스턴스 생성할수있다.
		Account account2 = new Account();
		
		// 인스변수는 생성과 동시에 jvm에 의해 자동 초기화 된다.
		//booleam(false), byte, short,int,log(0),float. double (0.0), char (0)
		// cf) 지역변수는 자동초기화 x
//		doble weigth = 0;
//		System.out.println(weigth);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getRestMoney());
		
//		account2.accountNumber = "2222-4444-5555";
		account2.setAccountNumber("2222-4444-5555");
//		account2.restMoney = 100000L;
		account2.setRestMoney(100000L);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getRestMoney());
		
		//생성자 테스트
		Account account3 =new Account("3333-4444-5555", "홍길동", 1234, 90000L);
		System.out.println(account3.getRestMoney());
		
		Account account4 = new Account("4444-5555-6666", "박지성");
		System.out.println(account4.getAccountNumber());
		System.out.println(account4.getAccountOwner());
		
		System.out.println(Account.BANK_NAME);
		
		
		System.out.println("애플리케이션 종료됨...");
	}

}
