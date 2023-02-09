package oop;

import ezen.abstraction.Animal;
import ezen.abstraction.Bird;
import ezen.abstraction.BisongDog;
import ezen.abstraction.Cat;

public class AnimalExample {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		//클래스 자동 형변환
		Animal animal = new Bird();
		animal.cry();
//		animal.fly();
		// 새롭게 추가된 메소드를 호출하기 위해 강제형변환
		Bird bird = (Bird)animal;
		bird.fly();
		
		
		animal = new Cat();
		animal.cry();
		
		animal = new BisongDog();
		animal.cry();
	}

}
