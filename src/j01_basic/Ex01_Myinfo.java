package j01_basic;

public class Ex01_Myinfo {

	public static void main(String[] args) {
		
		final String name = "홍영우";
		int age = 31;
		String job = "호텔리어";
		String major = "관광경영학과";
		double career = 2.5;
		String reason;
		reason = "비전이 밝아보여서";
		String dream;
		dream ="보안관련 회사";
				
		
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("전공분야 = "+major);
		System.out.println("전직업 = "+job);
		System.out.println("경력 = "+career +"년");
		System.out.println("수강이유 = "+reason);
		System.out.println("희망취업분야 = "+dream);
	} // main

} // class
