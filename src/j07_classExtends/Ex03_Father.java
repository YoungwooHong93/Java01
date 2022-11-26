package j07_classExtends;

import java.util.Arrays;

// ** static, final 과 상속, main 메서드 정리

// public final class Ex03_Father {
// final 을 붙이면 상속 불가.
public class Ex03_Father {

	static String country = "Korea";
	String name;
	private int money;

	Ex03_Father() {
		System.out.println("** Father default 생성자 **");
	}

	Ex03_Father (String name, int money) {
		this.name = name;
		this.money = money;
		System.out.println("** Father 초기화 생성자");
	}
	// ** 메서드에 final 을 주면
	// => Override 가 금지됨.
	//	public final void bank (int money) {
	//	private final void bank (int money) {
	// => Child 에서도 접근 불가
	public void bank (int money) {
		this.money += money;
		System.out.println("** Father: money => "+ this.money);
		System.out.println("** Father: money => "+ money);
	}
	// ** 메서드에 static
	//public static void bank (int money) {
	// => static 메서드에서는 this, super 사용 불가.
	//this.money += money;
	//System.out.println("** Father: money => "+ this.money);
	//System.out.println("** Father: money => "+ money);
	//}

	public void info() {
		System.out.printf("** Father: country = %s, name = %s, money = %,d \n", country, name, money);
	}

	// ** main 메서드 오버로딩 Test
	// => Error 는 안나지만 사용이 바람직하진 않음.
	//public static void main(String name, int money) {
	//	System.out.printf("** main 오버로딩 Test : name = %s, money = %d \n", name, money);
	//}

	// ** main
	// => JVM 이 클래스를 실행시키는 기본 메서드
	//    그러므로 public static void 여야만 합니다.
	// => 매개변수는 필요시 사용가능함.
	public static void main(String[] args) {

		// ** main 매개변수 args 활용
		// => 실행시 전달 : 하하하 호호호 123 456 (space로 구분)
		System.out.println("main 매개변수 args =>" + Arrays.toString(args));
		System.out.println("");
		// ** main 메서드 오버로딩 Test
		//main("main 오버로딩 Test",12345);

		Ex03_Father f1 = new Ex03_Father("홍길동", 10000);
		f1.bank(50000);
		f1.info();
		System.out.println("");
		
		Ex03_Father f2 = new Ex03_Father("김길동", 5000);
		f2.bank(-10000);
		f2.info();
		System.out.println("");
		
		country = "대한민국";
		f1.info();
		System.out.println("");
		f2.info();
	} //main

} //class
