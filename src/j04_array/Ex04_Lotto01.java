package j04_array;

import java.util.Arrays;
import java.util.Random;

//** Lotto 번호 생성기 만들기
//=> int 를 6개 담을 수 있는 배열 생성 : lotto
//=> Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
// (추가: 단, 중복은 허용하지 않음)
//=> 출력

public class Ex04_Lotto01 {

	public static void main(String[] args) {
		// 1) 배열정의
		int lotto[] = new int[6];

		// 2) Random 으로 배열 초기화
		// => 중복을 허용하지 않음
		Random rn = new Random();
		for (int i=0; i<lotto.length; i++) {
			// 2.1) random number 추출 & 배열에 담기
			lotto[i] = rn.nextInt(45)+1;	// 정수/45 -> nextInt 는 % 연산으로 되어있음.
			// 2.2) 중복 값 확인하기
			// => 값이 동일한 자료가 존재하는지 확인 (동일 자료 찾아보기 : search)
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					--i; break;
				} //if
			} //for_j

		} //for_i

		// 3) 출력하기
		System.out.println("** Lotto => "+Arrays.toString(lotto));

		// 4) 최대값 & 최소값 출력하기
		int max = lotto[0], min = lotto[0];
		for (int i = 1; i < lotto.length; i++) {
			// => 최대값
			if (lotto[i] > max) max = lotto[i];
			// => 최소값
			if (lotto[i] < min) min = lotto[i];
					
		} //for
		System.out.println("** 최대값 => "+max);
		System.out.println("** 최소값 => "+min);
		
		// 5) 오름차순 정렬
		// => Lotto02 에서


	} //main

} //class
