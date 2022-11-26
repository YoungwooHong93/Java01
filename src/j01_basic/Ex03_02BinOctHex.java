package j01_basic;

//** 2진수(Binary number), 8진수 , 16진수 표기
//=> 2진수 : 0b 로시작 -> 0b1111
//=> 8진수 : 0  Octal Number
//=> 16진수: 0x Hexadecimal Number

public class Ex03_02BinOctHex {

	public static void main(String[] args) {
		int bin = 0b1111; // 오른쪽부터 2의0승,1승,2승... 1+2+4+8 = 15
		int oct = 017; // 8+7 = 15
		int hex = 0xf; // 15 => 9, 10=A , 11=B, 12=C, 13=D, 14=E, 15=F, 16 -> 10
		System.out.println("** Binary => " + bin);
		System.out.println("** Octal => " + oct);
		System.out.println("** Hexadecimal => " + hex);
		System.out.println("");

		// => Integer 를 2, 8, 16 진법으로 출력하기
		System.out.println("** Binary => " + Integer.toBinaryString(bin)); 			// 1111
		System.out.println("** Octal => " + Integer.toOctalString(oct)); 			// 17
		System.out.println("** Hexadecimal => " + Integer.toHexString(hex));		// f
		System.out.println("");

		// => int to String
		// 문자열에 연결되면 문자로 취급
		System.out.println("** int to String1 => " + bin + oct + hex);		 		// 15 15 15
		System.out.println("** int to String2 => " + (bin + oct + hex)); 			// 45
		System.out.println("");

		// => String to int
		String s = "12345";
		System.out.println("** String to int1 => " + (s + 100)); 					// 12345100
		System.out.println("** String to int2 => " + (Integer.parseInt(s) + 100)); 	// 12445

		s = "가나다라";
		// System.out.println("** String to int3 => " +(Integer.parseInt(s)+100));
		// => java.lang.NumberFormatException.forInputString: "가나다라"

		// => String to double
		s = "123.4567";
		System.out.println("** String to double1 => " + (Double.parseDouble(s) + 100));	// 223.4567
		s = "abcd.4567";
		// System.out.println("** String to double2 => " + (Double.parseDouble(s) + 100));
		// => java.lang.NumberFormatException.forInputString: "abcd.4567"

	} // main

} // class
