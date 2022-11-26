package j04_array;

public class Ex01_ArrayBasic {

	public static void main(String[] args) {
		// ** 과제
		// => 5명의 성적을 처리한다고 가정
		int s1 = 11, s2 = 22, s3 = 30, s4 = 40, s5 = 50;
		int sum = s1+s2+s3+s4+s5;
		double avg = (double)sum / 5;

		// ** 배열 : 동일성격의 동일Type 의 자료를 하나의 묶음으로 처리 
		// 장점 => 일괄처리 (반복문적용)
		// 특징 => 동일타입, 모든 자료형에 적용가능 (기본자료형(int,char...), 참조자료형(String, Class 타입))
		// 방법
		// => 선언 후 사용 : 명시적선언, 묵시적선언      
		// => 크기(length), 인덱스(0 부터 length-1)

		// 1. 명시적 선언 (new 연산자 이용)
		// => 크기를 반드시 지정
		// int[] score = new int[5]; // 명시적 선언. 5는 크기를 의미함. int(4byte) 5개 지정.
		// => [] 위치 : 변수뒤에도 가능.
		//			   int test[] = new int[5]
		// int score[] = new int[5];
		int score[] ;			// 변수 이름만 정의 -> score 를 int Type 의 배열로 사용하겠다 라는 의미.
		int len = 5;			// int len ; 은 크기가 없어 오류.
		score = new int[len];	// int i; i=100; 이 형식과 동일.
		// => 위의 int len = 5; 와 같이 변수가 값을 가지고 있는 경우에는 그 변수로 크기 지정가능.

		// 2. 초기화
		score[0] = 10;
		score[1] = 11;
		score[2] = 12;
		score[3] = 13;
		score[4] = 14;
		//score[5] = 15;	// 런타임에서 오류가 발생함. -> java.lang.ArrayIndexOutOfBoundsException

		// 3. 합계출력
		sum = score[0]+score[1]+score[2]+score[3]+score[4]; //+score[5] 배열 크기를 벗어나면 런타임 시 오류 발생.
		System.out.println("** score 의 크기 => "+score.length);
		System.out.println("** sum => "+sum);

		// 4. 배열을 사용하여 일괄처리 (반복문)
		// => 학생들 점수 출력과 합계 계산
		sum = 0;
		for (int i=0; i<score.length; i++) {
			sum += score[i];
			System.out.printf("%d 번 , %d 점 \n", i, score[i]);
		}
		System.out.println("** sum2 => "+sum);

		// 5. 묵시적 정의
		// => new 연산자를 사용하지 않고, 선언과 동시에 초기화.

		int[] score2 = {50, 60, 70, 80, 90};

		// 6. eachFor (쉬운, 간편한 for 구문)
		// for each 문 : JDK5.0 부터 지원되는 향상된 for 문 
		// for (변수타입 변수명 : 배열이름 ) { 실행부  }
		// => 배열의 요소의 갯수(배열의 크기) 만큼 반복 하며
		//    배열  score 가 가지고 있는 값을 순차적으로  변수(s) 에 전달 
		// => 주의사항
		//    배열의 값만 순차적으로 사용가능하며 read만 가능. write 불가능
		//    (순차처리, readOnly)
		sum = 0;
		for (int s:score2) {	// 차례대로 score2의 데이타를 s에 담아준다. 
			System.out.printf("점수 = %d \n",s);
//			s+= 50;
			sum+=s;
		}
		System.out.println("** sum3 => "+sum);
	} //main

} //class
