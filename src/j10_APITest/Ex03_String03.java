package j10_APITest;

import java.util.Arrays;

// ** String 3
// => String 의 메서드
// => 문자열 변경
//	  -> toLowerCase, toUpperCase, replace, split
//	  -> Type 변경 : int to String, String to int

public class Ex03_String03 {

	public static void main(String[] args) {
		// 1) 문자열 변경
		String name="홍길동" ;
		String city="~~~~~SeoulKorea~~eee";
		String country="     !I!Love!Korea!     ";

		// 1.1) toLowercase, Uppercase
		System.out.printf("** toLowerCase =>  %s, %s \n", city.toLowerCase(), name.toLowerCase());
		System.out.printf("** toUpperCase =>  %s, %s \n", country.toUpperCase(), name.toUpperCase());
		System.out.printf("** value 확인 =>  %s, %s, %s \n", country, city, name);
		System.out.println("");
		// => 복습 : city 에서 Korea 만 모두 대문자로 출력하기
		System.out.printf("** toUpperCase =>  %s \n", city.substring(city.indexOf("K"), city.indexOf("a")+1).toUpperCase());


		// 1.2) replace
		System.out.printf("** value 확인 =>  %s, %s, %s \n", country.replace("Korea", "대한민국"), 
				city.replace("e", "Apple"), name.replace("이", "김")); // 해당사항이 없으면 실행을 안할뿐 오류는 안남.

		// 2) split
		// => 인자로 전달된 기호를 기준으로 잘라 배열에 담아줌

		String[] ss = country.split("!");
		System.out.println("** split 1 => "+Arrays.toString(ss));

		// => 양옆의 스페이스를 제거하고 처리하기
		ss = country.trim().split("!");
		System.out.println("** split 2 => "+Arrays.toString(ss));

		// 3) 형변환
		// => String < -- > int
		// => String < -- > double, float
		// 3.1) String -> int, double, float (Wrapper Class 이용)

		// 3.2) int, double..(숫자) -> String

		String num1 = "12345";
		String num2 = "100";
		System.out.println("** Test1 문자열 연산 => "+num1+num2);
		System.out.println("** Test2 산술 연산(int) => "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
		//num2 = "100a";	// -> 런타임오류 : java.lang.NumberFormatException
		//System.out.println("** Test2 산술 연산 => "+(Integer.parseInt(num1)+Integer.parseInt(num2)));

		num1 = "123.456";
		num2 = "200.300f";	// "200.300" : parseFloat 적용가능
		//num2 = "200.300t"; // -> 런타임오류 : java.lang.NumberFormatException
		System.out.printf("** Test2 산술 연산 : double = %f, float = %f \n",Double.parseDouble(num1),Float.parseFloat(num2));

		// 3.2) int, double..(숫자) -> String
		int i = 10, j = 20;
		//num1 = i; // -> 런타임오류 : Type mismatch Error
		num1 = i+j+"";	// 30 -> 수식에 문자가 포함되면 문자열연산 (자동으로 형변환)
		num2 = ""+i+j;	// 1020
		System.out.println("** Test3 num1 => "+num1);
		System.out.println("** Test3 num2 => "+num2);

		// => 기본 자료형의 값을 문자열로 바꾸기 : valueOf()
		//    모든 기본자료형 적용 가능 
		//    static String valueOf(boolean b)
		//    boolean, char, float, int, long .. 
		double d = 1234.567;
		// num1 = d; // Type mismatch Error
		num1 = String.valueOf(d);
		num2 = "true"; // => "true" boolean Type 과는 무관한 String 타입.
		num2 = String.valueOf(true);
		// 비교 -> num2 = "true" : String 타입이라 가능. / num2 = true -> Type mismatch Error
		num2 = String.valueOf(i>j);

		// 4) 비교 : compareTo
		// => 사전 순서로 비교 
		//    같으면 0, 이전이면 음수, 이후면 양수 return (사전순으로 해서)
		// => 첫 글자 문자가 일치하면 : 다른 글자 갯수를 표시함 (abc:ab , abc:abcd)
		// => 문자가 완전 다르면 알바펫 순서의 차이를 return
		//    ( comparTo는 같은 위치의 문자만 비교하기 때문에, 
	    //    첫번째 문자부터 순서대로 비교해서 다를 경우 바로 아스키값을 기준으로 비교처리를 한다. )
		// abc : japan -> -9 / abc : korea -> -10 / acb : love -> -11
		name = "abc";
		System.out.println("** 비교1 => "+name.compareTo("abc")); 		// 0
		System.out.println("** 비교2 => "+name.compareTo("ab"));  		// +1
		System.out.println("** 비교3 => "+name.compareTo("a")); 			// +2
		System.out.println("** 비교4 => "+name.compareTo("bc")); 			// -1
		System.out.println("** 비교5 => "+name.compareTo("c")); 			// -2
		System.out.println("** 비교6 => "+name.compareTo("abcabc"));		// -3
		System.out.println("** 비교7 => "+name.compareTo("abcabcd"));		// -4
		System.out.println("** 비교8 => "+name.compareTo("korea"));		// -10
		
		// => if 적용시 주의
		//if (name.compareTo(num2)) 이렇게 쓰면 에러.
		if (name.compareTo(num2) == 0) {}

		// 5) 포함확인
		System.out.println("** 포함확인1 => "+country.contains("Korea"));	// true
		System.out.println("** 포함확인2 => "+country.contains("korea"));	// false (대소문자 구분)
		

	} //main

} //class
