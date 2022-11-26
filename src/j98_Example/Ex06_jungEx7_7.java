package j98_Example;

// ** 정석기초 p.249 예제

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
		car = fe;	// -> Car car = new FireEngine(); 이기 때문에 Car 에 정의된 것만 사용가능
		//car.water(); -> Error
		
		fe2 = (FireEngine)car;	// OK 32행 때문에 가능
		fe2.water();

	} //main

} //class
