package j01_basic;

//** 변수(Variable) 정의
//=> type, 변수명, value
//=> type 은 불변, value 는 변경가능

//** 상수(Constant)
//=> type 불변, value도 불변
//=> 주로 고정값 에 사용 (pi = 3.141592)
//=> 전체 대문자로 표기

// ** 기본자료형
// => 예약어로 정의된 Type 
// => 더이상 나누어질 수 없는 기본 자료형
// => int, double, boolean, char...
// => 정수형 : 1byte(8bit), short(16bit = 2byte), int(32bit = 4byte), long(64bit = 8byte)
// => 실수형 : float(32bit = 4byte), double(64bit = 8byte)

// ** 참조자료형
// => String
// => 모든 클래스는 참조자료형이 될 수 있음.

class Ex02_Variable01 {

	public static void main(String[] args) {
		// ** 상수 (앞에 final 을 붙여서 선언함. 한번 데이타를 저장하면 바꿀수가 없음.)
		final double PI = 3.141592 ;
//		PI = 2.12345;
		// ** 변수
		String job ="강사";
		String name;
		name = "엄미현";
		int age=20;				// int 타입은 정수만 올수있고 실수를 넣을 시 에러.
		double height = 170.99;	// double 타입은 정수,실수 둘다 가능. 문자열 넣을 시 에러.
		height = 100;
		// ** Type mismatch
		//age = 123.456;		// int Type인데 실수를 사용하여 Error
		//height = "가나다라";		// 정수나 실수 만 사용 가능. 문자열 사용하여 Error
		//name = 12345;			// 문자열만 사용가능. 숫자를 "" 묶으면 사용가능
//		name = 'A';		// 이미 위에서 String에 의해 정의되어 있어 char 사용이 불가.
//		grade = "A";	// char 로 정의되어 있어서 "" 사용이 불가.
		
		name="123.45";	// ""을 사용하여 문자열로 인식시키면 에러가 안나지만 산술 연산은 불가능.
		System.out.println(" test1 = > "+(age+height)); // 190.99
		System.out.println(" test2 = > "+(age+name)); // 20123.45
		// 보라색 글씨는 예약어(컴파일러가 해석하는 명령어)이므로 변수, 클래스 등으로 사용이 불가능.
		// 빨간색 글씨는 자바에서 자주쓰는 것을 클래스로 미리 만들어 놓은 것.
		boolean tf = true;		// true / false
		char grade = 'A';		// char는 한 문자만 가능하고 '' 를 사용함. String 은 ""을 사용.
		grade ='가';
		
		System.out.println("~~ 직업 => "+job);
		System.out.println("~~ 이름 => "+name);
		System.out.println("~~ 나이 => "+age);
		System.out.println("~~ 신장 => "+height);
		System.out.println("~~ 진위 => "+tf);
		
		
	} // main

} //class
