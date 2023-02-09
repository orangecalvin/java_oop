package ezen.array;

import java.io.StreamCorruptedException;

/**
 * @author 김규래
 * @date 2023. 1. 2.
 * 참조형 배열 선언, 생성 ,사용방법
 */
public class ArrayExample6 {

	public static void main(String[] args) {
//		1차원 참조형 배열 선언
		String[] strings;
//		생성
		strings = new String [5];
//		strings[0] = new String("java"); // 명시적 생성
		strings[0] = "java"; // 묵시적 생성
		strings[1] = "c"; // 묵시적 생성
		strings[2] = "c++"; // 묵시적 생성
		strings[3] = "c#"; // 묵시적 생성
		strings[4] = "python"; // 묵시적 생성
		
//		System.out.println(strings[0]);
		for (int i = 0; i < strings.length; i++) {
			//String str = "java";
			//str.length();
			String language = strings[i];
			System.out.println(strings[i] + "("+language.length()+")");
		}

		// 배열 선언, 생성 ,초기화 동시에
//		String[] teams = new String[] {new String("sk"),new String("lg"), new String("두산"),}; 
//		String[] teams = {new String("sk"),new String("lg"), new String("두산"),}; 
		String[] teams = {"sk", "lg" ,"두산"};
		for (int i = 0; i < teams.length; i++) {
		System.out.println(teams[i]);	
		}
//		다차원 배열
	    String[][] arrays = new String [3][5];
	    arrays[0][0] = "java";
//	    ...
	    arrays[2][4] = "html";
	    
	    for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.println(arrays[i][j]);
			}
		}
		
	}

}
