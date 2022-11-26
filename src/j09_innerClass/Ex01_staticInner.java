package j09_innerClass;


class Outer2 {
	// => Instance
	class InstanceInner {
		int iv = 100;
	}

	// => static
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	// => Local
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
		LocalInner li = new LocalInner();
		System.out.println("** myMethod iv =>"+li.iv);
	} //myMethod
} //Outer2


public class Ex01_staticInner {

	public static void main(String[] args) {
		// 1) Instance 클래스 생성
		// => 외부 클래스의 인스턴스에 종속된 인스턴스를 생성
		Outer2.InstanceInner ic = new Outer2().new InstanceInner();
		System.out.println("** ic 의 iv => "+ic.iv);
		System.out.println("");
		// 2) static class의 static 멤버 접근 :
		// 2-1) 내부 클래스 인스턴스는 필요없지만 외부 클래스를 통해 접근해야됨.
		System.out.println("** Outer2.StaticInner => "+Outer2.StaticInner.cv);
		// 2-2) static 내부 class의 인스턴스 멤버
		// => static 내부 class의 인스턴스가 필요함
		Outer2.StaticInner sc = new Outer2.StaticInner();
		System.out.println("** sc 의 iv => "+sc.iv);
		
		// 3) Local inner class
		new Outer2().myMethod();
		
	} //main

} //class
