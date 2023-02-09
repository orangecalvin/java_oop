package oop;


/**
 * Account 클래스를 상속받는 마이너스 계좌
 * @author 김규래
 * @Date 2023. 1. 4.
 */
public class MinusAccount extends Account {
//	새롭게 추가된속성
	private long borrowMoney;
	private String borrowDate;
	
	public MinusAccount() {}

	public MinusAccount(String accountNumber, String accountOwner, int password, long restMoney, long borrowMoney,
			String borrowDate) {
		super(accountNumber, accountOwner, password, restMoney);
		this.borrowMoney = borrowMoney;
		this.borrowDate = borrowDate;
	}

	public long getBorrowMoney() {
		return borrowMoney;
	}

	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	// 잔액(restMoney - borrowMoney) 재정의(Overriding)
	
	public long getRestMoney() {
		return super.getRestMoney() - borrowMoney;
	}
				
	public String toString() {
		return super.toString() + "\t" + borrowMoney + "\t" + borrowDate;
		}
	
}
