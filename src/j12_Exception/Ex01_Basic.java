package j12_Exception;

public class Ex01_Basic {

	public static void main(String[] args) {
		int x=6, y=3, result=0;
		String s="123000";
		String[] names = {"Apple","Banana","Green"} ;
		
		// ** 비교
		// => Exception 처리를 하지않은 경우 
		//    Exception 발생위치에서 비정상종료
		//result = x/0;  java.lang.ArithmeticException: / by zero
		result = x/y;
		System.out.println("** result1 => "+result);
		
		// => Exception 처리를 한 경우
		//    Exception 발생되어도 정상진행 가능
		try {
			result = x/y;
			System.out.println("** result2 => "+result);
			System.out.println("** result3 => "+(result+=Integer.parseInt(s)));
			System.out.println("** 배열 Test => "+names[2]); // ArrayIndexOutOfBoundsException
			// => 배열크기 음수지정 : java.lang.NegativeArraySizeException -> Exception 블럭으로
			// names = new String[-1]; 
			s=null;
			System.out.println("** NullPointerException Test => "+s.length());
			
		} catch (ArithmeticException e) {
			System.out.println("** ArithmeticException => "+e.toString());
		} catch (NumberFormatException e) {
			System.out.println("** NumberFormatException => "+e.toString());	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("** ArrayIndexOutOfBoundsException => "+e.toString());
		} catch (NullPointerException e) {
			System.out.println("** NullPointerException => "+e.toString());	
		} catch (Exception e) {
			System.out.println("** Exception => "+e.toString());
		} finally {
			System.out.println("** finally => 무조건 실행 **");
		}

		System.out.println("** 정상종료 !!! 안녕히 가세요 ~~ **");
	} //main

} //class
