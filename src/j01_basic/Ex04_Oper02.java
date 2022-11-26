package j01_basic;

//** bit 연산
//=> 쉬프트 연산 , 논리 연산

public class Ex04_Oper02 {

	public static void main(String[] args) {
		int x = 10;	//	1010
		int y = 3;	//	0011
		// 1) 쉬프트 연산 : >> , <<
		System.out.println("** x >> y => "+(x>>y)); // 암호화 할때 많이 쓰임.
		// x를 >>(우측) 으로 y 만큼 이동 : 1010 -> 0101 -> 0010 -> 0001 => 1
		// => (x>>y) 연산 결과를 출력할 뿐 x, y 값이 변하진 않음.
		System.out.println("** x => " +x);
		System.out.println("** y => " +y);
		System.out.println("** x >> y => "+(x>>1)); // 5
		
		System.out.println("** x << y => "+(x<<y));
		// x를 <<(좌측) 으로 y 만큼 이동 : 1010 -> 1 0100 -> 10 1000 -> 101 0000 => 80
		System.out.println("** x << y => "+(x<<1)); // x 가 좌측으로 1회 이동 : 1 0100 => 20
		
		// 2) 논리연산
		// => AND & , OR | , XOR ^ (비교대상이 같으면 0 다르면 1)
		System.out.println("** x & y => "+(x & y)); // x = 1010
		//											// y = 0011
		//											// & = 0010 => 2
		
		System.out.println("** x | y => "+(x | y)); // x = 1010
		//											// y = 0011
		// 											// | = 1011 => 11
		
		System.out.println("** x ^ y => "+(x ^ y));	// x = 1010
		//											// y = 0011
		//											// ^ = 1001 => 9
		
		
	} //main

} //class
