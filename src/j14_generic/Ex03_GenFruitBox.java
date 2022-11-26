package j14_generic;

// ** Generic Class Test 
// ** FruitBox 만들기
// => Apple, Banana 등 모든 과일을 담을수 있는 FruitBox class 를 만들어 보세요.
//	  단, 과일들만 담을수 있음.
//	  ( 자율적으로 해보시면 됩니다 )
//	  힌트 : Apple, Banana 등 각종 과일들이 객체형(class)이고,
//	  이들은 모두 과일(Fruit) 로 구분 될 수 있어야함 

class Fruit {
	public String toString() {
		return "I am Fruit";
	}
} //Fruit

class Apple extends Fruit {
	public String toString() {
		return "I am Apple";
	}
} //Apple

class Banana extends Fruit {
	public String toString() {
		return "I am Banana";
	}
} //Banana

class Orange extends Fruit {
	private String color;
	
	Orange(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "I am " + color + " Orange";
	}
} //Orange

class Tomato {
	public String toString() {
		return "I am Tomato";
	}
} //Tomato

// => 과일들만 담을 수 있는 FruitBox 만들기
// => Generic 으로 Fruit 의 후손들만 담을 수 있는 배열에 set & print 만들기
//	  Fruit 의 후손들만 사용가능 하도록 Generic Type 제한

class FruitBox<T extends Fruit> {
	private T[] farr;
	
	public void setFarr(T[] farr) {
		this.farr = farr;
	}
	
	public void fruitPrint() {
		for ( T f:farr ) {
			System.out.println(f);
		} //for
	} //fruitPrint
	
} //FruitBox

public class Ex03_GenFruitBox {

	public static void main(String[] args) {
		FruitBox<Fruit> f1 = new FruitBox<Fruit>();
		Fruit[] fa = {new Apple(), new Banana(), new Orange("Red"), new Fruit()};
		f1.setFarr(fa);
		f1.fruitPrint();
		System.out.println("");
		
		FruitBox<Orange> f2 = new FruitBox<Orange>();
		Orange[] oa = {new Orange("Green"), new Orange("Yellow"), new Orange("Pink"), new Orange("White")};
		f2.setFarr(oa);
		f2.fruitPrint();
		
		// FruitBox<Tomato> f3 = new FruitBox<>();
		// => Fruit 의 자손이 아니라 불허함.
		
		
	} //main

} //class
