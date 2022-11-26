package j05_classMethod;

// ** static Test
// => Phone 클래스 정의
// 멤버변수 3개 (static 1개, non_static 2개)
// 메서드 2개 (static 1개, non_static 1개)
// 멤버변수 3개를 생성자로 초기화 한다.

// ** 추가실습
// => price 는 수정 불가능(readOnly)하도록 한다.
//	  setter 은 작성하지 않고 getter 만작 성하면 값을 넣을수가 다.
//	  단, 초기화는 생성자로 한다.

// => (public) class Ex10_Phone : 프로젝트내 어디서든 접근이 가능.
public class Ex10_Phone {
	// 1) 멤버변수 정의
	// static 으로 정의한것은 호출 시 클래스명.변수명 으로 바로 호출가능.
	private static String company = "Green";
	private String color;
	private int price;
	// ** 상수정의 : 상수는 변하지 않는다.
	// => static final / final static
	public static final double PI = 3.14159;
	final double PI2 = 3.14159;	// (default) 접근범위 : 패키지내에서만 가능.
	
	// 2) 생성자
	public Ex10_Phone() { }
//	public Ex10_Phone(String color, int price, String company) { 
//	Ex10_Phone.company = company;
		public Ex10_Phone(String color, int price) {
		this.color = color;
		this.price = price;
	}

	// 3) getter / setter
	public static String getcompany() {
		return company;
	}
	
	public static void setcompany(String company) {
		Ex10_Phone.company = company;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	// 4) 메서드 정의
	// => 상수 Test
	public void finalTest () {
		//PI = 3.14159;		// readOnly -> 상수이기 때문에 수정 불가
		//PI2 = 3.14159;		// readOnly -> 상수이기 때문에 수정 불가
		System.out.printf("** PI = %f, PI2 = %f %n", PI, PI2);
	}
	
	public static void staticTest () {
		System.out.printf("** PI = %f, company = %s %n", PI, company);
	}
	
	
	// 5) toString
	@Override
	public String toString() {
		return "Ex10_Phone [color=" + color + ", price=" + price +
				", company = " + company + "]";
	}
	
	
	
}//Phone

