package ezen.abstraction;

/**
 * 추상클래스
 * 자식 클래스들이 반드시 구현해야하는 기능을위한 수직적 명세 명세 역활 클래스
 * @author 김규래
 * @Date 2023. 1. 6.
 */
public abstract class Animal { // extends Object
	
	
		protected String name;  
		protected int age; 
		
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	
		
		// 추상 메소드 (수직적 규약)
		public abstract void cry(); 
		public abstract void eat(); 
	
}
