package javaTest;

// -> 1.1 클래스내부에서만 접근 가능한 String Type 맴버 변수 2개 정의. ( 변수명: no, name) o
// -> 1.2 기본(Default) 생성자와 두개의 변수를 초기화 하는 생성자 작성 o
// -> 1.3 setter/getter 조건 모든 클래스에서 맴버 변수 2개 모두 볼수는 있지만,수정은 할 수 없다. o
// -> 1.4 모든 클래스에서 사용가능하고, 다음처럼 출력되도록 infoPrint() 메서드를 작성한다. o

public class Person {
	private String no; 
	private String name; 
	
	public Person() {
	}
	
	public Person(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public void infoPrint() {
		System.out.println(
				" 번호 : " + no + "\n" +
				" 이름 : " + name);
	}

} //Person
