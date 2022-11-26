package j01_basic;


//** 이클립스 단축키 
//자동 import : Ctrl+Shift+O
//Line삭제 : Ctrl + d

//들여쓰기 : Ctrl+A , Ctrl+I 
//=> 한번에 Ctrl+Shift+F

//클래스 Ctrl+클릭 => 클래스 소스보기 
//클래스 Ctrl+T => 클래스 계층도 

//** 클래스 
//=> 클래스명은 파일명과 동일함.
//=> 맴버   
// 변수:value, (변수 = 속성)
// 메서드 (함수 function , 프로시져 procedure) : 동작

//** 문장(Statement)
//=> 사용자가 컴퓨터에게 작업을 지시하는 단위
//=> 문장의 끝은 항상 세미콜론 (;)
//=> 선언문과 실행문 은 반드시 메서드 안에 작성 ex) System.out.println(); 

//** Java Coding
//=> 대.소 철처하게 문자구별함

/* 주석(comment)의 종류
  => 한줄 주석
 	=> 여러줄 주석
*/

/** documentation
  => 선언문 (클래스 또는 메서드의 선언부_Header) 앞에만 사용가능하고 
     JDK에 포함된 javadoc 프로그램이 주석을 추출하여
     소스를 설명하는 HTML 문서를 만들어줌 
  => 활용법은 아래 참고 
     https://johngrib.github.io/wiki/java/javadoc/     
*/
// class 이름과 파일이름은 같아야 하고 클래스의 첫 글자는 대문자로 해야한다.
// class 안에 있는 애들은 member 라고 함.

public class Ex01_Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hello Java !!!"); // 매개변수 자리에는 문자형식만 올수 있다. ("") 
		System.out.println(" 안녕하세요 !!!");
		System.out.println(" 수강생 홍영우 입니다. ~~");
		System.out.println(" 저는 30세, xxkg 입니다. ~~");
		System.out.println(" 잠이 옵니다. ~~");
		System.out.println(" 합계1 => "+ 100+200);
		System.out.println(" 합계2 => "+ (100+200)); // () 로 묶으면 우선순위 설정이 된다.
	}	//main

}	//class
