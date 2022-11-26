package j99_test;

// ** 정석기초 연습문제 9-5
// => 다음과 같이 정의된 메서드를 작성하고 테스트하시오.

//	  메서드명 : delChar
//	  기   능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
//	  반환타입 : String
//	  매개변수 : String src = 변환할 문자열
//			   String delCh - 제거할 문자들로 구성된 문자열
// => [힌트] StringBuffer, String, charAt(int i), indexOf(int ch) 를 사용하라.

public class Ex07_jung9_5 {
	
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		for ( int i = 0; i < src.length(); i++) {
			// => src 의 character 를 차례대로 꺼내어 금지어 인지 확인하기
			//	  indexOf(c) 에서 c 가 없는 문자면 -1 return
			char c = src.charAt(i);
			if (delCh.indexOf(c) < 0) sb.append(c);
		} //for
		
		return sb.toString();
	} //delChar
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		// (1!2@3^4~5) -> 12345
		System.out.println("(1 2 3 4\t5)"+" -> "+delChar("(1 2 3 4\t5)"," \t"));
		// (1 2  3  4  5) -> (12345)
		
		

	} //main
} //class
