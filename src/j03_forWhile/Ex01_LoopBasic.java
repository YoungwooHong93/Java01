package j03_forWhile;

//** 반복문 의 3요소 : 반복자의 초기값, 조건식(true or false), 증감식
//=> for : for(초기값; 조건식; 증감식)
//=> while, do while : 초기값(before while_Loop), 
//                   조건식(true or false => while 조건문), 
//                   증감식(in while_Loop)

//** 반복자(iterator) 
//=> 반복문에서 횟수를 count 하는 변수

public class Ex01_LoopBasic {

	public static void main(String[] args) {
		// ** 과제
		// => 1 ~ 100 까지의 합 출력하기
		// => 1+2+3+.....+100 의 값 구하기
		// => int result = 1+2+3+.....+100; 은 재사용 불가. (값이 정해져있어서)
		
		// 1) for 문으로 합 구하기
		int result = 0;
		int i = 0;
		for( i = 1; i <= 100; i++) {
			result += i;			// result = result + i;
			// => i 는 1부터 100까지 1씩 증가하면서 반복실행
			// result(0) = 0 + 1	->	result(1) = 1 + 2	-> result(3) = 3 + 3...
		} //for
		System.out.println("** after i => "+ i);
		System.out.println("** for_result => "+ result);
		System.out.println("");

		// 2) while
		result = 0;
		i = 0; // i = 101;
		while (i <= 100) {
			result += i;
			i++;
		}	//while
		System.out.println("** while_result => "+ result);
		System.out.println("");

		
		// 3) do_while
		// => while 과 차이점 : 조건에 맞지 않아도 최소한 1번은 무조건 실행함.
		result = 0;
		i = 0;			// i = 101;
		do {
			result += i;
			i++;				// i 가 1 인 상태로 초기화되면 result 먼저씀.
		} while (i<=100);
			System.out.println("do_while_result => "+result);
		
	} //main

} //class
