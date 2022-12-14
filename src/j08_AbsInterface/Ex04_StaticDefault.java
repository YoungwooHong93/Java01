package j08_AbsInterface;

// ** interface 3
// => 상수, 추상메서드
// => static, default 메서드 (구현부가 있는 메서드, Java8 부터 추가됨)

//** static, default
//=> 반드시 바디를 구현 해야함
//=> 구현클래스의 오버라이딩 의무 없음

interface NewInter {
	// ** 추상메서드 : 반드시 헤더만 정의, 구현(바디)부는 없어야함.
	void test();	// 앞에 public abstract 생략되어있음. 
	
	// ** static
	//static void staticTest(); //static 을 붙이면 반드시 {} 가 있어야함. => ERROR
	static void staticTest() {
		System.out.println("** interface : staticTest() **");
		System.out.println("");
	} //staticTest
	
	// ** default
	// => 인터페이스에만 허용, 오버라이딩 의무는 없지만 필요 시 가능함.
	//default void defaultTest1(); // default 를 붙이면 반드시 {} 가 있어야함. => ERROR
	default void defaultTest() {
		System.out.println("** interface : defaultTest() **");
		System.out.println("");
	}
	
} //NewInter

class NewTest implements NewInter {
	@Override
	public void test() {
		System.out.println("** NewTest : test() 오버라이드 **");
		System.out.println("");
	} //test
	
	// ** default 메서드 오버라이딩
	// => 필요시에는 default 없이 오버라이딩 허용
	// => 오버로드도 허용함.
	@Override
	public void defaultTest() {
		// => 조상이 interface 인 경우의 접근방법
		NewInter.super.defaultTest();
		System.out.println("** NewTest : defaultTest() 오버라이드 **");
		System.out.println("");
	} //defaultTest
	
	public void defaultTest(int i) {
		System.out.println("** NewTest : defaultTest() 오버로드 i => **"+ i);
		System.out.println("");
	} //defaultTest
	
	// ** static
	// => 클래스 또는 인터페이스 종속이므로 동일 메서드명 허용됨
	//	  static 또는 인스턴스 메서드 모두 가능
	//	  (비교 : 조상이 클래스인 경우에는 인스턴스 메서드는 불가능)
	
	static void staticTest() {
	//void staticTest() {
		System.out.println("** NewTest : staticTest() **");
		System.out.println("");
	} //staticTest
	
	// => 조상 인터페이스와 무관한 static method
	static void staticTest2() {
		//void staticTest() {
		System.out.println("** NewTest : staticTest2() **");
		System.out.println("");
	} //staticTest2
	
} //NewTest

public class Ex04_StaticDefault {

	public static void main(String[] args) {
		// 1) Class 인스턴스 만들기
		NewTest n1 = new NewTest();
		n1.test();
		// => interface 의 default 메서드 접근 (인스턴스로)
		n1.defaultTest();
		n1.defaultTest(123);
		// => interface static 메서드 접근 (Static 접근방법으로)
		NewInter.staticTest();
		
		// => 동일한 이름의 인스턴스 메서드 모두 가능함
		NewTest.staticTest();
		//n1.staticTest();		
		
		// 2) 인터페이스 타입으로 생성
		// => 인터페이스에 정의된 만큼만 접근 가능함.
		NewInter n2 = new NewTest();
		n2.defaultTest();
		n2.test();
		// => static 은 static 접근 방법으로
		NewInter.staticTest();
		NewTest.staticTest2();
		
	} //main

} //class
