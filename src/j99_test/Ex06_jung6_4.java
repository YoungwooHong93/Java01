package j99_test;

// ** 정석 기초 연습문제 6-4 p.209
// => 두 점의 거리를 계산하는 getDistance() 를 완성하시오.
//	  제곱근 계산은 Math.sqrt(double a) 를 사용하면 된다.
//	  두 점의 거리를 계산하는 공식 ((x 좌표 차이의 제곱) + (y 좌표 차이의 제곱)) 의 제곱근 
//	  ( Math. pow(double a, double b) -> 제곱값을 return )

// ** 정석 기초 연습문제 6-6 p.210
// => 6-4문제 에서 작성한 클래스메서드를 MyPoint 클래스의 
//	  getDistance()인스턴스메서드로 정의하시오.
// => 추가조건
//  - 기준위치(x, y) 는 멤버변수로 정의하고 생성자의 매개변수로 전달받아서 초기화 한다.
//	- getDistance() 는 매개변수를 2개만 사용하면됨.

class MyPoint {

	int x;
	int y;
	
	MyPoint() {} // default 생성자
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	} // MyPoint
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((this.x-x1) * (this.x-x1) + (this.y-y1) * (this.y-y1));
	}
	
	
} // MyPoint_class



public class Ex06_jung6_4 {
	// ** 정석 기초 연습문제 6-4 p.209
	public static double getDistance(int x, int y, int x1, int y1) {

		return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1)) ;
		// -> Math.pow() 호출 하는것 보다 연산식으로 처리하는것이 더 효율적.
	} //getDistance


	public static void main(String[] args) {
		System.out.println("** 두 지점간의 거리 => "+getDistance(10, 5, 20, 5));
		System.out.println("** 두 지점간의 거리 => "+getDistance(10, 5, 20, 15));
		System.out.println("");
		
		// ** 정석 기초 연습문제 6-6
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
		System.out.println("");
		
		MyPoint p1 = new MyPoint(5, 5);
		System.out.println(p1.getDistance(10, 10));
		System.out.println(p1.getDistance(20, 20));
	} //main

} //class
