package j99_test;

// ** 정석 연습문제 3_4
// 아래의 코드는 사과를 담는데 필요한 바구니 버켓의 수를 구하는 코드이다.
// 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
// 13개의 바구니가 필요할 것이다. (1) 에 알맞은 코드를 넣으시오.

public class Ex02_jung3_4 {

	public static void main(String[] args) {
		int numOfApples = 126;		// 사과의 개수
		int sizeOfBucket = 10;		// 바구니에 담을수 있는 크기
		int numOfBucket = numOfApples/sizeOfBucket + 
						( numOfApples/sizeOfBucket > 0 ? 1 : 0) ;
		
		System.out.println(" 필요한 바구니의 수: "+numOfBucket);

	} //main
	
} //class
