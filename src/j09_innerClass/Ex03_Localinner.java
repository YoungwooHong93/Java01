package j09_innerClass;

//** LocalInner Class
//=> 메서드의 내부에 정의 되는 InnerClass.
//=> 메서드내에 정의되는 지역변수와 같다 (즉, 메서드내에서만 사용됨)
//=> static InnerClass는 허용 되지 않음
// 단, 상수는 허용

public class Ex03_Localinner {

	int a = 100;

	Ex03_Localinner() {
		System.out.println("** Ex03_ Localinner default 생성자 **");
	}
	public void innerTest(int n) {
		int b = 200;
		final int C = n;
		// ** Local Inner Class 정의
		// => static Inner 인 경우에만 static 멤버를 사용 가능. (JRE 15 까지는)
		class Inner {
			//static int d = 400;
			int d = 400;
			Inner () {
				System.out.println("** Inner default 생성자 **");
			}
			
			public void printData () {
				System.out.printf("** Inner printData : a=%d, b=%d, C=%d, d=%d\n" ,a, b, C, d);
			}
			
			public int adder() {
				return d+=123;
			}
		} //Inner
		// ** Local Inner 클래스 사용
		Inner in = new Inner();
		in.printData();
		System.out.println("** innerTest in.adder() => "+in.adder());
		
	} //innerTest

	public static void main(String[] args) {
		// ** Outer 클래스 생성
		// => Inner 클래스 생성시점 : 메서드 호출시 생성됨.
		Ex03_Localinner ex03 = new Ex03_Localinner();
		ex03.innerTest(300);
		
		
	} //main

} //class
