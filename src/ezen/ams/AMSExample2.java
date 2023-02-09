package ezen.ams;

import java.util.List;

public class AMSExample2 {

	public static void main(String[] args) {
//	     애프리케이션의 엔트리 포인트(실행진입점)
		System.out.println("애플리케이션 시작됨...");
//		ListAccountRepository repository = new ListAccountRepository();
		MapAccountRepository repository = new MapAccountRepository();
		
//		 신규 계좌 등록
		Account account = new Account("1111-2222-3333", "홍길동", 1234, 100000);
		repository.addAccount(account);
		System.out.println("신규 계좌 등록완료!");
		repository.addAccount(new Account("2222-3333-4444", "박지성", 1111, 100000));
		System.out.println("신규 계좌 등록완료!");
		repository.addAccount(new MinusAccount("2222-3333-5555", "대서성", 1111, 100000, 100000, "211"));
		System.out.println("신규 계좌 등록완료!");

		// 전체계좌 조회
		List<Account> list = repository.getAccounts();
		for (Account acc : list) {
			System.out.println(acc);
		}
		
		// 계좌 이름으로 계좌 검색
		Account findAccount = repository.findByNumber("1111-2222-3333");
		if (findAccount != null) {
			System.out.println("검색된 계좌 : " + findAccount);
			try {
				findAccount.withdraw(-10000);
			} catch (NotSufficianBalanceException e) {
				System.out.println(e.toString());
			}
		} else {
			System.out.println("검색된 계좌가 존재하지않음");
		}
		//계좌 삭제
		boolean result = repository.removeAccount("2222-3333-4444");
		if (result) {
			System.out.println("삭제완료 !");
		}else {
			System.out.println("이미 삭제된계좌거나 존재하지않음");
		}
		
		System.out.println("애플리케이션 종료됨...");
	}
}
