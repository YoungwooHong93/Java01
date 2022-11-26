package j02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

//** 숫자 맞추기 게임
//=> 1~10 범위에서 숫자 하나를 입력받아
//=> Random 함수의 결과와 일치하면 금메달
//=> 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝
//=> Math 클래스를 이용

public class Ex05_switchRandomGame {

	public static void main(String[] args) {
		// 1) Random Number 구하기
		Random rn = new Random();
		int r = rn.nextInt(10)+1;
				
		// 2) myNumber 입력받기
		Scanner sc = new Scanner (System.in);
		System.out.println("** 1 ~ 10 범위의 정수를 입력하세요. => ");
		int myNumber = sc.nextInt();
		sc.close();
		
		// 3) 결과처리
		// int abs = Math.abs(myNumber-r);
		// switch(abs) {
		switch (Math.abs(myNumber-r)) {
		case 0 : System.out.println("** 금메달 **"); break;
		case 1 : System.out.println("** 은메달 **"); break;
		case 2 : System.out.println("** 동메달 **"); break;
		default : System.out.println("**꽝!**");
		}
		
	} // main

} // class
