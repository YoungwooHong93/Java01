package codingTest;

import java.util.Arrays;

public class Test {

	public static int plus(float i, int j) {
		int answer;
		float div = (i / j) * 1000;
		System.out.println(div);
		answer = (int)div * 1000;
		return answer;
	}
	
	public int solution(int[] array, int height) {
        int answer = 0;
        for (int i =0; i < array.length; i++) {
        	if ( array[i] > height) {
        		answer ++;
        	}
        }
        
        return answer;
    }
	
    public int[] solution(int money) {
        // 아아 한잔에 5,500원
    	// money 매개변수는 머쓱이의 돈
    	// 살수 있는 잔수는 index 0, 남은 돈은 index1
    	
    	int[] answer = new int[2];
        int ameri = 5500;
        answer[0] = money / ameri;
        answer[1] = money % ameri;
        
        return answer;
    }
	
	
	public int[] solution(int denum1, int num1, int denum2, int num2) {
		int[] answer = {};
		return answer;
	}

	public static double sl(int[] nums) {
		double answer = 0;
		for(int i = 0; i < nums.length; i++) {
			answer += nums[i]; 
		}
		return answer / nums.length;
	}
	
	
    public static int solutions(int n) {
    	int answer = 0;
        
        String num = Integer.toString(n);
        
        num.charAt(n);
        
        
        
        System.out.println(num);
        
        return answer;
    }
    
    public String solution(String my_string) {
        String answer = "";
        
        
        return answer;
    }
    
	
    public static int solution(int[] array) {
    	int answer = 0;
    	for (int i = 0; i < array.length; i++) {
    		for(int j = i + 1; j < array.length; j++) {
    			if (array[i] > array[j]) {
    				int temp = array[i];
    				array[i] = array[j];
    				array[j] = temp;
    				
    			} //if
    		} //for_j
    	} //for_i
    	return answer;
    } //solution
	
	public static void main(String[] args) {
		
		int[] array = {1,5,3,4,9};
		
		System.out.println(Test.solution(array));
//		System.out.println();
//		System.out.println(Test.plus(3, 2));
		
//		System.out.println(Test.sl(num1));
		
	
		

	} //main

} //class
