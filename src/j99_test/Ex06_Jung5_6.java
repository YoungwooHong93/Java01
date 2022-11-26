package j99_test;

import java.util.Scanner;

//** 정석기초 연습문제 5-6
//단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
//실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.

public class Ex06_Jung5_6 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();	// toCharArray를 하면 단어를 한글자씩 배열로 넣어줌.
			// String 을 char[] 로 변환
			
			// ** 과제
			// => char[] question 에 담긴 문자의 위치를 임의로 변경한다.
			for(int j = 0; j <question.length; j++) {
				int idx = (int)(Math.random() * question.length);
				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
				
			} //for_j
			
			
			System.out.printf("Q%d. %s의 정답을 입력하세요", i+1, new String(question));
			//												// char[] question => String 으로 변환시킨것임.
			String answer = scanner.nextLine();
			// trim() 으로 answer의 좌우 공백을 제거한 후, equals로 word[i] 와 비교.
			// if (words[i] == answer.trim())	// 이렇게 비교하면 다 틀렸다고 나옴. 주소값이여서..? 참조형변수..?
			if (words[i].equals(answer.trim()))		// String 끼리 비교할때 == 사용시 무조건 틀림. equals 사용해야함.
					System.out.printf("맞았습니다. %n%n");
			else	System.out.printf("틀렸습니다. %n%n");
		} //for_i

	} //main

} //class
