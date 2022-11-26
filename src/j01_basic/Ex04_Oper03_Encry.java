package j01_basic;


//** XOR 연산자를 사용한 암호화(Encryption) / 복호화(decryption) 예제
//=> XOR : 같으면 0

public class Ex04_Oper03_Encry {

	public static void main(String[] args) {
		int p = 1234567, t = 0;
		int e = 0x1A253B65; 		// 16진수
		System.out.println("** 암호화 전 password => "+p);
		
		// ** 암호화(Encryption)
		t = p^e;
		System.out.println("** 암호화 후 password => "+t);
		
		// ** 복호화(decryption)
		t = t^e;
		System.out.println("** 복호화 된 password => "+t);
		
	} //main

} //class
