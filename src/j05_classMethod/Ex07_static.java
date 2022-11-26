package j05_classMethod;

//** static (클래스종속) 
//=> 클래스변수(모든 인스턴스가 공유) , 클래스메서드

//** non_static (static 이 없는) (인스턴스종속)
//=> 인스턴스변수(인스턴스별로 관리) , 인스턴스메서드
//=> 인스턴스가 없으면 사용이 불가.

//** 사용(호출) 규칙
//=> 인스턴스 메서드 : static, 인스턴스 모두 인스턴스없이 호출가능 
//=> static 메서드 : static 만 인스턴스없이 호출가능

//** 4칙연산 계산기

public class Ex07_static {
	
	int result;
	static int total = 0;
	
	// ** static 메서드
	public static int add (int i, int j) {
		//result = i + j;	// 인스턴스 없이 접근 불가.
		total += (i + j);
		return i + j;
	}
	public static int min (int i, int j) {
		total += (i - j);
		return i - j;
	}
	
	// ** 인스턴스 메서드
	public int mul (int i, int j) {
		result = i * j;
		total += result;
		return i * j;
	}
	public int div (int i, int j) {
		result = i / j;
		total += result;
		return i / j;
	}
	
	// ** static 메서드, 인스턴스 메서드 모두 call
	// => static 메서드로 작성하는 경우 (인스턴스가 필요)
	//	  인스턴스 멤버에 접근하기 위해서는 인스턴스가 필요.
	public static void staticAll (int i, int j, Ex07_static test) {
		System.out.println("** sall add => "+ add(i, j));
		System.out.println("** sall min => "+ min(i, j));
		System.out.println("** sall mul => "+ test.mul(i, j));
		System.out.println("** sall div => "+ test.div(i, j));
	} // staticAll
	
	// => 인스턴스 메서드로 작성하는 경우
	//	  static, 인스턴스 / 메서드, 변수 모두 인스턴스 없이 접근 가능.
	public void instanceAll (int i, int j) {
		System.out.println("** Iall add => "+ add(i, j));
		System.out.println("** Iall min => "+ min(i, j));
		System.out.println("** Iall mul => "+ mul(i, j));
		System.out.println("** Iall div => "+ div(i, j));
	} // instanceAll
	
	
	
	public static void main(String[] args) {
		// 1) static 메서드
		System.out.println("** add => "+ add(10, 20));
		System.out.println("** min => "+ min(10, 20));
		
		// 2) 인스턴스 메서드
		// => 인스턴스가 있어야 접근가능.
		Ex07_static ex07 = new Ex07_static();
		System.out.println("** mul => "+ ex07.mul(10, 20));
		System.out.println("** div => "+ ex07.div(10, 20));
		
		System.out.printf(" result = %d , total =%d %n", ex07.result, total); // 0, 220
		
		// 3) All test
		Ex07_static all = new Ex07_static();
		
		staticAll(100, 30, all);	//	클래스메서드(static메서드) 이지만, 매개변수에 인스턴스가 필요.
		
		all.instanceAll(100, 30);	//	인스턴스를 통해서 접근이 가능.
		
		System.out.printf(" result = %d , total =%d %n", all.result, total); // 3, 6626
		
		System.out.printf(" result = %d , total =%d %n", ex07.result, total); // 0, 220
		// => 위 76행을 다시 출력해보면 ????
		System.out.printf(" result = %d , total =%d %n", ex07.result, total); // 0, 6626
		
	} // main

} // class
