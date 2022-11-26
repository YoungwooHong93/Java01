package j14_generic;

//** enum 의 내부
//=> enum은 class, interface와 동급의 형식을 가지는 단위임.
//=> 실상은 class 이지만, enum만을 위한 문법적 형식을 가지고 있기 때문에
//   클래스와 구분하기 위해서 enum이라는 키워드를 사용함.
//=> 컴파일된 코드는 ~.class 임
//   class, abstract class, interface, enum 모두 ~.class )

//=> "enum Fruits" 코드의 내부는 다음과 같다.

//class Fruits{
//  public static final Fruits APPLE  = new Fruits();
//  public static final Fruits BANANA = new Fruits();
//  public static final Fruits ORANGE  = new Fruits();
//  public static final Fruits PEACH  = new Fruits();
//  private Fruits(){}
//}

//** enum의 생성자, 변수, 메서드 
//=> 생성자의 접근 제어자가 private
//   그러므로 클래스 Fruits를 인스턴스로 만들수없도록 하여 다른 용도로 사용하는 것을 금지함. 
//=> 생성자 오버로딩 처럼 생성자의 매개변수 사용은 허용되지만, 
//   생성자는 1개만 허용됨 ( Fruits.APPLE 사용시 1개의 생성자가 자동호출됨 )
//=> 변수, 메서드 정의 가능

enum Fruits {
	// 1) default 생성자 
	//APPLE, BANANA, ORANGE, PEACH;
	//private Fruits() {
	//	System.out.println(" Call default 생성자 => "+this);
	//}

	// 2) 매개변수가 있는 생성자, 변수
	APPLE("Green"), BANANA("Yellow"), ORANGE("Red"), PEACH("Pink");
	String color;

	private Fruits(String color) {
		System.out.println(" Call 매개변수 생성사 => "+this);
		this.color = color;
	} //생성자2

	// 3) 메서드 추가
	String getColor() {
		return this.color;
	}
} //Fruits

//3) 열거형(enum) Type 비교
enum Company {
	ORACLE, NAVER, APPLE
}

// ------------------------------------------------------
//4) 클래스 Fruits2 와 비교
// => FruitsMart 에서 Fruits2 Type 으로 각종 과일을
//	  static final 로 생성함
//	  그러므로 Fruits2 의 생성자 private을 default 로 작성함. 
class Fruits2 {
	String color;

	Fruits2(String color) {
		System.out.println(" Call 매개변수 생성사 => "+this);
		this.color = color;
	} //생성자2

	// 3) 메서드 추가
	String getColor() {
		return this.color;
	}
} //Fruits2

class FruitsMart {
	static final String NAME = "신선과일마트";
	
	static final Fruits2 APPLE = new Fruits2("Red");
	static final Fruits2 BANANA = new Fruits2("Yellow");
	static final Fruits2 ORANGE = new Fruits2("Orange");
}
//------------------------------------------------------


public class Ex08_enumConstructor {

	public static void main(String[] args) {
		// 1) default 생성자
		System.out.printf(" main default 생성자 => %s, %s, %s, %s \n"
				,Fruits.APPLE, Fruits.BANANA, Fruits.ORANGE, Fruits.PEACH);

		// 2) 생성자2, 변수 , 메서드
		Fruits f = Fruits.ORANGE;
		switch (f) {
		case APPLE: System.out.println(" APPLE color => "+Fruits.APPLE.color);
		break;
		case BANANA: System.out.println(" BANANA color => "+Fruits.BANANA.color);
		break;
		case ORANGE: System.out.println(" ORNAGE color => "+Fruits.ORANGE.color);
		break;
		case PEACH: System.out.println(" PEACH getColor => "+Fruits.PEACH.getColor());
		}

		// 3) 열거형(enum) Type 비교
		// => 값과 타입을 동시에 확인하기때문에 안전한 코딩 가능
		//    즉, enum이 서로 다른 상수 그룹에 대한 비교를 컴파일 시점에서 차단시켜줌.
		// if (Fruits.APPLE == Company.APPLE)
		//	  System.out.println(" True ");
		// => 컴파일 오류, 비교구문 사용 불가능 : 그러므로 안전
		
		Company c = Company.APPLE;
		switch (c) {
		case APPLE: System.out.println(c+" => 연봉 1억");
		break;
		case ORACLE: System.out.println(c+" => 연봉 2억");
		break;
		case NAVER: System.out.println(c+" => 연봉 3억");
		}
		
		// 4) 클래스 Fruits2 와 비교
		System.out.println(" FruitsMart NAME => "+ FruitsMart.NAME);
		System.out.println(" FruitsMart APPLE => "+ FruitsMart.APPLE.color);
		System.out.println(" FruitsMart BANANA => "+ FruitsMart.BANANA.getColor());
		System.out.println(" FruitsMart ORANGE => "+ FruitsMart.ORANGE.color);
		
		
	} //main

} //class
