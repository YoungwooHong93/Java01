package j08_AbsInterface;

//*** 클래스의 형변환
//=> 자동 형변환 (형변환 생략가능)
// 조상 <- 자손 (Up_Casting)

//=> 명시적 형변환 (형변환 생략불가능)
// 조상 -> 자손 (Down_Casting)
// 실제적 클래스타입이 변환가능한 경우에만 적용됨 
// (변환불가능한 경우에는 컴파일 오류 없어도 런타임 오류(ClassCastException) 발생)

//Animal => Mammal 포유류  => PetAnimal
//Animal => Reptile 파충류 

class Animal2 {
	   int legsA=2;
	   String name;
	   public Animal2() {System.out.println("** Animal 생성자 **"); }
	   public Animal2(String name) { this.name=name ;}
	   void breath() {
	      System.out.println(name +" 는 숨을 쉽니다 ~~");
	   }
	} // Animal

	class Mammal extends Animal2 {
	   String cry ;
	   int legs=3;
	   public Mammal() {System.out.println("** Mammal 생성자 **"); }
	   void crying() {
	      System.out.println(super.name+ " 은(는) "+cry + " 웁니다 ~~");
	   }
	} // Mammal

	class PetAnimal extends Mammal {
	   int legs=4 ;
	   PetAnimal() { System.out.println("~~ PetAnimal 생성 ~~"); }
	   
	   @Override // Animal
	   void breath() {
	      super.breath();
	      System.out.println("여기는 PetAnimal breath() 입니다 ~~");
	   }
	   
	   void legsPrint(int legs) {
	      System.out.printf("%s의 다리 => (Local):%d, Pet(Global):%d, Mam(Father):%d, Ani(할아버지):%d \n"
	                  ,name,legs,this.legs,super.legs, super.legsA) ;
	   } 
	   
	} //PetAnimal

	class Reptile extends Animal2 {
	} // Reptile

public class Ex06_classCasting {

	public static void main(String[] args) {
		// Test1. PetAnimal 생성 
		PetAnimal dog = new PetAnimal();
		// ** instanceof Test
		if ( dog instanceof PetAnimal ) System.out.println("** dog 는 PetAnimal 입니다. **");
		if ( dog instanceof Mammal ) System.out.println("** dog 는 Mammal 입니다. **");
		if ( dog instanceof Animal2 ) System.out.println("** dog 는 Animal2 입니다. **");
		if ( dog instanceof Object ) System.out.println("** dog 는 Object 입니다. **");
		
		// Test2. Up_Casting
		Animal2 an1 = new PetAnimal();	// 조상 <- 후손 : Up_Casting
		//PetAnimal pa = new Animal();	// 후손 <- 조상 : Down_Casting (불가함)
		an1 = new Reptile(); // 다형성 : 후손 교체가능.
		
		Animal2 an2 = new Animal2();
		System.out.println("** an1 과 an2 비교 **");
		an1 = dog;
		//an2 = dog;	
		// 조상 <- 후손 : Up_Casting -> an2에 정의된 메서드만 접근가능.
		// Animal2 an2 = new PetAnimal()l 과 동일 효과
		
		// Test3. Down_Casting -> 명시적으로
		System.out.println("** Down_Casting Test **");
		dog = (PetAnimal)an1; // 컴파일오류 없음, 런타임오류 없음. -> 명시적 Down_Casting 가능
		dog.legsPrint(4); // PetAnimal 에 정의된 멤버 접근가능
		
		//dog = (PetAnimal)an2;
		// 컴파일 오류 없음 , 런타임오류 + ClassCastException
		// => 위 73행 주석처리후 Test 해야 런타임 오류 발생함.
		if ( an2 instanceof PetAnimal ) {
			dog = (PetAnimal)an2;
			System.out.println("** an2 는 PetAnimal 입니다.");
		} else System.out.println("** an2 는 PetAnimal 이 될 수 없습니다.");
		System.out.println("");
		
		// ** 인스턴스의 Class Type 출력하기
		// => Object 에 정의된 getClass() 메서드 이용
		System.out.println("** dog Class Type => "+dog.getClass().getName());
		System.out.println("** an1 Class Type => "+an1.getClass().getName());
		System.out.println("** an2 Class Type => "+an2.getClass().getName());
		
		System.out.println("** Progeam Stop **");
		
	} //main

} //class
