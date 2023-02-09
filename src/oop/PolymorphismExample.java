package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;

/**
 * 자바는 다양성을 지원하기위해 클래스 자동형변환과 메소드 재정의를 지원한다
 * @author 김규래
 * @Date 2023. 1. 5.
 */
public class PolymorphismExample {

	public static void main(String[] args) {
		// 기본타입 자동형변환
		double weight = 70;
		System.out.println(weight);
		 
		Shape shape = new Circle(5,5,30);
		shape.draw();
		//클래스 자동형변환
		// 부모 ,자식간에는 타입을 부모로 선언 하면 
		//모든 자식 객체를 할당할수있다
		shape = new Circle(5,5,20);
		shape.draw();
		shape = new Lectangle(5,5,5,20);
		shape.draw();
		
//		Shape shape = new Shape();
//		Circle circle = new Circle();
//		Lectangle lectangle = new Lectangle();
		
	}

}
