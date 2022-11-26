package j99_test;

//** 정석 연습문제 3_6
//아래는 화씨 를 섭씨 로 변환하는 코드이다.
//변환공식이 (Fahrenheit) (Celcius) . 'C =5/9 ×(F - 32)' 라고 할 때 
//에 알맞은 코드를 넣으시오.
//단 변환 결과값은 소수점 셋째자리에서 반올림해야한다.
//(Math.round() ) 를 사용하지 않고 처리할 것 .

public class Ex02_jung3_6 {

	public static void main(String[] args) {

		int fahrenheit = 100;
		// 과제 : float celcius = ???? ;

		float celcius1 = (5/9f) * (fahrenheit - 32);		// 공식
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius1:" + celcius1);
		System.out.println("");
		// 어떠한 결과를 소수점 셋째자리에서 반올림해야 할 때
		// => (int)(결과에 * 100) + 0.5 / 100f
		float celcius2 = (int)(celcius1 * 100 + 0.5) / 100f;

		System.out.println("** 소수점 셋째자리에서 반올림 **");
		System.out.println("Celcius2:" + celcius2);

	} //main

} //class
