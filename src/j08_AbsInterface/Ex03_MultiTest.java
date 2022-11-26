package j08_AbsInterface;

//** interface 2.
//1) 인터페이스와 인터페이스 관계
//=> 인터페이스 간의 상속(extends) 가능.
//=> 다중상속(부모 여러개 허용), 계층적 상속 모두 가능 

//2) 클래스 와 인터페이스 관계
//=> 다중 구현(implements) 가능
//=> 클래스가 클래스를 상속(extends) 받으면서 동시에
//   인터페이스를 구현(implements, 다중구현도 포함) 하는것 가능 

//** 그러므로 자바는 다중상속이 안되는점을 극복 가능함 

interface Inter1 {
	float PI = 3.1415f;	// public static final 앞에 생략됨
	int getA();			// public abstract 앞에 생략됨
}

interface Inter2 {
	int getB();
}

// 인터페이스 끼리는 다중상속이 가능함.
interface Inter3 extends Inter1, Inter2 {
	float getC();
}

// ** 복수의 interface를 다중구현한 클래스
//class MultiInter implements Inter1, Inter2, Inter3 {
class MultiInter implements Inter3 {
	int a = 123, b = 100;
	@Override
	public int getA() {
		return a;
	}
	@Override
	public int getB() {
		return b;
	}
	@Override
	public float getC() {
		return (a + b)*PI;
	}
} // MultiInter

// ** 클래스 extends 와 interface implements 동시 구현 가능
class Add {
	int addNum(int a, int b) {
		return a+b;
	}
} //Add

//=> 순서는 extends 후 implements 를 해야 에러가 안남.
//class MultiExtIm implements Inter1, Inter2, Inter3  extends Add { -> Error
class MultiExtIm extends Add implements Inter1, Inter2, Inter3 {
	int a = 123, b = 100;
	@Override
	public int getA() {
		return a;
	}
	@Override
	public int getB() {
		return b;
	}
	@Override
	public float getC() {
		return addNum(a, b)*PI;
	}
} //MultiExtIm

public class Ex03_MultiTest {

	public static void main(String[] args) {
		// Test1
		MultiInter m1 = new MultiInter();
		System.out.printf("** m1 => getA = %d, getB = %d, getC = %f %n",m1.getA(), m1.getB(), m1.getC());
		System.out.println("");
		
		// Test2
		MultiExtIm m2 = new MultiExtIm();
		System.out.printf("** m2 => getA = %d, getB = %d, getC = %f %n",m2.getA(), m2.getB(), m2.getC());
		System.out.println("");
		
		// Test3 : 다형성 적용
		//Inter1 in1 = new MultiInter();	// Inter1 에 정의된 만큼만 접근가능. getA() 만
		//Inter2 in1 = new MultiInter();	// Inter2 에 정의된 만큼만 접근가능. getB() 만
		Inter3 in1 = new MultiInter();		// Inter3 은 1,2 를 포함하고 있어서 에러가 안남. MultiInter(), MultiExtIm() 로 클래스 교체도 가능.
		System.out.printf("** in1 => getA = %d, getB = %d, getC = %f %n",in1.getA(), in1.getB(), in1.getC());
		System.out.println("");
		
		// Test4 : instanceof 적용하기
		if ( m1 instanceof Inter1 ) System.out.println("** m1 은 Inter1 입니다.");
		else System.out.println("** m1 은 Inter1 이 아닙니다.");
		if ( m1 instanceof Inter2 ) System.out.println("** m1 은 Inter2 입니다.");
		else System.out.println("** m1 은 Inter2 이 아닙니다.");
		if ( m1 instanceof Inter3 ) System.out.println("** m1 은 Inter3 입니다.");
		else System.out.println("** m1 은 Inter3 이 아닙니다.");
		System.out.println("");
		
		// => interface 들과 무관한 Add 클래스 Test
		//	  비교 대상이 인터페이스 인 경우에는 컴파일 오류가 없음
		//	  그러므로 적합성의 확인이 필요함.
		// => Inter3 in1 = new Add();
		Add add = new Add();
		if ( add instanceof Inter3 ) System.out.println("** add 은 Inter3 입니다.");
		else System.out.println("** add 은 Inter3 이 아닙니다.");
		System.out.println("");
		
		// => instanceof 의 비교대상이 클래스인 경우 일치하지 않으면 컴파일 에러가 발생함.
		//if( m1 instanceof Add ) System.out.println("** m1 은 Add의 인스턴스 입니다.");
		//else System.out.println("** m1 은 Add의 인스턴스가 아닙니다.");
		
		if( m2 instanceof Add ) System.out.println("** m2 은 Add의 인스턴스 입니다.");
		else System.out.println("** m2 은 Add의 인스턴스가 아닙니다.");
		
		
	} //main

} //class
