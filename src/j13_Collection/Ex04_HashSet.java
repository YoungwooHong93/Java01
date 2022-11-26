package j13_Collection;

import java.util.HashSet;
import java.util.Iterator;

// ** Set : ppt 30 p
// => 원소의 중복을 허용하지 않고, 순서가 없음
// => HashSet, TreeSet, LinkedHashSet

// ** HashSet
// => HashSet은 해쉬 테이블에 원소를 저장하기 때문에 성능면에서 가장 우수,
//    하지만 원소들의 순서가 일정하지 않은 단점이 있다.

// ** Iterator 클래스 를 이용한 처리 (출력등..)
// => 배열 -> Set
// => Set -> Iterator : 순차 처리 적용

public class Ex04_HashSet {

	public static void main(String[] args) {
		// 1. 정의
		// => 순서 없고, 중복 불가
		// => 동일성 Test
		//    제네릭을 적용하지 않거나, Object Type 인경우
		//    값은 같지만 Type 이 다른 경우 Test (다른 데이터로 취급)

		// 1.1) Object
		Object[] ob = {"가", "나", "123", new Integer(123), "가", "나", "다"};

		HashSet<Object> oset = new HashSet<>();
		for( Object o : ob) {
			if( !oset.add(o) ) System.out.println(" 중복자료 => " +o);
		}

		System.out.println(" oset => " +oset);
		System.out.println("");
		// 1.2) String
		HashSet<String> set = new HashSet();

		// 2. add
		set.add("짜장면");
		set.add("짬뽕");
		set.add("123");
		//set.add(123);
		//set.add(new Integer(123)); // Type 이 일치하지 않으면 컴파일 오류가 발생.
		set.add("쌀국수");
		set.add("짜장면");

		// 3. 출력
		System.out.println(" set => " +set);

		// 4. 활용
		// => 삭제(반복처리 필요), 크기확인(Size)
		System.out.println(" set.size => "+set.size());
		System.out.println("");
		// ** Iterator 를 이용한  순차처리
		// => 순차적으로 비교하면서 원하는 값 찾기, 삭제하기 
		// =>  iset 의 remove 는 set 에 반영됨
		Iterator<String> iset = set.iterator();

		while(iset.hasNext()) {
			if (iset.next().contains("3")) iset.remove();
			//set.add("볶음밥");
			// => iset 을 처리하는 반복문 내부에서 set으로 접근하면
			// => 오류가 발생 : java.util.ConcurrentModificationException
		} //while

		set.add("볶음밥");
		System.out.println(" iset => " +iset);
		System.out.println(" set => " +set);
		System.out.println(" set.size => "+set.size());
		System.out.println("");
		
		// ** Iterator 인스턴스 재사용
		// Iterator 는 한번 사용을 마치면 자료를 포인트하는 커서가  
		// 끝에 가 있어 hasNext()가 false 를 return 하기 떄문에 
		// 재할당해야 한다.
		
		iset = set.iterator();
		while(iset.hasNext()) {
			String menu = iset.next();
			if(menu.contains("밥")) 
				System.out.println(" Iterator 인스턴스 재사용 => "+menu);
			// => 아래와 코드 비교
			//if(iset.next().contains("밥")) 
			//	System.out.println(" Iterator 인스턴스 재사용 => "+iset.next());
			// => 이렇게 코드사용 하면 볶음밥 다음 데이타가 출력됨.
		}
		
		// ** 반복문 사용예
		// => set 은 인덱스를 이용해서 차례대로 꺼내어 사용하는것이 불가능한 것이지,
		//	  무조건 반복문 내에서 사용할 수 없다는것은 아니다.
		for ( int i = 0; i < 3; i++) {
			set.add(String.valueOf(i)); 
			// => set.add("0"), set.add("1"), set.add("2")  
		}
	      System.out.println("** set => "+set);
	      System.out.println("** set.size  => "+set.size());
		
	} //main

} //class
