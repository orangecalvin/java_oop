package ezen.ams;

/**
 * ArrayAccountRepository 인터페이스
 * 
 * @author 김규래
 * @Date 2023. 1. 9.
 */
public class ArrayAccountRepository implements AccountRepository {

	private Account[] accounts;
	private int count;

	public ArrayAccountRepository() {
		this(10);
	}

	public ArrayAccountRepository(int capacity) {
		this.accounts = new Account[capacity];
	}

	@Override
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public void addAccount(Account accounts) {
		this.accounts[count++] = accounts;
	}

//	@Override
//	public void addAccount(oop.Account accounts) {
//		this.accounts[count++] = accounts;
//	}

	@Override
	public Account[] getAccounts() {
		return accounts;
	}

	@Override
	public Account findByNumber(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
//			동일 계좌번호 여부확인
			if (an.equals(number)) {
				return accounts[i];
			}
		}
		return null;
	}

	@Override
	public boolean removeAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			if (an.equals(number)) {
				for (int j = i; j < count - 1; j++) {
					accounts[j] = accounts[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;
	}

}
