package ezen.ams;

import java.util.Calendar;
import java.util.Scanner;

public class AMS0000000000000 {
	
	private static AccountRepository repository = new ArrayAccountRepository(100);
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("::::: " + Account.BANK_NAME + " 계좌 관리 애플리케이션 :::::");
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			switch (selectNo) {
			case 1:
				System.out.println("계좌개설 메뉴 입니다");
				System.out.println("생성할 계좌 유형을 선택해주세요");
				System.out.println("-------------------------------------");
				System.out.println("1. 입출금계좌 | 2. 마이너스계좌(대출)");
				System.out.println("-------------------------------------");
				System.out.print("선택 > ");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("입출금계좌 생성 메뉴 입니다");
					System.out.println("계좌번호를 입력해주세요");
					System.out.print("입력 > ");
					String accountNum = scanner.next();
					System.out.println("성함을 입력해주세요");
					System.out.print("입력 > ");
					String accountOwner = scanner.next();
					System.out.println("사용하실 비밀번호를 입력해주세요");
					System.out.print("입력 > ");
					int password = scanner.nextInt();
					repository.addAccount(new Account(accountNum, accountOwner, password, 0));
					System.out.println("입출금계좌 등록이 완료되었습니다\n");
					break;
				case 2:
					System.out.println("마이너스계좌(대출) 생성 메뉴 입니다");
					System.out.println("계좌번호를 입력해주세요");
					System.out.print("입력 > ");
					String minusAccountNum = scanner.next();
					System.out.println("성함을 입력해주세요");
					System.out.print("입력 > ");
					String minusAccountOwner = scanner.next();
					System.out.println("사용하실 비밀번호를 입력해주세요");
					System.out.print("입력 > ");
					int minuspassword = scanner.nextInt();
					System.out.println("신청하실 대출금액을 입력해주세요");
					System.out.print("입력 > ");
					long borrowMoney = scanner.nextLong();
					System.out.println();
					repository.addAccount(new MinusAccount(minusAccountNum, minusAccountOwner, minuspassword, 0, borrowMoney,
							String.format("%1$tF %1$tT", Calendar.getInstance())));
					System.out.println("대출이 실행 되었습니다\n");
					break;
				default:
					System.out.println("다시 입력해주세요");
					System.out.print("입력 > ");
					break;
				}
			}
}
	}
}
