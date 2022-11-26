package j02_ifSwitch;

//** switch - case - break 문
//1. => switch(key) 문 인자(매개변수, key)의 Type은 int, char, String 만 가능
//2. => break : 무조건 탈출 (없으면 아래로 계속 default 까지 진행)
//3. => case 블럭에 구문이 없어도 됨 (아래 구문으로 진행됨)
//4. => case 블럭에는 복합구문에도 {....} 중괄호 사용하지 않음 
//5. => case 값으로 변수 사용은 불가 그러나 변수를 사용하지 않은 수식은 허용

public class Ex04_switchBasic {

	public static void main(String[] args) {
		// ** int
		int i = 3;
		switch (i) {
		case 1 : System.out.println("** 1 입력 **");
		break;
		case 2 : System.out.println("** 2 입력 **");
		case 3 : System.out.println("** 3 입력 **");
		case 4 : 
		case 5 : System.out.println("** 5 입력 **");
		default : System.out.println("** default 는 생략 가능 **");
		// break 가 없으면 밑으로 계속 내려가면서 실행된다.
		// case의 순서는 상관이 없다. ex) 1, 4, 2, 5, 3
		// switch문은 해당 값으로 바로 이동하여 
		};

		// ** if ~ else if 와 비교하면
		// => switch 가 더 효율적 ( direct 로 비교하므로 )
		// 1비교 후 2비교 후 3비교를 하여 속도가 느려짐.
		if ( i == 1 ) System.out.println("** 1 입력 **");
		else if ( i == 2 ) System.out.println("** 2 입력 **");
		else if ( i == 3 ) System.out.println("** 3 입력 **");
		else System.out.println("** default 는 생략 가능 **");

		//** double , float 는 사용 불가능.
		/*
		double dd = 2.2;
		switch(dd) {
		case 1 : System.out.println("** 1 입력 **");
				 break;
		}
		 */

		// ** char
		// => 중첩 구문 연습
		// => code = 'A' 인 경우 i 가 짝수이면 i 를 10배로 변경 후 출력
		char code = 'A';
		switch(code) {
		case 'A' : System.out.println("** 예술가 **"); 
		if ( i%2 == 0) {
			i*=10;				//i = i * 10;
			System.out.println("** i = "+i);
		}
		break;
		case 'P' : System.out.println("** 운동선수 **"); break;
		case 'D' : System.out.println("** 개발자 **"); break;
		default : System.out.println("** 학생 **");
		}

		// ** String
		// => 중첩 구문 연습
		// => i 가 홀수이면 color 출력하기
		
		if ( i%2 == 1 ) {
			String color = "red";
			switch(color) {
			case "red" : System.out.println("** 빨강 **"); break;
			case "blue" : System.out.println("** 파랑 **"); break;
			case "green" : System.out.println("** 녹색 **"); break;
			default : System.out.println("** White **");

			} // switch
		} // if
		
		// ** 지역변수 (블럭 내에서만 적용가능)
		// => 선언된 내부에서만 사용가능
		// System.out.println("** color => "+color);
	
	} //main

} //class
