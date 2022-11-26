package j05_classMethod;

//** 멤버 메서드 (method) : 함수(Function), 프로시져(Procedure)

//J06_  15,16 p
//1) 정의 , 실행

//2) return 값
//=> return 이 있으면 Type 을 지정, 없으면 무조건 void  
//=> 메서드 실행결과 return Type에 해당하는 결과값을 제공
//=> return 명령어를 void 메서드 에서 사용하면 메서드 종료

//3) 매개변수
//=> 매개변수(Argument, 인자), Parameter
//=> 메서드의 지역변수이며, 모든타입 정의 가능
//=> 매개변수의 값 전달방법
// CallByValue (기본자료형, String -> 매개변수의 값 전달)
// CallByReference (참조자료형: 배열, 인스턴스 -> 주소전달)   

//** 기본자료형 : Primitive Data Type (int, double, boolean ....)
//** 참조자료형 : Reference Data Type (String, 배열 등 클래스 타입)
// 모든 자료형은 매개변수가 될수 있으나 메서드는 매개변수가 안됨.


public class Ex02_Method {
	// 1. 메서드 종류별 4종 정의
	// 2. return Test 
	//    => return 값 활용 (main 에서 Test)
	//    => void 메서드 에서 사용 : 메서드 종료 
	// 3. 매개변수 전달방법
	//     => CallByValue (기본자료형, 매개변수의 값 전달됨) 
	//      => CallByReference (참조자료형, 주소값을 전달 -> 배열, 인스턴스)

	int price = 5000; // 전역(멤버) 변수

	// 1) 매개변수, return 값 없음
	public void juiceCafe1() {
		System.out.println("** 무슨 쥬스를 원하시나요? **");
		System.out.println("");
	}
	
	// ** 메서드명
	// => 매개변수가 다르다면 이름이 같아도 오류가 안남.
	// => 소문자로 시작함.
	public void juiceCafe1(int n) {
		System.out.println("** 메서드명 Test _ 매개변수 있어요 ~ => " +n);
		// non_static 메서드에서는 static, non_static 멤버 모두 인스턴스 없이 호출 가능.
		// 메서드 끼리는 인스턴스 없이 호출 가능.
		juiceCafe1(); 
		price = 7000;
		System.out.println("");
	}

	// 2) 매개변수 있고, return 값 없음
	// => 매개변수는 지역변수임
	public void juiceCafe2(String s, int n) {
		if (n < 5) {
			System.out.printf("** 주문 오류입니다. => %s, %d \n", s, n);
			return;	// void 에서 사용하면 메서드 종료
		}
		System.out.println("** 주문 내용입니다. **");
		// => CallByValue (기본자료형, 매개변수의 값 전달됨)
		s = "사과";
		System.out.printf("=> %s 쥬스, %d 잔 입니다.\n",s ,n);
		System.out.println("");

	} //juiceCafe2

	// 3) 매개변수 없고, return 값 있음
	public String juiceCafe3() {
		return "쥬스 한잔은 " + price + " 입니다.";
	}

	// 4) 매개변수 있고, return 값 있음
	public int juiceCafe4 (int n , String s) {
		System.out.printf("=> %s 쥬스, %d 잔 주문. \n", s, n);
		return n*price;
	}

	// 5) 참조자료형 Test
	// => 매개변수 있고, return 값도 있음
	public int carTest(Ex01_Car car, int speed) {
		System.out.println("** car before=> " + car);
		car.color = "Pink";
		car.speed = speed;
		System.out.println("** car after => " + car);
		return car.speed + speed;
	}


	public static void main(String[] args) {
		// ** 메서드 호출
		// => 같은 클래스에서도 접근하기 위해서는 인스턴스 필요함.
		
		Ex02_Method cafe = new Ex02_Method();
		String kind = "오렌지";

		//cafe.juiceCafe1();
		// => static이 붙어있는 메서드는 non_static 멤버를 사용하려면 인스턴스가 필요함.
		// => price = 10000; -> 오류남
		cafe.price = 10000; // -> 인스턴스와 사용시 사용가능.
		
		cafe.juiceCafe1(123); // int 매개변수를 1개 가진 juiceCafe1 를 call 함.

		cafe.juiceCafe2(kind, 7);
		System.out.println("** main CallByValue Test kind => " + kind);
		cafe.juiceCafe2("Banana", 3);

		System.out.println("** main cafe3 => " + cafe.juiceCafe3());

		System.out.println("** main cafe4 => " + cafe.juiceCafe4(20, "딸기"));

		System.out.println("");

		// ** 참조자료형 Test
		Ex01_Car myCar = new Ex01_Car();
		System.out.println("** main Before car => " + myCar);	// 초기 값 "Yellow" 출력
		System.out.println("** main call carTest => " + cafe.carTest(myCar, 5000));
		System.out.println("** main After car => " + myCar);	// "Pink"
		System.out.println("");

		// ** 매개변수 생성 비교
		// => 매개변수 위치에서 바로 생성해도 됨
		// => Car 를 일회성 매개변수로만 사용하는 경우 적당
		// 밑에 처럼 인스턴스를 만들면 재사동이 안되며 이름도 없어서 접근을 할 수가 없다.
		System.out.println("** main call carTest2 => " + cafe.carTest(new Ex01_Car(), 3000));

	} //main

} //class
