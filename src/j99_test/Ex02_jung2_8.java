package j99_test;

public class Ex02_jung2_8 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("자바의 정석 연습문제 2-8 해결");
		
		System.out.println("");
		System.out.println(" 자바의 정석 연습문제 2-7 ");
		System.out.println("1" + "2");		// 12
		System.out.println(true + "");		// true
		System.out.println('A' + 'B');		// 131
		System.out.println('1' + 2);		// 51
		System.out.println('1' + '2');		// 99
		System.out.println('J' + "ava");	// Java
		//System.out.println(true + null);	// 오류
		
	} //main

} //class
