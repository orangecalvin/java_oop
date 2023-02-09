package oop;

import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		String name = null;
		int[] jumsu = new int [4];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = scanner.nextLine();
		
		System.out.print("점수데이터: ");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = scanner.nextInt();
		}
		Student2 student = new Student2(name, jumsu);
		
		System.out.println("이름은? "+ student.getName());
		System.out.println("총점은? "+ student.getSum());
		System.out.println("평균은? "+ student.getAvg());
		scanner.close();
	}

}
