package j05_classMethod;

public class Ex10_PhoneUser {

	public static void main(String[] args) {
		// 1) static Test : 클래스명으로 접근.
		Ex10_Phone.setcompany("삼성갤럭시");
		System.out.println("** Company => "+ Ex10_Phone.getcompany());
		
		Ex10_Phone.staticTest();
		// 2) non_static : 인스턴스로 접근.
		// => default 생성자
		// => setter 로 초기화
		Ex10_Phone phone1 = new Ex10_Phone();
		phone1.setcolor("gold");
		phone1.setprice(100000);
		System.out.println("** phone1 => " + phone1);
		
		// => 생성자로 초기회
		Ex10_Phone phone2 = new Ex10_Phone("Silver", 200000);
		System.out.println("** phone2 => " + phone2);
		phone2.finalTest();
		
		// 3) company 수정 Test
		Ex10_Phone.setcompany("Apple");
		System.out.println("** phone1 => "+phone1);
		System.out.println("** phone2 => "+phone2);
		System.out.println("** PI Test => "+phone2.getprice()* Ex10_Phone.PI);
		System.out.println("** PI2 Test => "+phone2.getprice()* phone2.PI2);
		
		
		} //main

} //class
