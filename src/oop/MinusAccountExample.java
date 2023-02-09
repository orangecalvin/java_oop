package oop;

//import javax.swing.JOptionPane;

public class MinusAccountExample {

	public static void main(String[] args) {
		MinusAccount ma;
		ma = new MinusAccount("1111-2222", "김규래", 1111, 100000, 10000000, "2023.1.4");
		
//		부모메소드 재사용
		System.out.println(ma.getAccountNumber());
		System.out.println(ma.getAccountOwner());
		ma.deposit(100000);
		ma.withdraw(1000);
		
		System.out.println("현재잔액:" + ma.getRestMoney());
		System.out.println(ma.toString());
		System.out.println(ma); // toString()메소드는 JVM에 의해 자동 호출됨
		
//		JOptionPane.showMessageDialog(null, ma.toString());
		// 새롭게 추가된 메소드 사용
		System.out.println(ma.getBorrowMoney());
		System.out.println(ma.getBorrowDate());
		
//		Object 메소드 재사용
		int code = ma.hashCode();
		System.out.println(code);
		System.out.println(ma.toString());
		
		String name = "김규래"; // new String("김규래");
		System.out.println(name.toString());
		System.out.println(name); // String 클래스에 재정의된 toString() 메소드 자동 호출
		
		// Object 클래스는 equals() 메소드를 기본 제공
		// 레퍼런스 비교
		Account account1 = new  Account("1111", "김규래", 111,100000);
		Account account2 = new  Account("1111", "김규래", 111,100000);
		System.out.println(account1 == account2);
		System.out.println(account1.equals(account2)); //Object의 equals() 메소드 재사용
		
		String message1 = "자바 어려워요.";
		String message2 = "자바 어려워요.";
		System.out.println(message1.equals(message2));
		// 여기서 유추할수있는것.
		// String 클래스는 Object 가 제공하는 equals() 메소드를 재사용하는것이 아니라
		// equals() 메소드를 재정의 하여 문자열과 문자열을 비교한다.
		
		
	}

}
