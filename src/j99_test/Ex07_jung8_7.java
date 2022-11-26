package j99_test;

import java.util.Scanner;

public class Ex07_jung8_7 {

	public static void main(String[] args) {

		// 1 ~ 100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.print("1 과 100 사이의 값을 입력하세요 :"); 
			//input = new Scanner(System.in).nextInt();
			// => 숫자가 아닌값을 입력받으면 : java.util.InputMismatchException
			//	  문제 : 여기에 대응할 수 있는 코드로 수정한다.
			
			try {
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Exception => "+e.toString());
				System.out.println("유효하지 않는 값 입니다. 다시 입력하세요.");
				continue;
			} //try
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요."); 
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요 ."); 
			} else {
				System.out.println("맞췄습니다."); 
				System.out.println("시도횟수는 "+count+"번입니다."); 
				break; // do-while문을 벗어난다
			}
		} while(true); // 무한반복문
		sc.close();
		
		System.out.println("** Program 정상 종료 **");

	} //main

} //class
