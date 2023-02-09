package oop;

import java.util.Date;

import com.ezen.shop.Cart2;
//권장
//import com.ezen.shop.Cart;
//비권장
//import com.ezen.shop.*;

// 스태틱 임포트
import static java.lang.System.out;

import static java.lang.Math.*;

public class CartExample {

	public static void main(String[] args) {
		Cart2 cart;
//		com.ezen.shop.Cart cart;
		cart = new Cart2();
		cart.addItem("초코파이");
		
		Date today = new Date();
		String ymd = today.toLocaleString(); //Date 구식 변수 쓰지말기
		System.out.println(ymd);
		
		out.println("스태틱 임포트 사용하기");
		int x = 40, y = 35;
//		int result = max(x ,y);
		int result = Math.max(x ,y);
		out.println(result);
	}

}
