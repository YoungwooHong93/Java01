package j03_forWhile;

public class Ex03_InfinityLoop {

	public static void main(String[] args) {
		// 1) for
		int count = 0;
		System.out.println("** 무한 Loop test => for **");
		for ( ; ; ) {	// 무조건 true 이면 무한 Loop
			count++;
			System.out.println("** count => "+count);
			if (count > 100) break;
		}
		
		// 2) while
		System.out.println("** 무한 Loop test => while **");

		count = 0;
		while(true) {
			count++;
			System.out.println("** count => "+count);
			if (count > 100) break;
		}
		
		
		// 3) do_while
		System.out.println("** 무한 Loop test => do_while **");
		count = 0;
		do {
			count++;
			System.out.println("** count => "+count);
			if (count > 100) break;

		} while(true);

	} //main

} //class
