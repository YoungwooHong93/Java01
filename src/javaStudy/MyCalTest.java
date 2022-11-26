package javaStudy;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		int j = Calculator.exec2(3, 4);
		
		System.out.println(j);
		
		
	} //main

} //class
