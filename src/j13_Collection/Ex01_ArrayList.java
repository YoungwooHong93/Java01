package j13_Collection;

import java.util.ArrayList;

import j10_APITest.Ex05_Person;

//ArrayList (ppt 18, 19 ~)

//** ArrayList<E> 의 저장용량  
// => 데이터가 증가하면 메서드 호출하지 않아도 저장용량은 자동증가 함
// => 필요시엔 미리 설정가능
// 1) 생성자 
// => 초기값 지정 가능 :  new ArrayList<>(100) ;
// 2) 메서드 이용
// => public void ensureCapacity(int minCapacity) : ArrayList 에 정의

// ** 계층도
// => Collection(i) -> List(i) -> LinkedList, ArrayList

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// 1. 정의
		ArrayList list = new ArrayList();

		// ** 저장용량
		// => 필요시에 자동으로 늘려줌
		//    (매우 비효율적 : 큰공간을 할당하고 기존의 값들을 이동함 )
		// => 생성시에 할당가능 : 생성자 매개변수로 지정
		//	  생성시에 필요한 충분한 용량을 할당하는것이 바람직함.
		
		// ** 비교
		// 사이즈는 리스트의 요소의 수,
		// 용량은 리스트 잠재적으로 그 내부구조를 재 할당없이 수용할 수 있는 요소의 수
		System.out.println(" size 0 => " +list.size());
		list.ensureCapacity(20);
		System.out.println(" size 1 => " +list.size());
		
		// 2. 초기화
		// => add (기본자료형 -> Wrapper : 자동형변환)
		list.add(100);
		list.add(new Integer(200));
		list.add(100);
		list.add("홍길동");
		list.add(300);
		list.add(400);
		list.add(500);

		// 3. 사용
		// => get, set(수정), remove
		int sum = (int)list.get(0) + (int)list.get(1); // 100 + 200 = 300
		System.out.println(" sum => "+sum);
		System.out.println(" size 2 => " +list.size()); // 7

		list.set(0, sum); // 수정
		list.add(2, 888); // 끼워넣기
		list.remove(4);	  // 삭제
		System.out.println(" size 3 => " +list.size()); // 7

		// 4. 출력
		for (Object o : list) {
			System.out.print(o +" ");
		}
		System.out.println("");

		// 5. Person 추가하기
		list.add(1, new Ex05_Person("990909-2234567","이그린"));

		for (Object o : list) {
			System.out.print(o+" ");
		}
		System.out.println("");
	} //main

} //class
