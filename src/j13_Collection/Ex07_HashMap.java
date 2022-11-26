package j13_Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// ** 해싱과 해시함수 => 정석 651p
// 해싱 => 해시 함수를 이용해서 데이터를 해시 테이블에 저장하고
//     검색하는 기법

// ** Map ( Key, Value )
// => HashMap (Key 값의 중복을 허용하지 않고, 순서 유지를 보장받지 못한다.) 
// => TreeMap (Key 값의 중복을 허용하지 않고, 키값으로 오름차순 정렬이 된다.)
// => LinkedHashMap (Key 값의 중복을 허용하지 않고, 입력순서 유지를 보장받는다.)

// ** HashMap : Key, Value 정보 지정
// => key 는 유일, Value 는 중복 허용 
// => null 값 허용 map.put(null, null) 또는 map.get(null) 가능

public class Ex07_HashMap {

	public static void main(String[] args) {
		// 1. HashMap
		// 1.1) 정의
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		
		// 1.2) put
		// => Key: 중복불허, Value: 중복무관
		// 		   중복 입력 시 오류는 없고, 나중에 입력된 값을 보관함.
		// => 키 값에 int 1,2,3 을 넣은거지만 내부적으론 Integer로 자동 적용됨.
		hm.put(1, "Python");
		hm.put(10, "Spring");
		hm.put(2, "Java");
		hm.put(20, "Spring");
		hm.put(3, "MySql");
		hm.put(30, "Oracle");
		hm.put(new Integer(4), "JDBC");
		hm.put(5, "Servlet");
		hm.put(1, "Jsp");
		
		// 1.3) 출력
		System.out.println("HashMap 1 => "+hm);
		
		// 1.4) 활용
		// => get, remove, size
		// => key 값으로 접근함. (인덱스 가 아님!!)
		System.out.println("HashMap size => "+hm.size());
		System.out.println("HashMap get(4) => "+hm.get(4));				// Key = 4 인 자료를 의미
		System.out.println("HashMap remove(3) => "+hm.remove(3));		// Key = 3 인 자료를 의미
		System.out.println("HashMap After remove get(4) => "+hm.get(4));
		System.out.println("HashMap 2 => "+hm);
		System.out.println("");
		
		// 2. 각종 Map 비교
		// => TreeMap (Key 값의 중복을 허용하지 않고, 키값으로 오름차순 정렬이 된다.)
		// => LinkedHashMap (Key 값의 중복을 허용하지 않고, 입력순서 유지를 보장받는다.)
		// => 생성자의 매개변수로 위의 HashMap을 사용
		Map<Integer, String> tm = new TreeMap<Integer, String>(hm);
		System.out.println("TreeMap => "+tm);
		System.out.println("");
		
		Map<Integer, String> lm = new LinkedHashMap<Integer, String>(hm);
		System.out.println("LinkedHashMap 1 => "+lm);
		System.out.println("");
		// => hm 의 입력 순서가 아닌 60행에서 매개변수로 전달된 순서가 적용됨.
		// => 입력순서 확인
		lm = new LinkedHashMap<Integer, String>();
		lm.put(1, "Python");
		lm.put(10, "Spring");
		lm.put(2, "Java");
		lm.put(20, "Spring");
		lm.put(3, "MySql");
		lm.put(30, "Oracle");
		lm.put(new Integer(4), "JDBC");
		lm.put(5, "Servlet");
		lm.put(1, "Jsp");
		System.out.println("LinkedHashMap 2 => "+lm);
		
	} //main

} //class
