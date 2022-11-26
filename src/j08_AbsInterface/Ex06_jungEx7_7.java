package j08_AbsInterface;

// ** 정석기초 p.249 예제
// => class Casting 관련예제

class Car {
	String color;
	int door;

	void drive() {    // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {     // 멈추는 기능   
		System.out.println("stop!!!");   
	}
} //Car

class FireEngine extends Car {   // 소방차
	void water() {   // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
} //FireEngine

public class Ex06_jungEx7_7 {

	public static void main(String[] args) {
		Car car = null;						// 인스턴스 선언만 함.
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;				// 인스턴스 선언만 함.

		fe.water();
		car = fe;	// 자동 형변환 
		// Car car = new FireEngine(); 이기 때문에 Car 에 정의된 것만 사용가능
		// car.water(); -> Error
		
		fe2 = (FireEngine)car;	// car의 주소값만 FireEngine 으로 형변환 하여 전달
		// 했기 때문에 car의 타입은 변하지않음. OK 33행 때문에 다운캐스팅 가능
		fe2.water();
		//    car.water(); -> 여전히 car 는 car 일뿐
		// => 33행에서 car 를 다운캐스팅한 값을 fe2 에 전달했을뿐 car 자신이 변경된것은 아님
		Car redCar = new Car();
		// fe2 = (FireEngine)redCar; 
		// 다운캐스팅 불가능. 런타임 오류 (java.lang.ClassCastException)
		// => 그러므로 instanceof 연산자로 확인 후 Down_Castiong 을 적용해야 한다.
		if (redCar instanceof FireEngine) fe2 = (FireEngine)redCar;
		else System.out.println("** Error : redCar 는 FireEngine Type 이 될 수 없음!! **");
		
	} //main

} //class
