package j01_basic;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {
		// 1. 입력받기
		Scanner sc = new Scanner(System.in);	// String name = "홍길동";
		System.out.println("** 이름을 입력 하세요 ~~ => ");
		String name = sc.nextLine();	// 입력완료(Enter_Key)까지 대기, 입력완료된 값을 return

		System.out.println("** 나이를 입력 하세요 ~~ => ");
		//	int age = Integer.parseInt(sc.nextLine());
		int age = sc.nextInt();			// nextInt는 입력한 값만 가져와서 Enter_key 값이 남아있음.

		System.out.println("** 금액을 입력 하세요 ~~ => ");
		int price = sc.nextInt();		// 정상적으로 실행됨.

		System.out.println("** 메뉴을 입력 하세요 ~~ => ");
		String menu = sc.nextLine();
		// 위에 nextInt의 Enter_key 값을 인식하기 때문에 다음 문장으로 넘어가버림.

		// 2. 출력하기
		System.out.println("** 이름 => "+name);
		System.out.println("** 나이 => "+age);
		System.out.println("** 금액 => "+price+"원");
		System.out.println("** 메뉴 => "+menu);

		sc.close();

	} //main

} //class
