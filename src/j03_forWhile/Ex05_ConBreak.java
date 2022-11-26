package j03_forWhile;

// 면접시 많이 물어보는 질문중 한개. continue break

//** Continue 
//=> Continue 문 이하의 구문을 실행하지 않고 다음 반복문 진행

//** Break
//=> 반복문 탈출

//** Label
//=> continue, break 가 적용될 반복문을 지정할 수 있도록 해줌
//=> 위치를 표시함
//  반드시 ":" 표시,
// 반드시 반복문 바로 위에 위치함.
// -> Label 다음에 반복문외의 문장이 오면 break, continue 에서 인식안됨 오류

//** 과제
//=> 5층건물에 각 층마다 7개의 방이 있고 이것을 [층,호실] 출력하기 
//=> 4층 4호 는 창고이기 때문에 출력하지 않는다.
public class Ex05_ConBreak {

	public static void main(String[] args) {
		// 1) 모든 방 출력하기
		// => [1,1] [1,2] ..... [1,7]
		// => [2,1] [2,2] ..... [2,7]

		for(int i = 1; i <= 5; i++) {
			for ( int j=i; j <= 7; j++) {
				System.out.printf("[ %d, %d ] ", i, j);
			} //for_j
			System.out.println("");
		} //for_i
		System.out.println("");

		System.out.println("** Test 2 **");
		// 2) 4층 4호는 창고이기 때문에 출력하지 않는다.
		for(int i = 1; i <= 5; i++) {
			for ( int j = 1; j <= 7; j++) {
				if( i == 4 && j == 4) continue;
				System.out.printf("[ %d, %d ] ", i, j);
			} //for_j
			System.out.println("");
		} //for_i
		System.out.println("");

		System.out.println("** Test 3 **");
		// 3) 4층은 3호 까지만 있다.
		for(int i = 1; i <= 5; i++) {
			for ( int j = 1; j <= 7; j++) {
				if( i == 4 && j == 4) break;
				System.out.printf("[ %d, %d ] ", i, j);
			} //for_j
			System.out.println("");
		} //for_i
		System.out.println("");
		
		// 4) Label 적용
		// => continue, break 를 원하는 반복문 에 적용
		// => 원하는 반복문 위에 Labeling, 사용   
		System.out.println("** Test Label _ continue **");
		banana: // Labeling -> 이후에 반드시 반복문이 있어야함.
		for(int i = 1; i <= 5; i++) {
			for ( int j = 1; j <= 7; j++) {
				if( i == 4 && j == 4) continue banana;
				System.out.printf("[ %d, %d ] ", i, j);
			} //for_j
			System.out.println("");
		} //for_i
		System.out.println("");

		System.out.println("** Test Label _ break **");
		banana: // 반드시 반복문 앞에만 쓸 수 있으며 반드시 라벨뒤에 : (콜론) 을 붙여야 한다.
		for(int i = 1; i <= 5; i++) {
			for ( int j = 1; j <= 7; j++) {
				if( i == 4 && j == 4) break banana;
				System.out.printf("[ %d, %d ] ", i, j);
			} //for_j
			System.out.println("");
			
		} //for_i
	}

}
