package ezen.array;

/**
 * 배열 선언, 생성 ,사용하기
 * @author 김규래
 *
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = {99, 78, 90, 100, 75};
		
		// 배열 복사
		int[] array2 = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array2[i] = array[i];
		}
		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + "\\");
		
		}
		System.out.println();
//		for(int i=0; i<array2.length; i++) {
//			System.out.print(array2[i] + "\\");
//		}
				
		//misson: 오름차순 정렬하기..
		// 구현하세요
//		힌트 if 버블 앞에값이 뒤에값보다 크면 if 5번반복
		
		
		int prad;
		for(int i=0; i<array.length; i++) {	
			for(int j=i+1; j<array.length; j++) {
			if(array[i] > array[j]) {
				prad = array[i];
				array[i] = array[j];
				array[j] = prad;
				
			}
			}
		}
	    for(int i=0; i<array.length; i++) {
	    	System.out.print(array[i] + "\\");
	    }
		System.out.println();
	    
	    int prad2;
	    for(int i=0; i<array.length; i++) {	
			for(int j=i+1; j<array.length; j++) {
			if(array[i] < array[j]) {
				prad2 = array[i];
				array[i] = array[j];
				array[j] = prad2;
				
			}
			}
		}
	    for(int i=0; i<array.length; i++) {
	    	System.out.print(array[i] + "\\");
	    }

		
		
		
		
		
		
		}
	}


