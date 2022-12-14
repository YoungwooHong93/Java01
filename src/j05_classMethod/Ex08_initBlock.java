package j05_classMethod;

import java.util.Arrays;

// < 멤버 변수 초기화 >
// - 선언과 동시에 초기화 (간단한 경우) : 명시적 초기화(explicit initialization) 
// - 초기화블럭 또는 생성자 (복잡한 경우) 

// < 수행순서 >
// => 프로그램 로딩-> 클래스초기화블럭 -> main 메서드실행 -> 인스턴스 생성 (new)
//     -> 인스턴스초기화 블럭 -> 생성자 실행
//    그러므로 인스턴스 초기화 블럭은 인스턴스 생성시마다 실행 됨

public class Ex08_initBlock {
   
	static int[] arr = new int[10];
	static int count = 100;	// 명시적 초기화 : 선언과 동시에 값을 넣는것
	String color;
	double num;
	
   // < 초기화블럭 >
   // - 초기화 하는데 코드가 필요한 경우 작성.
   //   => 실행문 작성 가능.

   static {
      
      System.out.println("< static 변수 초기화 블럭 >"); // 출력1
      System.out.println("static {    }");
      // ** 실습
      // => 배열 arr 초기화 하기 : 1 ~ 10 사이의 임의의 수(Math.random) 이용
      for (int i = 0; i < arr.length; i++) {
    	  arr[i] = (int)(Math.random()*10+1);
    	  
      } //for
      
      
      
      System.out.println("");
   } // static_초기화
   
   //--------------------------------------------------------------
   
   {
      System.out.println("< 인스턴스 변수 초기화 블럭 >"); // 출력4, 출력7
      System.out.println("{    }");
      color = "white";
      num = (Math.random()*10+1);

      System.out.println("");
   } // 인스턴스
   
   // System.out.println("실행문 작성 Test => class에 직접 작성 불가능");
   
   //---------------------------------------------------------------
   
   // < 생성자 추가 >
   Ex08_initBlock() {
      System.out.println("< default 생성자 >"); // 출력5, 출력8

      System.out.println("");
   }

   public static void main(String[] args) {
      
      // < 실행 순서 >
      // => static -> main -> new -> 인스턴스 -> 생성자
      
      System.out.println("< main Start >"); // 출력2
      System.out.println("** arr => "+ Arrays.toString(arr));
      
      System.out.println("");
      
      System.out.println("< new test1 >"); // 출력3
      Ex08_initBlock test1 = new Ex08_initBlock();
      System.out.println("** main color1 => " + test1.color);
      System.out.println("** main num1 => " + test1.num); 
      System.out.println("");
      
      System.out.println("< new test2 >"); // 출력6
      Ex08_initBlock test2 = new Ex08_initBlock();
      System.out.println("** main color1 => " + test2.color);
      System.out.println("** main num2 => " + test2.num); 
      
   } // main

} // class