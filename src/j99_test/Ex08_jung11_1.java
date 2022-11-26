package j99_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

// ** 정석기초 연습 11-1
// => ㄷㅏ음 코드의 실행결과를 적으시오.

public class Ex08_jung11_1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(12);
		list.add(2);
		list.add(10);
		list.add(2);
		list.add(7);
		System.out.println(" list => "+list);	// 중복허용
		
		HashSet set = new HashSet(list);		// 중복이 제거됨. 순서 유지 X
		System.out.println(" set => "+set);
		
		LinkedHashSet lset = new LinkedHashSet(set);	// 입력된 순서를 유지
		System.out.println(" lset => "+lset);
		
		TreeSet tset = new TreeSet(set);		// 오름차순으로 정렬된다.
		System.out.println(" tset = > " +tset);
		
		Stack stack = new Stack();
		stack.addAll(tset);
		while(!stack.empty()) {
			System.out.println(stack.pop());	
			// stack 에 저장된 값을 하나씩 꺼낸다.
			// => 출력 결과는 ? ->  7, 6, 3, 2
		}
		
		
	} //main

} //class
