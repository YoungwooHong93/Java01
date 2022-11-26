package j07_classExtends;

// ** static import
// => static 멤버 호출 시 클래스명 생략가능
import static j07_classExtends.Animal.color;

public class Ex03_Child extends Ex03_Father {

	String name ;
	int money;

	Ex03_Child () {
		System.out.println("** Child default 생성자 **");
	}

	// ** Father Child 모두 초기화 하는 생성자
	Ex03_Child (String fname, int fmoney, String name, int money) {
		super(fname, fmoney);
		this.name = name;
		this.money = money;
		System.out.println("** Father, Child 초기화 생성자 **");
	}

	// => Father fianl : 오버라이딩 금지
	// => 오버로딩은 무관
	//public void bank(int money, int i) {
	
	// => Father 에서 static 을 적용한 경우 : 오버라이딩 금지
	//	  그러나 Child 에서 같은 이름의 static 메서드 생성은 가능하나
	//	  Child 에서 같은 이름의 인스턴스 메서드는 생성 불가능함.
	//public static void bank(int money) {
	
	@Override
	public void bank(int money) {
		this.money += money*0.8;
		// Father 용돈 드리기
		money*=0.2;	// money = money * 0.2;
		super.bank(money); // => 접근을 완전 차단 하려면 Father에서 private 사용
	}

	@Override
	public void info() {
		super.info();
		System.out.printf("** Child: country = %s, name = %s, money = %,d \n", country, name, money);
	}

	public static void main(String[] args) {

		Ex03_Child c1 = new Ex03_Child();
		c1.name = "홍길동";
		c1.bank(10000);
		c1.info();

		Ex03_Child c2 = new Ex03_Child("김길동",100000,"김아들",50000);
		c2.bank(-1000000);
		c2.info();
		
		// ** static import Test
		System.out.println("** static import 전 Animal color => " + Animal.color);
		System.out.println("** static import 후 Animal color => " + color);
	}

}
