package j01_basic;

//** 기본자료형의 종류 와 Wrapper Class , 치환 **

//** 용어정리
//=> identifier: 직접작명하는 식별자 (프로젝트, 클래스, 메서드, 변수, 상수 등의 이름) ※예약어 사용 금지, 대소문자 규칙 지켜야함.
//=> modifier: 특징을 제한하는 한정자 (public, static..등 예약어의 일종) ※특징을 제한하는 것들.
//=> literal: 변수 우측의 값(Value) 

//** identifier 작명의 일반적 규칙
//=> project, class 명은 대문자로 시작.
//=> 상수명은 전체대문자로 작성. 
//=> 위외는 모두 소문자로 시작. ( 합성: setName => camel 표기법)
//=> 글자나 단어 사이에 공백이 들어가면 안됨.
//=> 한글: 허용은 되지만 권장하지 않음 (사용 X)
//=> 연산자(+,-,*,/,%) 는 식별자에 포함할 수 없음
//=> 한번 선언된 변수명은 재선언 할수 없음 
//( 동일한 identifier 를 중복 선언할 수 없음 )

//=> 변수명 의 규칙 (ppt J03_01 , 8p)

public class Ex02_Variable02 {

	public static void main(String[] args) {
		// ** 한글 Test
		String 이름 = "홍길동";						// 권장하지 않음. ( 한글변수 )
		System.out.println("** 이름 = "+이름);
		String ireum = "김길동";					// 권장하지 않음. ( 한글을 발음나는 대로 영어로 사용하는 것. )
		// 

		// ** 정수형
		// => byte(8), short(16 = 2byte), int(32 = 4byte), long(64 = 8byte)
		byte b = 10;			// 선언과 동시에 값을 할당 : 초기화
		short s = 123;			// 선언, 선언과동시에 초기화
		int i;					// 선언
		i = 1234567890;			// 값을 할당
		// Java 는 정수 literal 을 int 로 취급
		// => int 를 초과하는 정수 literal 을 표현 못함.
		// => L/l : 반드시 long Type literal 임을 표시해야함.
		long l = 1234567890123L;

		// ** 실수형
		// => float(32bit = 4byte), double(64bit = 8byte)
		double d = 123.456;
		//		float f = 123.456;	// 4byte = 8byte : Error
		float f = 123.456f;	// f/F 모두 허용

		// ** Wrapper Class
		// => 기본 자료형을 지원해주는 클래스(모든 기본자료형에 있음)
		//	  해당 클래스명은 기본 자료형의 첫글자를 대문자로 하면됨.
		System.out.println("** 정수형의 Literal 범위 **");
		System.out.println("** byte => "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		System.out.println("** short => "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("** int => "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("** long => "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.printf("** long_printf => %d ~ %d \n", Long.MIN_VALUE, Long.MAX_VALUE);	// \n 줄바꿈(escape 문자)

		//		printf 는 포맷을 지정하는 
		System.out.println("** 실수형의 Literal 범위 **");
		System.out.printf("** float => %f ~ %f \n", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("** double => %f ~ %f \n", Double.MIN_VALUE, Double.MAX_VALUE);

		// 일반적으로 int 와 double 을 사용함.

		// ** boolean
		boolean bool; 	// true(1) , false(0) 값을 가짐. 
		bool = b > s;	// 관계식 -> 결과는 true / false 둘 중 하나, 늘 boolean Type
		System.out.printf("** boolean Test => %b \n ",bool);

		// ** char
		// => 한글, 영문 모두 한글자를 의미, 2byte
		// => 2byte int Type 으로도 사용가능
		// => ASCII Code (American Standard Code for Information Interchange)
		char aa = 'A', bb = 'B', cc = 'C';
		cc = '가';	// 한글자 이상은 들어갈수가 없음.
		String ss = "한글자 이상 가능";

		System.out.println("** String + char => " +ss+cc);			// 문자열 연산이 가능. => 한글자 이상 가능가
		System.out.println("** char + char 1 => " +aa+bb+cc);		// 문자열 연산이 가능. => AB가
		System.out.println("** char + char 2 => " +(aa+bb+cc));		// 우선순위 적용 시 int 연산 
		//		System.out.printf("** aa=%d, bb=%d, cc=%d \n",aa ,bb ,cc);	// Error
		System.out.printf("** aa=%d, bb=%d, cc=%d \n",(int)aa ,(int)bb ,(int)cc);
		// (int) ss => Error (String) 이여서 int로 형변환이 안됨.

		System.out.printf("** aa=%s, bb=%s, cc=%s \n",aa ,bb ,cc);

		// ** 치환
		// => 값의 맞교환 (cup1 의 값과 cup2의 값을 교환)
		// => box 내에 여러값이 들어있는데 그중 어떤값이 cup1 , cup2 의 값이 될지 모른다고 가정
		// => 중간 보관을 위한 같은 타입의 임시 변수가 필요함
		// => "=" 동일성을 의미하는것이 아니고 대입연산자

		String cup1 = "콜라";
		String cup2 = "사이다";
		String temp = cup1;
		cup1 = cup2;
		cup2 = temp;

	} //main

} //class
