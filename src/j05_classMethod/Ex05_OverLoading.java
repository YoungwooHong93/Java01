package j05_classMethod;

//** Method OverLoading (메서드 오버로딩)
//=> 하나의 클래스내에서 메서드 이름의 중복 허용
//=> 단, 매개변수의 갯수 또는 타입이 반드시 달라야 함.
//=> 장점: 동일한 기능에 대한 메서드명을 통일 시킬 수 있음 

//** 과제
//=> 두수를 입력받아 add 연산 결과를 return 하는 메서드를 만든다.
// 단, 모든 기본자료형의 인자를 사용할 수 있도록 한다. 
// add1(int, int)  add2(int, double)  add3(double, int)  add4(double,double)
// 메소드명이 중복을 허용하지 않으면, 위처럼 불편.

public class Ex05_OverLoading {

	public static int add(int i, int j) {
		return i + j;
	}
	// => 매개변수명이 다른것은 오버로딩에 해당되지 않음
	//   public static int add(int a, int b) {
	//   return a+b; }
	// => 반드시 매개변수의 타입이나 갯수가 달라야 오버로딩이 가능함.
	
	public static double add(int i, double j) {
		return i + j;
	}

	public static double add(double i, int j) {
		return i + j;
	}

	public static double add(double i, double j) {
		return i + j;
	}
	
	public static void main(String[] args) {
		// => 메서드명이 동일하지만 매개변수를 비교해 해당 메서드를 자동으로 찾아 실행함.
		System.out.println("** int, int => "+ add(100,200));
		System.out.println("** int, double => "+ add(100,234.456));
		System.out.println("** double, int => "+ add(123.456,200));
		System.out.println("** double, double => "+ add(123.456,200.789));
		
		System.out.println("** test => "+ add(123.456f,200.789f));
		// float -> double 로 자동 형변환이 되어 연산이 가능.

	} //main

} //class
