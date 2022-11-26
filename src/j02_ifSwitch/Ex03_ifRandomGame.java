package j02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

//** 숫자 맞추기 게임
//=> 1~10 범위에서 숫자 하나를 입력받아
//=> Random 함수의 결과와 일치하면 금메달
//=> 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝
//=> Math
public class Ex03_ifRandomGame {

	public static void main(String[] args) {
		// 1) Random Number 구하기
		Random rn = new Random();
		int r = rn.nextInt(10)+1;	// +1은 최소값 자리 () 는 최대값 자리
		
		// 2) myNumber 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("** 1 ~ 10 범위의 정수를 입력하세요. => ");
		int myNumber = sc.nextInt();
		sc.close();
		
		// => 입력 값 확인
		//	  1 ~ 10 :	1 <= myNumber <= 10	: 이런 식은 XXX
		if ( !(myNumber >=1 && myNumber <= 10) ) {
		// ( myNumber < 1 || myNumber > 10 )
		
			System.out.println("잘못 입력 했습니다. 다시 입력 하세요.");
			return;
		// void 메서드에서 return 을 단독으로 사용 시 메서드 종료를 의미. 그래서 밑으로 진행이 안됨.
		}
		
		// 3) 결과처리
		//=> Random 함수의 결과와 일치하면 금메달
		//=> 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝
		//=> 절대값을 지원하는 Math 클래스의 메서드 abs 적용
		if ( myNumber == r) System.out.println("** 금메달 **");
		else if ( Math.abs(myNumber-r)==1 ) System.out.println("** 은메달 **");
		else if ( Math.abs(myNumber-r)==2 ) System.out.println("** 동메달 **");
		else System.out.println("**꽝!**");
		System.out.println("");
		
/*	위의 식과 비교
		if ( myNumber == r ) System.out.println("**금메달**");
		else if ( myNumber - r == 1 || myNumber - r == -1 ) System.out.println("**은메달**");
		else if ( myNumber - r == 2 || myNumber - r == -2 ) System.out.println("**동메달**");
		else System.out.println("**꽝!**");
*/
		System.out.println("** 당첨번호 => "+r);
		System.out.println("** myNumber => "+myNumber);
		
	} // main

} // class
