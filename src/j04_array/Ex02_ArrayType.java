package j04_array;

import java.util.Arrays;

public class Ex02_ArrayType {

	public static void main(String[] args) {
		// => 타입별로 배열을 정의 하고 출력해본다. (묵시적 정의)
		// => float, char, String
		// => data 갯수는 5개
		// 1) float
		float[] weight = {55.5f, 57.5f, 59.5f, 62.5f, 65.5f} ;
		for (float f : weight) {
			System.out.print(f+"\n");
		}
		// 2) char

		char[] grade = {'A', 'B', 'C', 'D', 'E'};
		for(char c : grade) {
			System.out.print(c+" ");
		}
		// 3) String
		String[] food = {"김밥","라면","우동","떡볶이","짜장면"};
		for(String s : food) {
			System.out.println("** String => "+s);
		}

		//** Wrapper Class
		// => 배열을 지원하는 Wrapper Class = Arrays
		System.out.println("** Wrapper Clasee Test **");
		System.out.println("** float => "+Arrays.toString(weight));
		System.out.println("** char => "+Arrays.toString(grade));
		System.out.println("** String => "+Arrays.toString(food));
		
		
		
	} //main

} //class
