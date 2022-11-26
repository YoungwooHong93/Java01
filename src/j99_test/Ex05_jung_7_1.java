package j99_test;

// ** 정석기초 연습문제 7-1 p.281
//=> 섯다카드 20장을 포함하는 섯다카드 한 벌 (SutdaDeck 클래스)을 정의한 것이다.
//섯다카드 20장을 담는 SutdaCard Type 의 배열을 초기화하시오.
//단 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
//숫자가 1, 3, 8 인 경우에는 둘 중의 한 장은 광(Kwang) 이어야 한다.
//( 1,1K,2,2,3,3K,4,4,5,5,6,6,7,7,8,8K,9,9,10,10 )
//즉 SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

// ** 정석기초 연습문제 7-2
//=>  다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//1. 메서드명 : shuffle 
//기   능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다. (Math.random() 사용) 
//반환타입 : 없음 
//매개변수 : 없음

//2. 메서드명 : pick 
//기   능 : cards 배열 에서 지정된 위치의 SutdaCard를 반환한다.
//반환타입 : SutdaCard
//매개변수 : int index - 위치 

//3. 메서드명 : pick 
//기   능 : cards 배열 에서 임의의 위치의 SutdaCard를 반환한다. (Math.random() 사용)
//반환타입 : SutdaCard
//매개변수 : 없음

class SutdaDeck {
	// 배열정의
	final int CARD_NUM =20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	// default 생성자로 초기화
	public SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i%10 + 1; // i=0,1,2...10...19 / n=1,2,...10
			boolean isKwang = (i<10) && (num==1 || num==3 || num==8);

			cards[i] = new SutdaCard(num, isKwang);
		} //for

	} //생성자

	// => Math.random()사용
	//	  맞교환 할 cards 배열의 인덱스를 찾으면 됨
	void shuffle () {
		for (int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			SutdaCard temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
	} //shuffle

	SutdaCard pick(int i) {
		// index 의 유효범위 확인 ( 0 ~ 19 )
		if (i < 0 || i >= CARD_NUM ) {
			System.out.println("** index 오류 입니다 **");
			return null;
		}
		return cards[i];
	} //pick

	// => Math.random()사용
	SutdaCard pick() {
		int i = (int)(Math.random()*cards.length);
		//return cards[i];
		return pick(i);
	} 

} //SutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info() 대신 Object 클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}

} //SutdaCard

public class Ex05_jung_7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i< deck.cards.length; i++) {
			System.out.print(deck.cards[i]+" ");
		} //for
		
		// 정석기초 연습문제 7-2
		System.out.println("\n** before, pick(0) =>" +deck.pick(0));
		System.out.println("** before, pick() =>" +deck.pick());
		deck.shuffle();
		System.out.println("** shuffle **");
		for (int i = 0; i< deck.cards.length; i++) {
			System.out.print(deck.cards[i]+" ");
		} //for
		System.out.println("\n** after, pick(0) =>" +deck.pick(0));
		System.out.println("** after, pick() =>" +deck.pick());

	} //main

} //class
