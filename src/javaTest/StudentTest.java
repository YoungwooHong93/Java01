package javaTest;

// -> 4.1 크기5 인 Student Type 의 배열을 만들고 초기화 한다. o
// -> 4.2 studentSort 메서드를 이용하여 성적순으로 정렬한다.  o
// -> 4.3 아래 예시와 같이 성적순으로 출력한다. o

public class StudentTest {
	
	public static void main(String[] args) {
		Student[] students = {new Student ("S001", "최수빈", 100, 50),
				new Student ("S002", "최보라", 80, 80),
				new Student ("S003", "홍영우", 90, 90),
				new Student ("S004", "홍길동", 50, 50),
				new Student ("S005", "이재영", 75, 50)};
		
		
		Student.studentSort(students);
		System.out.println("** 석차순 출력 **");
		
		for (Student s : students) {
			System.out.println("\n*-------"+ s.getName()+ "-------*");
			s.infoPrint();
		}
		
	} //main

} //class
