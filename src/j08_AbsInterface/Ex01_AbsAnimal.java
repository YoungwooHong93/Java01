package j08_AbsInterface;

// ** 추상클래스
// => 추상 메서드를 하나라도 가지면 추상 클래스로 정의 해야함.
// => 직접 인스턴스를 생성하지 못함. (new 사용불가)
// 그러나 참조형 변수(인스턴스)의 타입으로 선언은 가능하다.
// 그리고 후손으로 인스턴스를 생성할 수 있음.

// ** 추상 메서드
// => Body 부분이 없고 Header 만 선언.
// => 앞쪽에 abstract, 매개변수 뒤에; 붙여야됨.
// => Body 부분은 Child 클래스에서 반드시 재 정의(오버라이딩) 해야 함.
//	 (실행문이 없어도 공백으로 작성 해야함. -> {})
// => 추상 메서드 목적 : 후손에게 오버라이딩의 강제성을 부여. (후손들의 메서드명의 통일성)

// ** 다형성 적용
// => 조상의 타입으로 변수 선언, 후손의 타입으로 인스턴스 생성
// => 조상에 정의된 범위 내에서만 후손의 멤버 사용가능
// => 후손의 타입에 따라 다양한 형태로 실행됨

// ** 다형성 적용의 장점
// => 계층구조에서 일괄 작업 가능 (개발 및 유지보수의 효율을 높여줌)
// => 실행시 클래스의 교체가 간편

// ** instanceof 연산자
// => A(Object) instanceof B(Class, Interface) 형태로 사용
//	  즉 A 위치에는 Object(인스턴스), B 위치에는 클래스나 인터페이스

// => A Object 를 B 클래스나 인터페이스로 캐스팅이 가능한것인지를 확인하는 연산자.
//	  즉, 명시적 형변환이 가능한지를 묻는 연산자임.
//	  A 인스턴스가 B클래스 의 집안에 해당 되는지 (상속관계인지) 묻는 연산자
// => true / false

// => 따라서 B가 클래스일 경우에는 A 가 반드시 B클래스와 상속관계에 있어야만 유효하며
//	  상속관계가 없을 경우 캐스팅이 불가능하기에 컴파일 타임 에러 발생.
//	  (왜냐하면 컴파일 타임에 내부적으로 캐스팅 처리를 해야 하기 때문)
// => 그러나 B가 인터페이스라면 컴파일 타임 에러는 안나지만 런타임 에러가 발생됨.

abstract class Animal {
	String kind;
	// 생성자 : 작성해도 오류는 없지만 생성이 가능해지는것은 아님.
	Animal () { System.out.println(" Animal default 생성자 ");
	}
	// ** 일반 메서드 : 후손이 구현(Override)할 의무는 없음.
	void breath() { System.out.println(kind + "는 숨을 쉽니다. ~~");}

	// ** 추상메서드
	// => 반드시 abstract 를 사용해서 추상메서드임을 표시 해야함.
	// => 후손에 구현(Override) 의무 있음
	// => 반드시 추상메서드를 하나라도 가진 클래스는 추상 클래스로 정의 해야함
	abstract void sound();

	abstract void special();

} //Animal

class Cat extends Animal {
	Cat() { 
		kind = "고양이"; 
		System.out.println(" Cat default 생성자 ");
	}
	@Override
	void sound() {
		System.out.println(" ~~ 야옹 야옹 웁니다. ~~");
	}
	@Override
	void special() {
		System.out.println(" ~~ 고양이는 눈의 color 가 멋집니다. ~~");
	}
	void eyeColor () {
		System.out.println("OLD: ~~ 고양이는 눈의 color 가 멋집니다. ~~");
	}
} // Cat

class Dog extends Animal {
	Dog () {
		kind = "강아지";
	}
	@Override
	void sound() {
		System.out.println(" ~~ 멍멍멍 멍멍멍멍 웁니다. ~~");
	}
	@Override
	void special() {
		System.out.println(" ~~ 강아지는 speed 가 빠릅니다. ~~");

	}
	void speed() {
		System.out.println("OLD: ~~ 강아지는 speed 가 빠릅니다. ~~");
	}
} //Dog

class Eagle extends Animal {
	Eagle () {
		kind = "독수리";
	}
	@Override
	void sound() {
	} // 의무구현 : 구현내용이 없어도 반드시 body 부분을 작성해야함.
	@Override
	void special() {
		System.out.println(" ~~ 독수리는 하늘을 flying 합니다. ~~");

	}
	void flying() {
		System.out.println("OLD: ~~ 독수리는 하늘을 flying 합니다. ~~");
	}

} //Eagle

