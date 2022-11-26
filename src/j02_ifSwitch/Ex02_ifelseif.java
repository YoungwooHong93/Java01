package j02_ifSwitch;

public class Ex02_ifelseif {

	public static void main(String[] args) {

		int score = 99;

		// ** 점수를 이용하여 등급을 처리
		// => score 90 이상:A , 80 이상:B, 70 이상:C, 60 이상:D, 아니면 "F" 출력 
		// => 이상 / 이하 (해당 값이 포함)
		// => 초과 / 미만 (해당 값이 불포함)

		char grade;

		if ( score >= 90 ) {
			grade = 'A';
			System.out.println("** 우수학생 **");
		} else if ( score >= 80 ) 
			grade = 'B';
		else if ( score >= 70 )
			grade = 'C';
		else if ( score >= 60 )
			grade = 'D';
		else {
			grade = 'F';
			System.out.println("** 재시험 대상**");
		};

		System.out.println("** grade1 => "+grade);
		System.out.println("");

		// ** 비교1
		// 아래 if문 처럼 작성하면 마지막 if 문에 해당하는 값이 나옴.
		if ( score >= 90 ) grade = 'A';
		if ( score >= 80 ) grade = 'B';
		if ( score >= 70 ) grade = 'C';
		if ( score >= 60 ) grade = 'D';
		else grade = 'F';

		System.out.println("** grade2 => "+grade);
		System.out.println("");

		// ** 비교2
		// => 중첩 if 구문( if문 내에 if문 포함)
		if ( score >= 90 ) {
			if ( score == 100) System.out.println("** 우수 장학생 **"); 
			grade = 'A';
		} else {
			if ( score >= 80) grade = 'B';
			else {
				if ( score >= 70) grade = 'C';
				else {
					if ( score >= 60 ) grade = 'D';
					else grade = 'F';
				} //C
			} //B
		}; //A

	} //main

} //class
