package codingTest;

// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
// arr은 길이 1 이상, 100 이하인 배열입니다.
// arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

public class Average {

	private double solution(int[] arr) {
//		int[] arr1 = new int[100];
		double answer = 0;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(sum);
		}
		answer = sum / arr.length;
		return answer;
	}
	
	public static void main(String[] args) {
		Average avg = new Average();
		
		int[] arr2 = {1,2,3,4};
		
		System.out.println(avg.solution(arr2));
		

	} //main

} //class
