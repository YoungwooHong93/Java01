package j13_Collection;

import java.util.HashSet;

//** 대량 연산 메소드 (ppt 33~35, 대량연산)
//=> set1 과 set2 의 합집합, 교집합 ...

public class Ex06_SetUnion {

	public static void main(String[] args) {
		// 1. Set 을 2개 정의
		HashSet<String> set1 = new HashSet<String>(); 
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		set1.add("Pink");
		set1.add("Black");
		System.out.println(" set1 = > "+set1);
		System.out.println("");
		
		HashSet<String> set2 = new HashSet<String>(); 
		set2.add("Seoul");
		set2.add("Busan");
		set2.add("Green");
		set2.add("Paris");
		set2.add("Korea");
		System.out.println(" set2 = > "+set2);
		System.out.println("");
		
		// 2. 대량연산
		set1.addAll(set2); // set1에 합집합 union
		System.out.println(" set1 합집합 = > "+set1);
		System.out.println("");
		
		set1.retainAll(set2); // 교집합 intersection : set1의 원소 = set2의 원소
		System.out.println(" set1 교집합 = > "+set1);
		System.out.println("");
		
		// 부분집합 -> set2 가 set1의 부분집합 이면 true
		System.out.println(" set1 부분집합 => "+set1.containsAll(set2));
		System.out.println("");
		
		// 차집합 (difference of sets)
		set1.add("Red");
		set1.add("Blue");
		set1.removeAll(set2);
		System.out.println(" set1 차집합 = > "+set1);
		
	} //main

} //class
