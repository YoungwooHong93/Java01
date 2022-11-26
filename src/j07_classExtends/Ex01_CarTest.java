package j07_classExtends;

//** 상속 : extends
//=> 기능을 확장해서 업그레이드 버젼 만듦.
//=> 기존(조상) 클래스의 맴버들(필드와 메소드)을 재사용 & 일부변경도 가능 

//** 생성순서
//=> JVM은 extends 키워드가 있으면 조상생성후 후손생성
// 이때 기본은 조상의 default 생성자를 실행하고,
// 특별히 후손 생성자에서 조상생성자_super(...)를 호출해 놓으면 그생성자를 실행함.
//=> 상속을 허용하는 클래스는 default 생성자를 반드시 작성하는것이 바람직함.

//** 조상 : Super (Parent, Base) class  
//=> super.  : 조상의 인스턴스를 의미 (조상의 맴버에 접근 가능)
//=> super()
// 조상의 생성자를 의미 (조상의 생성자에 접근 가능).
// this() 처럼 생성자 메서드 내에서 첫줄에 위치해야함.

//=> 생성자메서드_super(), this() 호출은 생성자 내에서만 가능 

//** 후손 : Sub ( Child, Derived [diráivd] ) class
//=> super class 를 포함

class Car {			// 상속을 받지 않으면 extends Object를 상속받음.
	int speed;
	int mileage;
	String color;

	public Car() {
		//super();	// 조상의 생성자를 의미함. (호출)
		System.out.println("** Car Default 생성자 **");
	}

	public Car(int speed, int mileage, String color) {
		//super();	// 조상의 생성자를 호출
		this.speed = speed;
		this.mileage = mileage;
		this.color = color;
		System.out.println("** Car 초기화 생성자 **");
	}

	public void speedUp() {
		this.speed += 100; 
	}

	// ** 메서드 오버라이딩  Overriding
	// => 조상과 완전 동일한 이름, 매개변수, return Type 을 가진 메서드 작성허용
	//    - 매서드 재작성 -> 우선 호출됨
	//    - 조상 메서드 호출시 -> super 로 접근
	// => 메서드 오버로딩와 구별할것
	
	@Override	// 덮어쓰기라는 의미.
	public String toString() {
		return "Car [speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
	}
} //Car

class SportsCar extends Car {
	int turbo;
	int speed = 555;

	// ** super()
	// => 조상의 생성자를 지정하지 않으면 조상의 default 생성자를 넣어줌
	// => 필요한 조상의 생성자 호출가능
	// => 단, this() 와 마찬가지로 반드시 첫줄에 작성해야함. 

	public SportsCar() {
		//super();
		System.out.println("** sportsCar Default 생성자 **");
		//super(); -> Error
	}

	public SportsCar(int turbo) {
		//super(); => super() 를 이용해서 조상의 생성자를 호출가능
		super(0, 0, null);
		this.turbo = turbo;
		System.out.println("** sportsCar 멤버만 초기화 생성자 **");
	}

	// ** 조상의 멤버를 초기화하는 생성자
	public SportsCar(int speed, int mileage, String color, int turbo) {
		super(speed, mileage, color); // 조상의 생성자를 호출해서 매개변수 전달도 가능. (제일 적합함)
		this.turbo = turbo;
		System.out.println("** Car(조상) 멤버와 현재 멤버만 초기화 생성자 **");
		//this.speed = speed; 	// SportCar의 멤버변수로 speed 가 없기 때문에 조상에서 찾음. 
		//						-> 바람직 하진 않음.(SportsCar 에 speed가 있으면 조상에 접근이안됨.)
		//super.speed = speed;	// 위의 접근방법 보다 super를 이용하여 조상에 접근하는게 옳다.
		//super.mileage = mileage;
		//super.color = color;
	}
	
	// => Car 의 기능을 업그레이드 함.
	@Override // 컴파일러에게 전달하는 지시어
	public void speedUp() {
		super.speedUp(); 		// 조상의 speedUp() 메서드 호출이 자동적으로 가능.
		super.speed += turbo;
	}
	
	// => 메서드 오버로딩
	//@Override -> 오버라이딩은 메서드 형태가 다 같아야하므로 현재 메서드에 사용시 Error.
	public void speedUp(int i) {
		super.speed += i;
	}
	
	// => 새로운 기능도 추가가 가능. 
	// @Override	->	아닌 경우에 사용 시 오류.
	// => 동일한 이름의 변수 Test
	//	  매개변수 speed 를 SportsCar의 speed , Car 의 speed 에 모두 적용한다.
	public void speedDown(int speed) {
		super.speed -= speed;		// Car 의 speed //   조상의 멤버에 추가기능을 설정함.
		this.speed -= speed;		// SportsCar의 speed
		System.out.println("** 매개변수 speed => "+ speed);
		System.out.println("** SportsCar speed => "+ this.speed);
		System.out.println("** Car speed => "+ super.speed);
	}
	
	@Override
	public String toString() {
		// speed 는 조상의 speed 를 출력한다.
		return "sportsCar [turbo=" + turbo + ", speed=" + super.speed + ", mileage=" + mileage + ", color=" + color + "]";
	}
	// => 조상의 멤버에 접근가능함

} //sportsCar

public class Ex01_CarTest {

	public static void main(String[] args) {
		// 1) Car 생성
		Car c1 = new Car(100, 10000, "White");
		c1.speedUp();
		//c1.speedDown(200);	// Undefined Error -> 후손의 메서드는 조상이 사용 불가.
		System.out.println("** Car c1 => "+ c1);
		
		// 2) SportsCar 생성
		SportsCar sc1 = new SportsCar(500);
		sc1.color = "Red";
		System.out.println("** SportsCar sc1 => "+sc1);
		System.out.println("");

		SportsCar sc2 = new SportsCar (5000);
		System.out.println("** SportsCar sc2 => "+sc2);
		System.out.println("");

		SportsCar sc3 = new SportsCar (300, 30000, "blue", 9000);
		sc3.speedUp();
		sc3.speedDown(50);
		System.out.println("** SportsCar sc3 => "+sc3);
		System.out.println("");


	} //main

} //class
