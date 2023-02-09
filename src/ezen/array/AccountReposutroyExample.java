package ezen.array;

import oop.Account;
import oop.MinusAccount;

/**
 * 애플리케이션 실행을 위한 역할 - 애플리케이션(메인) 클레스
 * 
 * @author 김규래 2023. 1. 3.
 */
public class AccountReposutroyExample {

	public static void main(String[] args) {
//		AccountRepository repositroy = new AccountRepository();
		AccountRepository repositroy = new AccountRepository(100);

		// 입출금 신규계좌 생성 테스트
		Account account = new Account("1111-2222", "김규래", 1111, 1000000);
		// 입출금 신규계좌 등록
		repositroy.addAccount(account);
		repositroy.addAccount(new Account("1111-3333", "홍길동", 1111, 1000000));
		repositroy.addAccount(new Account("1111-4444", "박찬호", 1111, 100000));
		
		// 마이너스 신규계좌 등록
		MinusAccount ma = new MinusAccount("2222-1111", "김대출", 1111, 10000 , 10000000, "2023.1.10");
		repositroy.addAccount(ma);
		repositroy.addAccount(new MinusAccount("2222-2222", "김순대", 1111, 10000 , 10000000, "2023.1.10"));
		
		
		// 전체 계좌 목록 조회
		System.out.println("------전체 계좌 목록 ------");
		Account[] list = repositroy.getAccounts();
		for (int i = 0; i < repositroy.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		// 계좌번호 계좌 검색 테스트
		System.out.println("------전체 검색 ------");
		Account findAccount = repositroy.findByNumber("1111-2222");
		if (findAccount != null) {
			System.out.println(findAccount.toString());
		} else {
			System.out.println("해당계좌없음");
		}

		// 계좌번호로 계좌 삭제 테스트
		System.out.println("-----계좌 삭제------");
		boolean result = repositroy.removeAccount("1111-3333");
		if (result) {
			System.out.println("정상 삭제하였습니다...");
			System.out.println(repositroy.getCount());
		} else {
			System.out.println("삭제하고자 하는 계좌가 존재하지 않습니다.....");
		}
		
		System.out.println("------전체 계좌 목록 ------");
		list = repositroy.getAccounts();
		for (int i = 0; i < repositroy.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		
		repositroy.addAccount(new Account("1111-7777", "이강인",1111,100000 ));
		
		System.out.println("------전체 계좌 목록 ------");
		list = repositroy.getAccounts();
		for (int i = 0; i < repositroy.getCount(); i++) {
			System.out.println(list[i].toString());
		}
	}

}
