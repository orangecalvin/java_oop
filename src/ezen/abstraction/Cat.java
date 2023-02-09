package ezen.abstraction;

//유대식 구현 클래스
public class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void cry() {
		System.out.println("냐옹~");
		
	
		
	}
	@Override
	public void eat() {
		System.out.println("고양이는 츄르를 핡아먹습니다");
	}
}
