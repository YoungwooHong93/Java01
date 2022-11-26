package j02_ifSwitch;

public class Ex01_ifBasic {

	public static void main(String[] args) {
		// ** 삼항식을 if 문으로 변경
		// => a, b 중 큰 수 출력하기
		int a = 10, b = 3;
		int max = (a > b) ? a : b;

		if ( a > b ) max = a;
		else max = b;

		// ** 모든 조건문은 관계식이다.
		// => true / false
		boolean bool = ( a > b ) ? true : false;
		if ( a > b ) bool = true;
		else bool = false;

		// => 동일성 비교
		char cc = ( a == b ) ? 'T' : 'F';
		if ( a == b) cc = 'T';
		else cc = 'F';

		// => 복합문(compound statement)
		//	  여러문장의 경우 중괄호를 사용하여 문장들을 그룹핑 해야함.
		String ss = ( a < b ) ? "참" : "거짓";
		if ( a != b ) {
			ss = "다르다";
			cc = 'T';
			bool = true;
		} else {
			ss = "같다";
			cc = 'F';
			bool = false;
		}

		System.out.println("** 삼항식에 대한 출력 결과**");
		System.out.printf("max = %d, bool = %b, cc = %c ss = %s %n", max, bool, cc, ss);
		System.out.println("");
		// => else 구문은 생략가능 (필요시에만 사용)
		// => a+b 가 100 보다 클때만 (또는 작을때만) "당첨" 출력
		if ( a + b < 100) System.out.println("** 당첨 **");
		// 관계 연산자(>, <, =) 가 산술 연산자(+, -, *, /) 보다 우선순위가 낮다.


	} //main

} //class
