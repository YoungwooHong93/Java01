package j12_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//** AgeException 만들기1 -> Checked
//=> 나이의 값이 범위를 벗어나면 Exception 발생
//=> 예외처리를 강제함 -> try ~ catch 처리하지 않으면 컴파일 오류 발생 
//=> Exception 을 상속

class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	AgeException() {
		super("나이가 범위를 벗어남");
	}
	
} //AgeException

public class Ex08_MyExceptionChecked {
	// ** 나이 입력받아 return 하는 메서드 만들기
	// => 예외처리 코드를 컴파일시에 반드시 확인함
	public static int readAge() throws AgeException, InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("** 나이를 입력 하세요 => ");
		int age = sc.nextInt();
		sc.close();
		if(age < 1 || age > 200) throw new AgeException();
		else return age;
		
	} //Ex08_MyExceptionChecked
	
	
	public static void main(String[] args) {
	      // Cheaced Exception 을 throw -> throws했기 때문에
	      // 예외처리를 반드시 해야한다.
          // System.out.println(" main : Age => " + readAge() ");
	      try {
	         System.out.println(" main : Age => " + readAge());
	      } catch (AgeException e) {
	         System.out.println(" AgeException => " + e.toString());
	      } catch (Exception e) {
	         System.out.println(" AgeException => " + e.toString());
	      }

	      System.out.println(" Program 정상종료 ");

	   } // main

	} // class