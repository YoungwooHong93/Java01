package j06_packageTest;

import j05_classMethod.Ex10_Phone;
//import j05_classMethod.Member;	// Error -> not visible

//** Access Modifier (접근한정자_제어자)
//=> private : 해당 클래스내부 에서만
//=> default : 같은 Package 내
//=> protected : package + 자손
//=> public : 프로젝트내의 모든 Class 접근 가능
//(단, 다른 package 에서는 import 해야함)

public class Ex01_accessTest {

	public static void main(String[] args) {
		// 1) public Test
		System.out.println("** Phone.company => "+Ex10_Phone.getcompany());
		System.out.println("** Phone.PI => "+j05_classMethod.Ex10_Phone.PI);
		// import 를 하면 패키지명을 생략 가능하다.
		System.out.println("");
		
		// ** 멤버수준 접근범위
		// => private , default 는 접근이 불가함.
		//System.out.println("** Phone.PI => "+Ex10_Phone.company);	// Error
		Ex10_Phone ex10 = new Ex10_Phone();
		//system.out.println("** ex10. PI2 => "+ex10.PI2);

		// 2) default (패키지 범위) Test
		// => 클래스 수준에서 허용되지 않음
		//	  그러므로 멤버수준의 접근범위(public)는 무시됨
		//	  즉, 접근이 불가함.
		//Member member = new Member();
		
		
		
	} //main

} //class
