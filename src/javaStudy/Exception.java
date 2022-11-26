package javaStudy;

public class Exception {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int p = i/j;
			System.out.println(p);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다." +e.toString());
		}
		System.out.println("main end");
		
	} //main

} //class
