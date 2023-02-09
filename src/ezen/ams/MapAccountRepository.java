package ezen.ams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MapAccountRepository 인터페이스
 * 
 * @author 김규래
 * @Date 2023. 1. 25.
 */
public class MapAccountRepository {

	private Map<String,Account> accounts;

	public MapAccountRepository() {
		accounts = new HashMap<>();
	}

	public void addAccount(Account account)throws RuntimeException {
		if (accounts.containsKey(account.getAccountNumber())) {
			throw new RuntimeException("이미 등록된 계좌 입니다");
		}else {
			accounts.put(account.getAccountNumber(), account);
		}
		
	}

	public List<Account> getAccounts() {
		return new ArrayList<>(accounts.values());
	}

	public Account findByNumber(String number) {
				return accounts.get(number);
			}

	public boolean removeAccount(String number) {
			Account remonveAccount	= accounts.remove(number);
			if (remonveAccount != null) {
				return true;
			}
			return false;
	}
}
