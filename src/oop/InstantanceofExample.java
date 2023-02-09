package oop;

import ezen.abstraction.Animal;
import ezen.abstraction.Bird;

public class InstantanceofExample {

	public static void main(String[] args) {
		Animal animal = new Bird();
		
		
		
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Object);
//		System.out.println(bird instanceof String);
	}

}
