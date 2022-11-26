package j04_array;

import java.util.Arrays;

// p. 139 예제 5-4
// 배열 활용 (섞기 shuffle)
// => 길이가 10인 배열 정의 하고, 0~9 로 초기화
// => random 을 이용해서 배열의 임의의 위치에 있는 배열의 값과
//	  배열의 첫번째[0] 값과 교환하는 일을 100번 반복해서 배열을
//	  뒤섞이도록 한다.

public class Ex05_shuffle {

	public static void main(String[] args) {
		// 1) 배열 정의 및 초기화
		int[] numArr = { 0, 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 };
		System.out.println("** numArr1 => "+Arrays.toString(numArr));
		
		// 2) 섞기 shuffle 100회
		for (int i=0; i<100; i++) {
			// random 을 이용해서 배열의 임의의 위치 찾기
			int n = (int)(Math.random() * 10);	// double 은 실수 이므로 *10을 하여 0~9 중의 한 값을 임의로 얻는다.
			// Math.random => double(실수 타입) -> (int) 정수로 형변환
			// (Math.random() * n) => n 보다 작지만 무한히 가까운 수들이 만들어진다.
	        // 예제가 0 부터라서 그냥 10 썼지만 1부터 쓰려면 random() * n + 1 해야됨.
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
			
		}
		System.out.println("** numArr2 => "+Arrays.toString(numArr));

		
		
	} //main

} //class
