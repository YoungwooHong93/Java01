package j04_array;

import java.util.Arrays;
import java.util.Random;

//** 과제
//=> Lotto 배열 2개를 준비.
// 당첨번호, MyNumber 
//=> 두배열 모두 Random 으로 초기화
//=> 중복확인, 정렬(직접작성)
//=> 당첨확인 (일치여부만 확인)

//*** Random 클래스
//=> java.util 에 있으므로 import 필요하고, new 선언후 사용가능함.
//=> Random() : 호출시마다 현재시간을 이용한 종자값이 자동 설정됨 
// Random(long seed) : 인자값으로 주어진 종자값이 설정됨 
// 종자값 : 난수 만드는 알고리즘에서 사용되는 값
//         ( 같으면 같은난수 얻음 )
//
//=> Random().nextInt(큰수 - 작은수 + 1) + 작은수 
// Random().nextInt() , Random().nextLong() , Random().nextBoolean()
// Random().nextDouble() ,  Random().nextFloat()

public class Ex04_Lotto03 {

	public static void main(String[] args) {
		// 1. Lotto 배열 2개를 준비
		int[] lotto = new int[6];
		int[] MyNumber = new int[6];
		Random rn = new Random();

		// 2. 당첨번호 만들기
		// => 중복확인, 오름차순정렬 직접 작성하기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rn.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					--i; break;
				} //if
			} //for_j
		} //for_i
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				} //if
			} //for_j
		} //for_i

		System.out.println("** 당첨 번호 => "+Arrays.toString(lotto));
		// 3. MyNumber 만들기
		// => 중복확인, 오름차순 정렬 (Arrays.sort 이용)
		rn = new Random();
		for (int i = 0; i < MyNumber.length; i++) {
			MyNumber[i] = rn.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(MyNumber[i] == MyNumber[j]) {
					--i; break;
				} //if
			} //for_j
		} //for_i
		
		for (int i = 0; i < MyNumber.length; i++) {
			for (int j = i+1; j < MyNumber.length; j++) {
				Arrays.sort(MyNumber);
			} //for_j
		} //for_i

		System.out.println("** My Number => "+Arrays.toString(MyNumber));

		// 4. 당첨확인
		if(Arrays.equals(lotto, MyNumber)) System.out.println("** 당첨 **");
		else System.out.println("** 꽝 **");
	} //main

} //class
