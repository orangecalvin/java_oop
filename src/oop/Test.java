package oop;

class A{
	A(){}
	
	public void Ad() {
		System.out.println("AAAA");
	}
		
}

class B{
	public void Bd() {
		System.out.println("BBBB");
	}
	
}
public class Test {
	public static void main(String[] args) {
	A a = new A();
	B b = new B();
	
	a.Ad();
	b.Bd();
	System.out.println("~~~~~~~~");
}
}
