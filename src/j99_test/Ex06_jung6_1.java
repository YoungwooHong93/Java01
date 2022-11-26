package j99_test;

// ** 정석 연습문제 p.207 6-1
class Student{

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {
		System.out.println("** Ex06_jung6_1 default 생성자 **");
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng; 
		this.math = math;
	}

	public String info() {
		return "학생이름=" + name + ", 반=" + ban + ", 번호=" + no + ", 국어점수=" + kor + ", 영어점수=" + eng
				+ ", 수학점수=" + math + ", 합계=" + (kor+eng+math) + ", 평균" + (kor+eng+math) / 3f;
	}
	
	public int getTotal() {
		return 	kor + eng + math;
	}
	
	public float getAverage() {
		return (getTotal() / 3) ;
		}
	
	
}
public class Ex06_jung6_1 {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.ban = 1;
		st1.no = 1;
		st1.kor = 80;
		st1.eng = 99;
		st1.math = 60;

		Student st2 = new Student("김길동", 1, 2, 80, 80, 80);

		System.out.println(st1.info());
		System.out.println(st2.info());
		
		Student[] class1 = {st1, st2, new Student("박길동", 1, 3, 90, 90, 90)};
		int ktotal = 0, etotal = 0, mtotal = 0;
		for (int i = 0; i < class1.length; i++) {
			// 1) 모든 학생의 과목별 합계 구하기
			ktotal += class1[i].kor;
			etotal += class1[i].eng;
			mtotal += class1[i].math;
		}
		
		System.out.println("** Kor Total => "+ktotal);
		System.out.println("** Eng Total => "+etotal);
		System.out.println("** Math Total => "+mtotal);
		
		System.out.println(st1.getTotal());
		System.out.println(st1.getAverage());
		System.out.printf("이름 : %s \n총점 : %d \n평균 : %f",st1.name, st1.getTotal(),st1.getAverage());
		
	} //main

} //class
