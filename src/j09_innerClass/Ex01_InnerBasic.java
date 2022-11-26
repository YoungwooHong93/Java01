package j09_innerClass;

import j07_classExtends.Ex02_Animal;

//** 클래스 맴버
//=> 맴버(전역)변수, 
//=> 메서드 : 생성자, main, setter/getter, toString, 일반메서드
//=> 초기화 블럭 : {  } / static {  }
//=> 내부(inner) 클래스 : 클래스 내부에 다른 클래스를 정의

//** Inner Class 기본형식과 특성

class OuterClass {
	// 1) 멤버(전역)변수
	int age = 100;
	private String name = "홍길동";
	static String grade = "A++";
	// ** 멤버변수로 클래스 사용
	// => has-a 관계 : 재사용성이 많은경우 
	// => inner 클래스와 비교 : 여기서만 필요한 경우
	Ex02_Animal animal;

	// 2) 생성자 및 메서드
	OuterClass() {
		System.out.println("** OuterClass default 생성자 **");
	}


	// => 위 외에 메서드 : main, setter/getter, toString, 일반메서드 ...

	// 3) 클래스
	// => 내부(inner) 클래스
	// => 외부(outer) 클래스 의 모든멤버(private 포함) 에 접근가능
	
	class Inner {
		//static class Inner {
		//static String country = "Korea";
		// => 내부 클래스(Inner Class) 가 static 변수를 사용하려면, 해당 내부 클래스도 static 이어야 한다.
		// => static 내부 클래스
		// => 단, JavaSE-16 부터는 일반내부 클래스도 static 변수 허용함.
		Inner() {
			System.out.println("** Inner default 생성자 **");
		}
		
		public void printData() {
			System.out.println("** Inner printData : age => " +age);
			System.out.println("** Inner printData : name => " +name);
			System.out.println("** Inner printData : grade => " +grade);
		} //printData
	} //Inner
	
} //OuterClass

public class Ex01_InnerBasic {

	public static void main(String[] args) {
		OuterClass out1 = new OuterClass();
		// => Outer 클래스만 생성 시 : Outer 에 정의된 멤버만 접근 가능.(Inner의 멤버는 접근 불가)
		// => Inner 클래스 생성
		//Inner in1 = new Inner(); -> Outer에 종속되어 있으므로 독립적 생성은 불가능.
		OuterClass.Inner in1 = out1.new Inner();
		in1.printData();

		// ** Inner 클래스를 직접 생성
		//OuterClass.Inner in2 = new OuterClass().Inner(); -> Error
		OuterClass.Inner in2 = new OuterClass().new Inner();
		in2.printData();

		// ** static 멤버 Test
		System.out.println("** OuterClass.grade => "+OuterClass.grade);
		//System.out.println("** Inner country => "+OuterClass.Inner.country);
	} //main

} //class
