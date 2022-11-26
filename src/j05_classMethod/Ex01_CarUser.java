package j05_classMethod;

//** Car 의 사용자클래스 (UserClass)

public class Ex01_CarUser {

	public static void main(String[] args) {
		// ** 객체사용
		// => 생성(Instance) -> 사용 -> 소멸
		// => 생성 : "인스턴스화 한다" 또는 "인스턴스를 생성한다" 라고함. 

		Ex01_Car myCar = new Ex01_Car();

		// => 사용
		myCar.color = "Silver";
		myCar.mileage = 100000;
		myCar.speed = 200;
		myCar.speedUp();

		System.out.println("** toString1 => " + myCar.toString());
		// toString 은 속성들을 보여주는 용도로 많이 사용댐. 
		System.out.println("** toString2 => " + myCar);
		// => 출력문에서 인스턴스명만 사용했을때 자동호출됨 
		// => toString 메서드를 정의하지않으면 인스턴스의 주소값을 제공함
		// => 인스턴스도 참조형 변수다.

		Ex01_Car fCar = myCar; // 동일한 주소값을 가짐.

		// ** 소멸 : 메모리청소
		// => 더이상 사용되지않는 값들은 자동제거해줌
		// => Garbage Collector (쓰레기수집기)
		// => 정해진 알고리즘에 의해 작동됨 ( 일정시간동안 또는 더이상 참조되지않는등등... )   
		// => 참조형 변수에 null 값을 주면 소멸 (더이상 참조되지않음)
		myCar = null; // 소멸시킬때 null 을 넣어준다.
		//myCar.speedUp(); // java.lang.NullPointerException
		System.out.println("** fCar => "+fCar);

		Ex01_Car uCar = new Ex01_Car();
		
		uCar.color = "brown";
		uCar.speed = 300;
		uCar.mileage = 30000;
		
		System.out.println("** uCar => " + uCar);

	} //main

} //class
