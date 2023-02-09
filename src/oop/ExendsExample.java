package oop;

public class ExendsExample {

	public static void main(String[] args) {
		Parent parent = new Parent("홍길동", 50);
		System.out.println("부모 이름: " + parent.getName());
		System.out.println("부모 나이: " + parent.getAge());
		
		Child child = new Child("홍자식", 20, "이젠대학교");
		System.out.println("아이 이름: "+ child.getName());
		System.out.println("아이 나이: "+ child.getAge());
		child.song();
	}

}
