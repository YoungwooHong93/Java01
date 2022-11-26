package j05_classMethod;

// ** 접근제어자
// => 접근 범위를 제한
// => public(프로젝트 전체에서 접근) > protected (상속+default) > default(패키지 내에서 접근) > private(클래스 내에서 접근)

//** 설정자(mutator) 와 접근자(accessor)
//=> 외부클래스 에서 변수에 직접 접근하지 못하도록 하고, 
// 메서드를 통해서만 접근하도록 함
//=> 그러면 변수에 값을 넣어주는 메서드 (설정자) 와
// 변수의 값을 보여주는 메서드 (접근자) 가 필요함.
//=> 설정자: 맴버변수 write, setXXX() 형식 -> setter
//=> 접근자: 맴버변수 read, getXXX() 형식 -> getter

//=> 메서드를 통해 접근하므로 변수값에 대한 Control 이 가능함
//=> 필요에 따라서 setter , getter 를 적절하게 작성해서 외부에서의 접근을 조정 할 수 있음

// (default) class Member = 같은 package 에서만 접근이 가능함.
class Member {
	// ** 접근제어로 Data 보호
	// => private : 해당 클래스만 접근 가능.
	// => 클래스 외부 에서는 메서드를 통해 접근 가능. 
	//	  설정자(mutator) 와 접근자(accessor)
	
	private String id;
	private String name;
	private int age;
	
	// ** 생성자
	// => // => 우클릭,단축메뉴 - Source - Generate Constructor using Fields....
	public Member() {}
	
	public Member(String id, String name, int age) {
		//super();			// 조상을 의미함. (상속때 배움)
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// ** getter / setter	// 보통 public 으로 많이사용.
	// => get, set + 변수명의 첫글자를 대문자 (낙타표기법)
	public void setId(String id) {
		if ( id.contains("불량") )return;
		this.id = id;
	}
	public String getId() {
		return this.id;		// this 를 안붙여도 되지만 정확하게 표기하기위해 사용.
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge () {
		return this.age;
	}
	
	
	// ** toString
	// => 우클릭,단축메뉴 - Source - Generate toString() ..
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
} //Member

public class Ex09_MemberTest {

	public static void main(String[] args) {
		// ** 생성자로 초기화
		Member m1 = new Member("banana", "홍길동", 20);
		System.out.println("** m1 => "+ m1);
		m1.setName("김길동");
		System.out.println("** m1.name => "+ m1.getName());
		System.out.println("");
		
		// m1.name = "Test" -> 멤버변수 직접 접근 불가능 (변수 보호용)
		
		// ** setter 로 초기화
		Member m2 = new Member();
		m2.setId("Apple");
		m2.setName("스티브");
		m2.setAge(100);
		System.out.println("** m2 => "+ m2);
		System.out.println("");
		System.out.println("** age 합계 => "+ (m1.getAge()+m2.getAge()));
		
		
	} //main

} //class
