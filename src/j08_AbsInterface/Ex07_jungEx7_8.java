package j08_AbsInterface;

// ** 정석기초 p.253 예제
// => 매개변수로 클래스 활용
// => 자동 형변환 Test

class Product {
	int price;         // 제품의 가격
	int bonusPoint;    // 제품구매 시 제공하는 보너스점수
	int bigSale;  	   // 세일기간의 할인율

	Product(int price, int bigSale) {
		this.price = price;
		this.bigSale = bigSale;
		bonusPoint = (int)(price/10.0);   // 보너스점수는 제품가격의 10%
	}
} //Product

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price, int bigSale)를 호출한다.
		super(100,0);      // Tv의 가격을 100만원으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
} // Tv1

class Computer extends Product {
	// ** 새로운 변수를 사용하게 되면 조상에 정의하는것이 바람직함.
	// int bigSale = 10;
	Computer() { 
		super(200,10);
	}
	public String toString() { return "Computer"; }
} // Computer

class Mask1 extends Product {
	Mask1() {
		super(100,5);
	}
	public String toString() {
		return "Mask";
	}
}

class Mask {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매시 제공하는 보너스 점수
	Mask(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Buyer {   			// 고객, 물건을 사는 사람
	int money = 1000;    	// 소유금액
	int bonusPoint = 0; 	// 보너스점수

	Buyer (int money) {
		this.money = money;
	}
	// ** 확인사항
	// => Product 를 상속받지 않은 Mask 를 사기 위해서는 별도의 메서드가 필요함.
	// => Computer 에만 정의한 bigSale 은 p 객체로는 전달 불가능.
	// => Mask 는 비교용으로 만들어놓음.
	void buyMask(Mask p) {			 
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	} //buy_Mask

	void buy(Product p) {			 // Product 의 후손들은 매개변수로 전달이 가능함.
		// ** 할인적용하기
		p.price -= (p.price * p.bigSale / 100);// ??
		
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
		System.out.printf("**%s 을/를 %d에 구입하셨습니다.%n", p, p.price);
	} //buy
} //Buyer

public class Ex07_jungEx7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer(500);
		Product t1 = new Tv1();
		// => t1 인스턴스가 매개변수 뿐만 아니라 계속 사용해야 할 때 인스턴스를 만들어 사용함.
		//	  매개변수 로만 사용할때는 b.buy(new Computer()); 식으로 사용함.
		// => 매개변수로 전달 되면서 자동형변환(Up_Casting) 이 일어남.
		b.buy(t1);
		//b.buy(new Tv1());
		b.buy(new Computer());	// Product p = new Computer(); 구문과 동일
		b.buyMask(new Mask(100));
		b.buy(new Mask1()); // product 의 후손인 Mask1 은 buy 메서드 적용가능
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
		System.out.println("\n** Buyer C Test **");
		Buyer c = new Buyer(1000);
		c.buy(t1);
		//Product c1 = new Computer();
		// => price 값이 계속 누적되어 10% 할인이 적용되어 변경이됨.
		//c.buy(c1); // 180
		//c.buy(c1); // 162
		//c.buy(c1); // 146
		// => 이러한 문제를 보완 하려면 
		c.buy(new Computer());
		c.buy(new Computer());
		c.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + c.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + c.bonusPoint + "점입니다.");
		
	}

}
