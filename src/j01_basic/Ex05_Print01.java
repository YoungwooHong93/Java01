package j01_basic;

import java.util.Arrays;
import java.util.Date;

public class Ex05_Print01 {

	public static void main(String[] args) {
		// ** Escape 문자 : 역할이 정해져 있는 문자
		// => \n 줄바꿈, \t 탭간격, ...
		System.out.println("C:\\Mtest\\MyWork\\Java01\\src\\j01_basic");
		// \ 를 출력하려면 2개를 사용함.
		
		 
		System.out.println("'A' , \"A\"");	// 'A' , \"A\"
		System.out.println("abcd\tefgh\tijk\n");
		System.out.println("\n");
		System.out.println('\n');	// 한문자만(char) 출력하는 경우-> 작은따옴표 허용
		System.out.println('\'');	// char ' 출력 
		System.out.println('A');
		System.out.println('가');
		
		// ** print, println, printf
		System.out.print("print1 => 줄바꿈이 안됨");
		System.out.print("print2 \t");
		System.out.print("print3 \t");
		System.out.print("print4");
		System.out.println("");
		System.out.print("** 줄바꿈이 됨 **");
		
		System.out.printf("금액1 : %,d원 \n", 1234567);
		System.out.printf("금액2 : %9d원 \n", 1234567);		// 오른쪽 정렬
		//	%와 d 사이에 숫자를 넣으면 그 숫자만큼 자리수를 차지하여 출력.
		System.out.printf("금액3 : %-9d원 \n", 1234567);		// 왼쪽정렬
		System.out.printf("금액4 : %,09d원 \n", 1234567);		// , 포함 9자리
		
		System.out.printf("반지름이 %d 인 원의 넓이 => %10.2f \n",10, 10*10*Math.PI);
		System.out.printf("%s는 %d학년 %d반, 학점은 %s 입니다. \n", "홍길동", 2, 5, 'A');
		// 출력Data 와 format이 Type 안맞으면 -> 컴파일오류 없고 런타임오류
		// => java.util.IllegalFormatConversionException
		
		// ** 날짜출력
		//위에 import 대신 java.util.Date 도 사용 가능하나 복잡하여 import 사용 권장. 
		Date now;			// String name; name ="홍길동"; 이런 형식과 동일함.
		now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다. \n", now, now, now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다. \n", now);		//1$를 사용시 1개의 변수에서 데이타를 다 가져옴.
		System.out.printf("지금은 %1$tH시 %1$tM분 %1$tS초 입니다. \n", now);
		
	    // % : 출력형식을 의미하는 문자열은 반드시 %로 시작,
	    // %d : 정수 , %f 실수, %s 문자 
	    // %,d : 정수에 3자리마다  , 표시 
	    // %t : 날짜 시간을  
	    // %n , \n : 줄바꿈
	    // $ 사용하면 매개변수의 갯수를 줄일 수 있음
	    // => %2$d : 2번째 매개변수 10진수
		
		char c = 'A' ;
	    c = 'B' ;
	    int finger = 10 ;
	    long big = 100_000_000_000L ;
	    long hex = 0xFFFF_FFFF_FFFF_FFFFL ;
	    int octNum = 010 ;					 // 8진수 => 8
	    int hexNum = 0x10 ; 				 // 16진수 => 16 
	    int binNum = 0b10 ; 				 // 2진수 => 2 
		
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger = [%5d] %n", finger);
		System.out.printf("finger = [%-5d] %n", finger);
		System.out.printf("finger = [%05d] %n", finger);
		
		System.out.printf("big = %d %n", big);
		System.out.printf("hex = %d %n", hex);
		System.out.printf("hex = %#x %n", hex);		//'#' 은 접두사(16진수 #x, 8진수 #o)
		
		System.out.printf("octNum = %#o %d %n", octNum, octNum);
		System.out.printf("hexNum = %#x %d %n", hexNum, hexNum);
		System.out.printf("binNum = %s %d %n", Integer.toBinaryString(binNum), binNum);
		
		System.out.printf("Float.SIZE = %d %n", Float.SIZE); // 단위는 bit
		
		// -는 왼쪽 정렬방식
	    System.out.printf("%3d %10s %8s %-5d%n",1,"jang","장희정",20);
	    System.out.printf("%3d %10s %8s %-5d%n",22,"hee","정효욱",03);
	    System.out.printf("%3d %10s %8s %-5d%n",3,"rew97","장정희",20);
	    System.out.printf("%3d %10s %8s %-5d%n",4,"jang","장희정",20);
				
	    
	} //main

} //class
