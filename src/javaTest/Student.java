package javaTest;

// ** 맴버변수 정의
// -> 2.1 같은 패키지에서만 접근 가능한 int Type 맴버 변수 3개 정의. ( 변수명: java, html, sum ) o

// ** 생성자 1개 작성 
// -> 2.2 서브클래스의 변수 2개(java, html) 를 초기화하고,sum(총점) 에는 java 와 html 의 합 을 넣는다. o
// -> 2.3 수퍼클래스의 변수의 값도 모두 초기화 한다. o

// ** infoPrint() 메서드 Overriding
// -> 2.4 수퍼클래스의 내용과 서브클래스의 내용 모두 다음처럼 출력하도록 작성. o
// 번호 : S001
// 이름 : 홍길동1
// Java : 100
// Html : 50
// 합계  : 150

// -> 3.1 Student Type 배열을 매개변수로 전달받는다. o
// -> 3.2 인스턴스 없이 모든 클래스에서 호출 가능하도록 작성. o
// -> 3.3 매개변수로 전달된 배열을 합계(sum) 을 기준으로 성적순으로 정렬한다. o

public class Student extends Person {

	int java;
	int html;
	int sum;

	public Student(String pno, String pname, int java, int html) {
		super(pno, pname);
		this.java = java;
		this.html = html;
		this.sum = java + html;
	}

	@Override
	public void infoPrint() {
		super.infoPrint();
		System.out.println(
				" Java : " +java+ "\n" +
				" Html : " +html+ "\n" +
				" 합계 : " +sum);
	}
	
	public static void studentSort(Student[] students) {
		// 성적순으로 정렬
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++ ) {
				if ( students[i].sum < students[j].sum ) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				} //if
			} //for_j
		} //for_i
	} //studentSort

} //Studnet