class Bear {
	void breath() {
		System.out.println(" 곰은 을 쉽니다 ~~"); 
	} 
	void sound() { 
		System.out.println("곰~곰 곰~~");
	}
	void tree() {
		System.out.println(" 곰은 크지만 나무를 잘 탑니다 "); 
	}
} //Bear

public class Ex01_AbsAnimal {

	public static void main(String[] args) {
		// ** 추상클래스 Animal 생성 확인
		// => 추상 클래스는 직접 인스턴스를 생성할 수 없다.
		//    그러나 인스턴스의 타입(좌변)으로는 정의 가능하고, 우변에서는 후손으로 생성함.
		//    이때 이 인스턴스의 접근범위는 조상에 정의된 만큼만 가능
		// Animal animal = new Animal(); => Error
		// Cat c1 = new Animal(); => Error
		
		Animal a1 = new Cat();
		a1.breath();
		a1.sound();
		a1.special();
		System.out.println("");

		Animal a2 = new Dog();
		a2.breath();
		a2.sound();
		a2.special();
		//a2.speed(); // 접근불가 -> undefined Error
		System.out.println("");

		Animal a3 = new Eagle();
		a3.breath();
		a3.sound();
		a3.special();
		System.out.println("");

		// ** Bear Test
		// => Animal을 상속받지 않은 Bear 클래스는 적용이 안됨.
		//Animal a4 = new Bear();

		// ** 다형성 적용
		// => 조상의 타입으로 정의하고 후손클래스로 인스턴스를 생성함.
		// => 우측의 생성자만 교체하면 쉽게 클래스 교체 가능
		// => 코드 내에서 조상의 정의된 맴버만 사용 했다는 의미
		// => 추상 뿐만 아니라 상속관계 에서는 적용됨. (참고 Ex02_Animal)
		//	  추상을 사용하면 의무구현의 강제성을 줄수있음 (메서드명을 일원화 할 수 있음)
		System.out.println("\n** Animal:다형성적용 Test **");
		Animal animal = new Dog();	// Cat(), Dog(), Eagle () 변경하면 클래스 교체가 쉬워짐.
		animal.breath();
		animal.sound();
		animal.special();
		System.out.println("");

		System.out.println("\n** Cat, Dog, Eagle 각각 Test **");
		Cat cat = new Cat();
		cat.breath();
		cat.sound();
		cat.eyeColor();
		System.out.println("");

		Dog dog = new Dog();
		dog.breath();
		dog.sound();
		dog.speed();
		System.out.println("");

		Eagle eagle = new Eagle();
		eagle.breath();
		eagle.flying();
		System.out.println("");

		Bear bear = new Bear ();
		bear.breath();
		bear.sound();
		bear.tree();
		System.out.println("");

		// ** 메서드의 매개변수로 다형성 Test
		// => Animal Type
		System.out.println("\n** 메서드의 매개변수로 다형성 Test **");
		animalUse(animal);
		animalUse(cat);		// Cat 후손 -> Animal 조상 : 자동형변환
		animalUse(new Eagle());
		// animalUse(bear); => Animal 과 무관한 bear 는 사용불가
		System.out.println("");

		// Object Type 추가 후
		animalUse(bear);
		animalUse((Object)animal); // 클래스의 형변환. 조상 타입으로는 형변환이 가능.
		System.out.println("");
		
		// 배열 Type 추가후
		// => Animal Type 배열 정의 후 전달
		Animal[] ans = { animal, cat, eagle, new Cat() };
		animalUse(ans);
		System.out.println("");
		
		// ** 연산자 instanceof
		// => 인스턴스를 확인해주는 연산자
		if ( cat instanceof Animal ) System.out.println("** cat 은 Animal 의 인스턴스 입니다.");
		// => bear 처럼 타입이 맞지 않는경우 컴파일 오류 발생 
		//	  instanceof 의 필요성을 못 느낄 수 있지만,
		//	  비교대상이 인터페이스 가 되면 컴파일 오류는 없고 런타임 오류가 발생.
		//	  그러므로 확인이 필요함.
		// if ( bear instanceof Animal ) System.out.println("** bear 은 Animal 의 인스턴스가 아닙니다.");

	} //main
	// ** animalUse 메서드 오버로드
	// => Animal[], Animal, Object 
	public static void animalUse(Animal[] animals) {
		for (Animal an : animals) {
			an.breath();
			an.sound();
		}

	}
	public static void animalUse(Animal animal) {
		animal.breath();
		animal.sound();
	}
	// ** 매개변수 타입 : Object
	// => 모든 클래스 사용가능하고, Object에 정의된 멤버만 사용가능.
	public static void animalUse(Object animal) {
		System.out.println("** Your Address => "+ animal);
	}

} //class
