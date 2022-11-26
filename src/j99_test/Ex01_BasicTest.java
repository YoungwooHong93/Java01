package j99_test;

import java.util.Scanner;

//** 복습 과제
//=> 이름과 나이를 입력하면 평생먹은 밥값 계산 후 출력하기
//	 한 끼니당 5000 원으로
//=> 예) 나이: 20살 -> 20 * 365 * 3 * 5000

public class Ex01_BasicTest {

	public static void main(String[] args) {
		// 1) 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요.");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력 하세요.");
		int age = sc.nextInt();
		
		sc.close();

		// 2) 밥값 계산하기
		
		int total = age * 365 * 3 * 5000;
		
		// 3) 출력하기
//		System.out.println("** 이름 =" + name);
//		System.out.println("** 나이 =" + age);
//		System.out.println("** 밥값 =" + total);
		
		System.out.printf("%s 님의 평생 먹은 밥값은 %,d 원 입니다. %n", name, total);
		
	} // main

} // class
