package j14_generic;

// ** enum 을 매개변수로 전달
// => 메서드에 적용하기
// => 일반상수의 사용과 안전성 비교

enum Animal {
	DOG, CAT, BEAR
}

enum Person {
	MAN, WOMAN, CHILD
}

public class Ex07_enumArgumentTest {
	// ** 일반상수 정의
	static final int DOG = 0;
	static final int CAT = 1;
	static final int BEAR = 2;

	static final int MAN = 0;
	static final int WOMAN = 1;
	static final int CHILD = 2;

	// => 사람만 사용가능한 메서드 -> 사람 외에는 입장불가
	// 매개변수 : 기본자료형 등 일반 Type
	static void whoAreU1(int p) {
		switch (p) {
		case 0: System.out.println("~~ MAN 입니다. ~~");
		break;

		case 1: System.out.println("~~ WOMAN 입니다. ~~");
		break;

		case 2: System.out.println("~~ CHILD 입니다. ~~");
		break;

		default : System.out.println("~~ 입장불가 입니다. ~~");

		} //switch
	} //whoAreU

	// => 매개변수를 enum Person Type 으로 설정
	// 			  Type 제한
	static void whoAreU2(Person p) {
		switch (p) {
		case MAN: System.out.println("~~ MAN 입니다. ~~");
		break;

		case WOMAN: System.out.println("~~ WOMAN 입니다. ~~");
		break;

		case CHILD: System.out.println("~~ CHILD 입니다. ~~");
		break;

		default : System.out.println("~~ 입장불가 입니다. ~~");

		} //switch
	} //whoAreU

	public static void main(String[] args) {
		// 1. 일반상수 Test
		// => whoAreU1 은 매개변수가 int 이면 모두 통과되므로 Person, Animal 구별 불가
		// => 비교 가능한 Type 이 없어서 논리적오류를 예방할 수 없음.
		whoAreU1(MAN);
		whoAreU1(WOMAN);
		whoAreU1(CAT);
		whoAreU1(DOG);

		// 2.enum 사용
		// => 컴파일타임에 검증 가능
		// whoAreU2(Animal.DOG); => Type 안맞아 컴파일오류
		// whoAreU2(Person.MAN); => 클래스 내부의 상수 MAN

		// 2.1) Person 직접 사용
		whoAreU2(Person.MAN);

		// 2.2) 인스턴스 정의
		Person p = Person.CHILD;
		whoAreU2(p);

		Animal a = Animal.BEAR;
		//whoAreU2(a); // Type 안맞아 컴파일오류 
		// ** 인스턴스 확인후 메서드 적용하기
		// if (a instanceof Person)  
		// => 컴파일오류 로 비교 불가 (비교 대상이 interface 일때만 컴파일오류 없이 비교가능) 
		
		if (a instanceof Animal) System.out.println("~~ whoAreU 입장불가 ~~");

	} //main

} //class
