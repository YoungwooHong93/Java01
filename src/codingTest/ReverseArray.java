package codingTest;

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
public class ReverseArray {

    public int[] solution(long n) {
    	int length = Long.toString(n).length();
    	int[] answer = new int[length];
    	for (int i = 0; i < length; i++) {
    		answer[i] = (int) (n % 10);
    		n /= 10;
    		System.out.print(answer[i]);
    	}
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		ReverseArray ra = new ReverseArray();
		
		ra.solution(12345);
		System.out.println("");
		ra.solution(12512345);
		System.out.println("");
		ra.solution(12312345);
		System.out.println("");
		ra.solution(16462345);
		
	} // main

} //class
