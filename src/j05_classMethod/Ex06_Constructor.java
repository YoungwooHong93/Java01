package j05_classMethod;

import java.util.Random;

//** 생성과정
//=> new 연산자가 해당되는 클래스를 메모리에 로드해서 생성함.
//=> 이때 생성직후 생성자메서드를 호출함

//** 생성자(Contructor) 메서드
//=> 클래스와 이름 동일하고, return 값이 없음. (void 조차도 생략됨)
// 그러나 매개변수는 갯수, Type 제한 없음
//=> 생성시에 단한번 호출가능 
//=> 한 클래스의 생성자는 여러개 가능 (생성자 오버로딩) 
//=> 생성자를 작성하지 않으면 컴파일러가 자동으로 기본생성자를 만들어줌(Default Contructor)
//(단, 하나라도 생성자 메서드를 작성하면 Default 생성자는 자동으로 만들어지지않음)

//** 생성자 메서드에서 생성자 메서드 호출 가능 
//=> this(?,?,...)
//=> this(...) 은 반드시 생성자 메서드 내에서 첫줄에 위치해야함.

class Car {
	public int speed;
	public int mileage;
	public static String color;

	// 1) 기본(Default) 생성자
	// => 매개변수 없고, 생성자를 전혀 작성하지 않으면 자동제공됨
	//	  ( 컴파일시에 추가해줌 )
	// 모든 메서드는 소문자로 작성을 해야하나, 디폴트 생성자는 클래스와 이름이 같아야 하므로 대문자로 시작함.
	// => 생성자를 하나라도 작성하게 되면 기본(default) 생성자는 자동생성이 안됨.
	Car() {
		System.out.println("** Car default 생성자 호출 **");
	}

	// 2) 변수를 초기화하는 생성자
	// => this : 지역변수, 전역변수 구별
	//			 현재클래스의 인스턴스를 의미함.
	// => this()
	//      - 생성자메서드에서 생성자메서드 호출
	//       - 생성자의 반복적인 코드의 재사용성
	//      - 생성자 메서드 내에서 반드시 첫줄에 위치해야함.

	Car(int speed) {
		// this.speed = speed;	// 여기서 this 는 Car를 가리킴.
		this(speed,0,null); // 첫줄에 와야 Error 가 안나며 
		// 밑에 매개변수 3개가 들어간 생성자가 있어야 사용 가능함.
		System.out.println("** Car 초기화 생성자 호출 **");
	}
	
	// 매개변수 Type(int) 이 위에꺼랑 동일하여 오버로딩 성립이 안됨.
	//Car(int mileage) {
	//	this.mileage = mileage;		
	Car(int speed, int mileage) {
		//this.speed = speed;
		//this.mileage = mileage;
		//this(speed, mileage, null);
		
		// ** 전역(멤버) 변수 color 의 초기값을 출력하고 싶은 경우
		// => static 으로 정의해야 가능하다.
		this(speed, mileage, color);
	}
	
	Car(String color) {
		//this.color = color;
		this(0, 0, color);
	}
	
	Car(int speed, int mileage, String color) {
		this.speed = speed;
		this.mileage = mileage;
		// this.color = color; -> static 변수는 static 접근방법으로 접근할것을 권장.
		Car.color = color;
	}
	
	public void speedDown () {
		speed -= 10;
	}
	
	public String toString() {
		return "[ 속도: " + speed + " 주행거리: " + mileage + " 색상: "+ color +" ] ";
	}

} //Car

public class Ex06_Constructor {


	public static void main(String[] args) {
		// 1) Default 생성자
		// => 생성자는 생성시에 단 한번 호출가능 (Car)
		//	  일반 메서드는 필요시에 언제든 호출가능
		Car c1 = new Car();
		Car.color = "white";	// class 종속
		c1.speed = 100;			// 인스턴스 종속
		c1.mileage = 5000;
		c1.speedDown();
		// c1.Car(); Error -> undefined

		System.out.println("** c1 => "+ c1);
		
		Car c2 = new Car(1000);
		System.out.println("** c2 => "+ c2);
		
		Car c3 = new Car(3000, 30000);
		System.out.println("** c3 => "+ c3);
		
		Car c4 = new Car("Brown");
		System.out.println("** c4 => "+ c4);
		
		Car c5 = new Car(500, 50000, "Red");
		System.out.println("** c5 => "+ c5);
		
		System.out.println("** static color test **");
		// => 마지막으로 할당된 색상은 "Red"
		//	  모든 c1 ~ c5 의 인스턴스 color 값은 동일하게 "Red"
		System.out.printf(" c1=%s, c2=%s, c3=%s, c4=%s %n"
							, Car.color, Car.color, Car.color, Car.color);
//							, c1.color, c2.color, c3.color, c4.color);
		
	} //main

} //class
