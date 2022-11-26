package codingTest;

// 프로그래머스 자릿수 더하기 문제
// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
public class StringNum {

	static class Solution {
		
		public static int solution(int n) {
			int answer = 0;
			String strNum = Integer.toString(n);
			int[] arrNum = new int[strNum.length()];
			for (int i = 0; i < strNum.length(); i++) {
				
			}
			return answer;
		} //solution
//		while( n > 0) {
//			answer+= n%10;
//			n /= 10;
//		} //while
//		
		public Solution() {
		}
	} //class
		
	public static void main(String[] args) {
		
		
		// 각 자릿수의 합 구하기
//		int num = 987;
//		int sum = 0;
//		String strNum = Integer.toString(num);
//		int[] arrNum = new int[strNum.length()];
//		for (int i = 0; i< strNum.length(); i++) {
//			arrNum[i] = strNum.charAt(i) - '0';
//			sum += arrNum[i];
//		} //for
		
		
	} //main

} //class
