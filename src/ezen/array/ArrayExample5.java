package ezen.array;

/**
 * 배열 선언, 생성 ,사용하기
 * @author 김규래
 *
 */
public class ArrayExample5 {

	public static void main(String[] args) {
//		int[][] array;
//		array = new int[2][5];
//		array[0][0] = 88;
//		array[0][1] = 90;
//		array[0][2] = 80;
//		array[0][3] = 75;
//		array[0][4] = 99;
//		array[1][0] = 99;
//		array[1][1] = 50;
//		array[1][2] = 100;
//		array[1][3] = 97;
//		array[1][4] = 88;
//		int[][] array = new int[][] {
//									  {88, 98 ,75, 100, 100},
//									  {50, 60, 80, 70, 100}
//									  };
									  
									  
				int[][] array = { 
								{88, 98 ,75, 100, 100},
								{50, 60, 80, 70, 100,}
								};
			
				for (int i = 0; i < array.length; i++) {
					System.out.println((i+1)+"반 성적");
					for (int j = 0; j < array[i].length; j++) {
						System.out.print(array[i][j] + "\t");
					}
					System.out.println();
				}
				
				int sum1 = 0, sum2 = 0;
				System.out.println(" 1반 전체 학생수 :" + array[0].length);
				for (int i = 0; i < array[0].length; i++) {
					sum1 += array[0][i];
				
			
				}
	}
}



