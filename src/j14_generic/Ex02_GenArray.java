package j14_generic;

import j10_APITest.Ex05_Person;
import javaTest.Person;

// ** 과제
// => 배열을 출력해주는 클래스 만들기
//	  배열정의, setter/getter, arrayPrint()
// => 실행시에 원하는 타입을 결정 & 출력
// => 배열 타입 Generic

class GenArray<T> {
	private T[] arr;
	
	public void setArr(T[] arr) {
		this.arr = arr;
	}
	public T[] getArr() {
		return this.arr;
	}
	
	public void arrPrint() {
		for (T a: arr) {
			System.out.print(a + " ");
		} //for
		System.out.println("");
	} //arrPrint
	
	// ** 마지막 자료 출력하기
	public T getLast() {
		return arr[arr.length-1]; 
	}
	
} //GenArray


public class Ex02_GenArray {

	public static void main(String[] args) {
		// 1) String
		GenArray<String> ga1 = new GenArray<String>();
		String[] ss = {"홍영우","이재영","최수빈","최보라","신혜빈"};
		ga1.setArr(ss);
		ga1.arrPrint();
		System.out.println(" ga1.getLast => "+ ga1.getLast());
		System.out.println("");
		
		// 2) Integer
		GenArray<Integer> ga2 = new GenArray<Integer>();
		Integer[] i = {100, 200, 300, 400, 500};
		ga2.setArr(i);
		ga2.arrPrint();
		System.out.println(" ga2.getLast => "+ ga2.getLast());
		System.out.println("");
		
		// 3) Double
		GenArray<Double> ga3 = new GenArray<Double>();
		Double[] dd = {1.1, 2.2, 3.3, 4.4, 5.5};
		ga3.setArr(dd);
		ga3.arrPrint();
		System.out.println(" ga3.getLast => "+ ga3.getLast());
		System.out.println("");
		
		// 4) Character (char)
		GenArray<Character> ga4 = new GenArray<Character>();
		Character[] cc = {'가', '나', '다', '라', '마'};
		ga4.setArr(cc);
		ga4.arrPrint();
		System.out.println(" ga4.getLast => "+ ga4.getLast());
		System.out.println("");

		// 5) Person
		GenArray<Ex05_Person> ga5 = new GenArray<Ex05_Person>();
		Ex05_Person[] pp = {new Ex05_Person("881020-1111111", "홍길동"),
				new Ex05_Person("901122-2222222", "박길순"),
				new Ex05_Person("960102-1122222", "김길동"),
				new Ex05_Person("000511-3333333", "최길동"),
				new Ex05_Person("020202-4444444", "이길순")};
		ga5.setArr(pp);
		ga5.arrPrint();
		System.out.println(" ga5.getLast => "+ ga5.getLast());
		
	} //main

} //class
