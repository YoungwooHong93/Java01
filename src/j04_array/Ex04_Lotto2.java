package j04_array;

import java.util.Arrays;
import java.util.Random;

//** Lotto 번호 생성기 만들기
//=> int 를 6개 담을 수 있는 배열 생성 : lotto
//=> Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
// (추가: 단, 중복은 허용하지 않음)
//=> 출력

public class Ex04_Lotto2 {

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
		System.out.println("** 정렬전 Lotto1 => "+Arrays.toString(lotto));

		// 4) 오름차순 정렬
		// => 순차정렬 (Sequence Sort)
		// => 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
		//    배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘
		// ** 정렬 알고리즘 : 삽입(insert)정렬, 합병(Merge)정렬, 퀵(Quick)정렬...
		// => https://blog.naver.com/tepet/221690306235
		for (int i=0; i<lotto.length; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				// ** 오름차순
	            // => i 보다 적은 j 가있으면 서로 맞바꾼다(치환) 
	            // => 끝까지 하면 오름차순 정렬됨.
				// => 성적순 : 내림차순
				// if (lotto[i] < lotto[j]) {
				
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				} //if
				
			} //for_j
			
		} //for_i

		// 5) 정렬후 출력하기
		System.out.println("** 정렬후 Lotto2 => "+Arrays.toString(lotto));
		
		// 6) Wrapper Class 
		// => toString(), sort(), equals() ....
		int[] myLotto = {4, 19, 28, 31, 36, 39};
		Arrays.sort(myLotto);	// default : 오름차순 정렬
		System.out.println("** myLotto => "+Arrays.toString(lotto));
		
		if (Arrays.equals(lotto, myLotto)) System.out.println("** 당첨 **");
		else System.out.println("** 꽝 **");
		
	} //main

} //class
