package ezen.ams;

public class AMS2 {

	public static void main(String[] args) {
		AccountRepository repository = new ArrayAccountRepository(100);
		AccountFrame frame = new AccountFrame("KYU-BANK AMS", repository);
		// 가상(테스트)데이터 등록
		repository.addAccount(new Account("1111-2222","김기정",1111,100000));
		repository.addAccount(new MinusAccount("1111-3333","김대출",1111,100000,1000000,"2023-1-1"));
		
		frame.initLayout();
		frame.addEventListener();
		frame.setSize(400,400);
		frame.setVisible(true);
		
		
	}

}
