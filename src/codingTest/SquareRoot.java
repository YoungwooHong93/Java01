package codingTest;

// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
// n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
public class SquareRoot {


	class Solution {
		public long solution(long n) {
			long answer = 0;
			
			// 1) 먼저 n의 제곱근을 구한다.
			//	  Math.sqrt() 는 제곱근을 구하는 도구이다. 리턴 타입은 double
			double d = Math.sqrt(n);
			
			// 2) n의 제곱근 결과인 d를 1로 나눈 나머지가 0 이면 d+1의 제곱을 반환
			//	  -> 0이 아니면 -1 을 반환.
			
			return (long)(d % 1 == 0 ? Math.pow(d+1, 2) : -1);
		} //solution
	} //Solution

	public static void main(String[] args) {


	} //main
} //class


