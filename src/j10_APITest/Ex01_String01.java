package j10_APITest;

// ** String 1
// 1) 선언(정의) 과 인스턴스
// => 묵시적, 명시적
// => 참조형변수 : 주소값을 가지고 있음

public class Ex01_String01 {

	public static void main(String[] args) {
		// 1) 묵시적 선언
		String s1 = "그린";
		String s2 = "그린";
		
		// 2) 명시적 선언
		String s3 = new String("그린");
		String s4 = new String("그린");
		
		// => 값 출력 비교
		System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s \n",s1 ,s2 ,s3, s4);
		System.out.println("");
		
		// => 값 변경 전 / 후 비교
		s1 = "홍길동"; s3 = "홍길동";
		
		// 3) 인스턴스 비교
		// => 묵시와 묵시 : True / False
		if (s1 == s2) System.out.println("s1 == s2 : True");
		else System.out.println("s1 == s2 : False");
		System.out.println("");
		
		// => 묵시와 명시 : False / True
		if (s1 == s3) System.out.println("s1 == s3 : True");
		else System.out.println("s1 == s3 : False");
		System.out.println("");
		
		// => 명시와 명시 : False / False
		if (s3 == s4) System.out.println("s3 == s4 : True");
		else System.out.println("s3 == s4 : False");
		System.out.println("");
		
		// 4) 값 (리터럴) 의 비교 : False
		if (s1.equals(s2)) System.out.println("s1 == s2 : True");
		else System.out.println("s1 equals s2 : false");
		System.out.println("");
		
		if (s3.equals(s4)) System.out.println("s3 == s4 : True");
		else System.out.println("s3 equals s4 : false");
		System.out.println("");

		// 5) length(글자수), 문자열연산
		s2 = "My name is Green";
		s3 = "안녕 하세요 ~~ ";
		System.out.println("** 영문 글자수 =>"+s2.length()); // 16
		System.out.println("** 한글 글자수 =>"+s3.length()); // 10
		System.out.println("");
		
		int i = 100, j = 123;
		System.out.println("** 문자열 연산 =>"+s1+s2+s3+s4+i+j);
		System.out.println("** 문자열 연산(우선순위) =>"+s1+s2+s3+s4+(i+j));
		
		
	} //main

} //class
