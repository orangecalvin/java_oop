package oop;

/**
 * call by value vs call by reference
 * @author kyu
 *
 */
public class CallMethidExample {
        public static void doTask(int x) {
		x += 10;
		System.out.println(x);
	}
     public static void doTask2(Account account) {
    	 account.deposit(1000);
    	 System.out.println(account.getRestMoney());
     } 
        
        
	public static void main(String[] args) {
		int i = 100;
		// call by value
		doTask(i);
		System.out.println(i);
		
		Account account = new Account("1111-2222", "김규래", 1234, 10000);
		doTask2(account);
		System.out.println(account.getRestMoney());
	}

}
