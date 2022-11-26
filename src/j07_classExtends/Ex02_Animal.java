package j07_classExtends;

//** Java 의 상속의 특징
//=> 계층적으로 다중 상속이 가능하고 제한이 없음.
//=> 그러나 다중 상속은 안된다 ( 부모는 무조건 1개의 클래스만 허용 )
// class WildAnimal extends Mammal , Reptile {  -> ERROR

//** 메서드 오버라이딩
//=> 조상의 메서드와 매개변수, 리턴값, 이름 모두 동일한 메서드
// ( 매개변수가 다르다면 메서드 오버로딩에 해당됨.) 
// 현재 클래스에 구현된 메서드가 호출됨
// 이름은 동일하지만 후손클래스 별로 다양한 기능을 구현할 수 있음. 

//** static , final
//=> 맴버변수, 맴버메서드 , 클래스(final)
//=> final
//    - class : 종단클래스 (상속불가)
//    - method : 재정의(Override) 금지
//    - 필드(변수) : 상수
//=> static 메서드
//    - 상속(오버라이딩) 안됨
//    - 클래스(종속) 메서드로써 필요시 각자 정의해서 사용하는것은 가능함.
//      ( 단, 동일한 이름의 메서드를 후손이 non_static 으로 정의하는것은 불가능 )   
//    - super , this 는 non_static (인스턴스 메서드) 에서만 사용가능
//      ( super , this 인 인스턴스를 의미하기 때문 )
//    - static 변수는 클래스명으로 접근 

//** Animal
//=> Mammal ( String cry, crying ) ,
//	 Reptile ( swimming )
//=> WildAnimal ( allPrint ) , PetAnimal ( infoPrint() )

class Animal {
	String name;
	static int legs;
	static String color = "Red"; // static import Test 용으로 만듬.(Child class 에서)
	
	
	Animal () {System.out.println("** Animal default 생성자 **");}
	Animal(String name, int legs) {
		this.name = name;
		Animal.legs = legs;
		System.out.println("** Animal 초기화 생성자");
	}
	void breath() {System.out.printf("** %s는 숨을 쉬고 다리는 %d 개 입니다. %n", name, legs);}

} //Animal

// ** 클래스 명에 final 을 쓰면
// => 상속을 허용하지 않는다는 의미. -> 단종 클래스
//	  대표적인 단종 클래스 : String
//	  final class Mammal extends Animal {

class Mammal extends Animal {
	String cry;
	int legs;
	Mammal () {System.out.println("** Mammal default 생성자 **");}
	Mammal (String name, String cry, int legs) {
		super(name, legs);
		this.cry = cry;
		System.out.println("** Mammal 초기화 생성자 **");
	}
	// ** 메서드에 final 로 선언시
	// => Override 불가함 : final void crying .... (90행 사용불가)
	//	  후손에게 동일한 이름, 동일한 매개변수의 메서드 작성을 허용하지 않게됨.
	void crying() {System.out.printf("** %s는 %s 소리를 내며 웁니다. %n", name, cry);}
	static void staticTest () {
		System.out.println("** Mammal : staticTest() **");
	}

} //Mammal

//** Java에서는 다중상속을 불허함
// Error -> class WildAnimal extends Mammal, Reptile {
class WildAnimal extends Mammal {

} //WildAnimal

class PetAnimal extends Mammal {
	int legs;

	PetAnimal () {System.out.println("** PetAnimal dafault 생성자 **");}
	PetAnimal (String name, String cry, int legs) {

		super(name, cry, legs); 
		// legs는 Animal의 legs 로 전달.
		// -> this.legs에는 할당되지 않음
		System.out.println("** PetAnimal 초기화 생성자 **");
	}

	@Override
	void crying() {
		super.crying();
		System.out.println("** 노래도 부릅니다~ **");
	}

	// ** static Method Override Test
	// => static 멤버들은 클래스 종속 이므로 상속의 개념보다 우선시됨.
	//	  그러므로 static 은 Override 적용이 안되고 각 클래스의 멤버이다. 
	//	  즉, 조상의 staticTest() 와는 무관하고 PetAnimal.staticTest() 이다. 
	//	  -> 이러한 특성을 static 은 Override가 안된다.
	//@Override -> Error
	static void staticTest () {
		System.out.println("** PetAnimal : staticTest() **");
		Mammal.staticTest();	// 조상의 클래스메서드는 호출 가능.
	}

	//void staticTest () {} 
	// 조상의 static 메서드와 동일한 이름의 메서드를 후손이 non_static 으로 정의하는것은 불가능.
	void staticTest (int a) {} // 메서드 오버로딩 -> 허용


	void checking() {System.out.printf("** %s는 예방접종을 했습니다. %n", name);}

	void infoPrint() {
		super.legs = this.legs;
		breath();	// );
		crying();
		checking();
	}

	void legsPrint (int legs) {
		System.out.printf("** Local = %d, Global_Pet = %d, Parent_Mammal = %d,  Animal = %d %n", legs, this.legs, super.legs, Animal.legs);
	}
} //PetAnimal

class Reptile extends Animal{

} //Reptile

public class Ex02_Animal {

	public static void main(String[] args) {

		PetAnimal cat = new PetAnimal ();
		cat.name = "고양이";
		cat.legs = 4;
		// infoPrint() 에서 PetAnimal 에 legs 메서드가 없으면 4를 출력 / 있으면 0 을 출력
		// => breath() 메서드는 Animal 의 legs를 출력하기 떄문.
		cat.cry = "야옹 야옹";
		cat.infoPrint();

		PetAnimal dog = new PetAnimal ("강아지","멍멍",4);
		dog.infoPrint();


		System.out.println("** PetAnimal legs1 => " +dog.legs); // 0
		dog.legs = 10;
		System.out.println("** PetAnimal legs2 => " +dog.legs); // 10
		dog.legsPrint(77);

		// ** static Method Test
		Mammal.staticTest();
		PetAnimal.staticTest();

		// ** Object Test
		// => 모든 클래스의 최상위 조상
		// => 클래스 계층도 확인 : 클래스를 클릭한후 ctrl+t 누르면 됨.
		// => 클래스 소스코드보기 : 클래스명을 ctrl+click -> source code 로
		Object obj = new Object();
		System.out.println("\n** Object Test1 => "+obj.toString());
		System.out.println("\n** Object Test1 => "+obj);
		
		// ** 다형성 적용
		// => 타입은 조상으로, 생성은 후손으로
		//	  조상(Mammal)에 정의된 멤버만큼 접근가능
		Mammal mm1 = new PetAnimal();
		mm1.breath();
		mm1.crying();

		Mammal mm2 = new WildAnimal();
		mm2.breath();
		mm2.crying();
		
		// => 후손 타입, 조상 생성자 로 생성은 불가능함.
		// PetAnimal pet = new Mammal(); // Error -> Type mismatch
		
	} // main

} // class
