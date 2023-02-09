package ezen.array;

import java.util.Iterator;

/**
 * 배열 선언, 생성 ,사용하기
 * @author 김규래
 *
 */
public class ArrayExample3 {

	public static void main(String[] args) {
		// 6개의 로또번호 임의 생성 및 배열에 저장
		int[] lottos = new int [6];
		for (int i = 0; i < lottos.length; i++) {
			 int random = (int)(Math.random()*45)+1; //0.0<= value <1.0;
			 lottos[i] = random;
			 System.out.println("뽑은값" + lottos[i]);
			 for(int j=0;j<i;j++) {
				 System.out.println(lottos[i] + "==" + lottos[j]);
					if(lottos[i]==lottos[j]) {// 비교 
						System.out.println("중복!");
						lottos[i]--; // 중복된값 제거
						break;
					}
				}
		}

			ArrayUtil.sort(lottos);
			
			for (int i = 0; i < lottos.length; i++) {
				System.out.print(lottos[i] + "\t");
			
		
	}

	}
}


