package j02_ifSwitch;

import java.util.Scanner;

//** 실습 : 
//1. 월을 입력 받아서 
//2. 몇일까지 인지,  
// => 1,3,5,7,8,10,12월 => ?월은 31일 까지 입니다.
// => 4,6,9,11 월 => ?월은 30일 까지 입니다.
// => 2 월 => ?월은 29일 까지 입니다.
//3. 무슨 계절인지 출력 하기
//  => 3~5:봄 , 6~8:여름, 9~11:가을, 12~2:겨울

//** switch case 구문으로 작성 하세요 ~~


public class Ex06_switchMonth {

	public static void main(String[] args) {
		
		// 1) month 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("** 1 ~ 12 범위의 숫자를 입력하세요. => ");
		int month = sc.nextInt();
		sc.close();
		
		String s1, s2 ;
		
		// 2) 몇일까지 인지 확인
		/* 예전 방식
		switch(month) {
		case 1 : case 3 : case 5 : 
		case 7 : case 8 : case 10 : 
		case 12 : s1 = "31"; break;
		
		case 11 : case 9 : case 6 : 
		case 4 : s1 = "30"; break;
		
		case 2 : s1 = "29"; break;
		
		default : s1 = "Error";
		}
		*/
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : s1 = "31"; break;
		case 11, 9, 6, 4 : s1 = "30"; break;
		case 2 : s1 = "29"; break;
		default : s1 = "Error";
		}
		
		// 3) 무슨 계절인지 출력 하기
		switch(month) {
		case 12, 1, 2  : s2 = "겨울"; break;
		case 3, 4, 5   : s2 = "봄"; break;
		case 6, 7, 8   : s2 = "여름"; break;
		case 9, 10, 11 : s2 = "가을"; break;
		default : s2 = "Error";
		}
		
		System.out.printf(" %d 월은 %s 까지 있고, %s 입니다. %n",month ,s1 ,s2);
		
	} //main

} //class
