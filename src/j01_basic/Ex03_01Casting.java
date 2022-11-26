package j01_basic;

// ** Type Casting (형변환)
//1. 자동적으로 형변환 (프로모션 promotion , 확대 형변환)
//=> 큰자료형에 작은자료형을 대입하면 : 자동으로 이루어짐

//2. 강제적으로 형변환 (디모션, demotion, 축소 형변환)
//=> 작은자료형에 큰자료형을 대입 : 자동으로 이루어지지않음
//=> 자료의 Type이 다른경우
//=> 명시적 형변환

public class Ex03_01Casting {

	public static void main(String[] args) {
		//1. 자동적으로 형변환 (프로모션 promotion , 확대 형변환)
		double d = 123.456;	//	8byte
		int i = 123456; // 4byte
		d = i;	// 프로모션(자동 형변환 적용)

		System.out.println("** Before Promotion i => " + i);
		System.out.println("** After Promotion d => " + d);
		System.out.println("");

		//2. 강제적으로 형변환 (디모션, demotion, 축소 형변환)
		// => 동일 Type의 경우에도 받는쪽 크기가 작은경우
		// => 자료의 Type이 다른경우
		char c = 'C';	// 2byte
		System.out.println("** char C => " + c + " , " +(int)c);
		i = c+1 ;	// char 산술 연산 시(숫자랑 연산시) 자동 적용.
		System.out.println("** int i => " + i + " , " +(char)i + " , " + c);
		System.out.println("");

		// => 같은 크기 , 다른Type ( int, float )
		float  f = 456.78f;	// 4byte
		int n = 100;	// 4byte
		// n = f;	// Error : Type mismatch -> 디모션(강제형변환)이 필요
		n = (int)f ;
		System.out.println("** int n => " + n);
		f = n;	// 자동 형변환(Promotion)
		System.out.println("** int f => " + f);
		System.out.println("");

		//3. 정수형 연산
		// => 4byte 이하 type 의 정수형 연산의 경우 무조건 그 결과는 int (4byte) 로 처리  
		short s1 = 10, s2 = 20, s3 = 0;
		//	s3 = s1+s2;	//		Error : Type mismatch -> s1+s2 의 연산결과는 int 여서 오류. 그러므로 형변환 필요.
		s3 = (short)(s1+s2);	//		s1,s2 연산을 () 로 묶어 결과를 short 로 형변환.

		//4. by 0 ERROR , 오버플로우(Overflow) / 언더플로우(Underflow)
		//4.1) 정수형
		// => 컴파일 오류 없음
		//    실행(런타임)오류 : java.lang.ArithmeticException: / by zero
		n = 11;
		System.out.println("** 정수형 by 0 , 나누기 => " +(n / 2));
		System.out.println("** 정수형 by 0 , 나머지 => " +(n % 2));
		System.out.println("");
		
		//4.2) 실수형
		// => 컴파일, 런타임(Exception) 오류 없음
		f = 123.456f;
		System.out.println("** 실수형 by 0 , 나누기 => " +(f / 0));		// Infinity
		// Infinity (무한수) -> 오버플로우
		System.out.println("** 실수형 by 0 , 나머지 => " +(f % 0));	// NaN
		// NaN (Not a Number) -> 언더플로우
		System.out.println("");
		
		//4.3) 정수형 연산의 오버플로우(Overflow)/언더플로우(Underflow)
		// 오버플로 및 언더 플로는 변수의 선언 된 데이터 유형 범위를 벗어난 값을 할당 할 때 발생함.\
		// (절대) 값이 너무 크면 오버플로라고하고 값이 너무 작 으면 언더 플로라고함.
		short sMax = Short.MAX_VALUE;
		short sMin = Short.MIN_VALUE;

		// => 오버플로우(Overflow) Test : 최소값과 동일  
		System.out.println("** i: sMax="+sMax+", sMax+1="+(sMax+1)); // 정상적 int 연산
		System.out.println("** s: sMax="+sMax+", sMax+1="+(short)(sMax+1));
		// 최대값(32767) 의 2진표현 : 1111 1111 1111 1111 + 1 
		//						-> 1 0000 0000 0000 0000 -> 2byte만 남게됨
		System.out.println("");
				// => 언더플로우(Underflow) Test : 최대값과 동일 
		System.out.println("** i: sMin="+sMin+", sMin-1="+(sMin-1)); // 정상적 int 연산      
		System.out.println("** s: sMin="+sMin+", sMin-1="+(short)(sMin-1));

	} //main

} //class
