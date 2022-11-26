package j05_classMethod;

// ** 정석기초 연습문제 6_2
// => 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info() 메서드 를 추가하시오.
// info() 메서드 : toString 메서드 참고
// => ("홍길동", 1, 1, 100, 60, 76); -> 이름, 반, 번호, java점수, html점수, js점수

class Student {
	// 1) 멤버변수 정의
	String name;
	int grade;
	int number;
	int java;
	int html;
	int js;
	//int sum;
	//double avg;

	// 2) 변수를 초기화 하는 생성자 필요
	Student(String name, int grade, int number, int java, int html, int js) {
		this.name = name;
		this.grade = grade;
		this.number = number;
		this.java = java;
		this.html = html;
		this.js = js;
		//this.sum = java + html + js;
		//this.avg = (java + html + js) / 3; 
	}


	// 3) info 메서드

	public String info() {
		return 
				"* 이름 : " + name + "\n" +
				"* 반번호 : " + grade + "\n" +
				"* 번호 : " + number + "\n" +
				"* Java : " + java + "\n" +
				"* Html : " + html + "\n" +
				"* Jscript : " + js + "\n" + 
				"* 합  계 : " + (java+html+js) + "\n" +
				"* 평  균 : " + (((double)java+html+js) / 3);
	}

	public String toString() {
		return 
				"* 이름 : " + name + "\n" +
				"* 반번호 : " + grade + "\n" +
				"* 번호 : " + number + "\n" +
				"* Java : " + java + "\n" +
				"* Html : " + html + "\n" +
				"* Jscript : " + js + "\n" + 
				"* 합  계 : " + (java+html+js) + "\n" +
				"* 평  균 : " + (((double)java+html+js) / 3) + "\n";
	}

} //Student

public class Ex99_jung6_2 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);

		String str = s1.info();
		System.out.println(str);
		System.out.println("** toString Test => \n"+ s1);
		// toString 메서드가 없으면 주소 출력

		Student s2 = new Student("김길동", 1, 2, 100, 60, 76);
		System.out.println("** toString Test => \n"+ s2);

		Student s3 = new Student("이길동", 1, 3, 100, 60, 76);
		System.out.println("** toString Test => \n"+ s3);

		// ** 반 별 통계
		// => 배열 적용하기
		//String[] ss = { " " };
		Student[] ss = { s1, s2, s3, new Student("박길동", 1, 4, 100, 60, 76) };
		int jTotal = 0, hTotal = 0, jsTotal = 0;
		for (int i = 0; i < ss.length; i++) {
			// 1) 모든 학생의 과목별 합계 구하기
			jTotal += ss[i].java;
			hTotal += ss[i].html;
			jsTotal += ss[i].js;
		}
		System.out.println("** Java Total => "+ jTotal);
		System.out.println("** Html Total => "+ hTotal);
		System.out.println("** Jscript Total => "+ jsTotal);

	} //main

} //class
