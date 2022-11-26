package j10_APITest;

import java.util.Arrays;

public class Ex05_PersonTest {

		public static void pSort(Ex05_Person[] ars) {
			for (int i = 0; i < ars.length; i++) {
				for (int j = i + 1; j < ars.length; j++) {
					if ( ars[i].getAge() < ars[j].getAge()) {
						Ex05_Person temp = ars[i];
						ars[i] = ars[j];
						ars[j] = temp;
					} //if
				} //for_j
			} //for_i
		} //pSort
	
	public static void main(String[] args) {
		Ex05_Person p1 = new Ex05_Person("090909-3234567", "홍길동");
		p1.infoPrint();
		System.out.println("** toString " +p1);
		System.out.println("");
		
		Ex05_Person p2 = new Ex05_Person("890909-1234567", "이길동");
		p2.infoPrint();
		System.out.println("** toString " +p2);
		System.out.println("");
		
		Ex05_Person p3 = new Ex05_Person("880909-1234567", "박길동");
		p2.infoPrint();
		System.out.println("** toString " +p3);
		System.out.println("");
		
		Ex05_Person p4 = new Ex05_Person("930909-1234567", "최길동");
		p2.infoPrint();
		System.out.println("** toString " +p4);
		System.out.println("");
		
		Ex05_Person p5 = new Ex05_Person("980909-1234567", "양길동");
		p2.infoPrint();
		System.out.println("** toString " +p5);
		
	
				
		// ** Person Type 의 배열에 5명을 채우고 나이순으로 출력하기
		// => age 순 descending(내림차순)
		// => 순서 : Person Type 배열 정의, 5명으로 초기화, 정렬, 출력
				
		Ex05_Person[] people =  {p1, p2, p3, p4, p5};
//			for( int i = 0; i < people.length; i++) {
//				for (int j = i+1; j < people.length; j++) {
//					if ( people[i].getAge() < people[j].getAge()) {
//						Ex05_Person temp;
//						temp = people[i];
//						people[i] = people[j];
//						people[j] = temp;
//						
//					} //if
//				} //for_j
//			} //for_i
		
			pSort(people);
			for ( Ex05_Person p : people) {
				System.out.println("*-------------*");
				p.infoPrint();
			}
			
	//System.out.println(Arrays.toString(people));
				
	} //main

} //class
