package j01_basic;

public class Ex05_Print02 {

	public static void main(String[] args) {

		float f1 = .10f;   // 0.10, 1.0e-1 => 1*10의 -1승 => 1*1/10
		float f2 = 1e1f;   // 1*10의 1승 => 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f; // 3.14*10의 3승 => 3140
		double d = 1.23456789;

		// 실수표현 : %f(일반적), %e(지수형식), %g(간단형)
		System.out.printf("f1=%f, %e, %g \n",f1,f1,f1);
		System.out.printf("f2=%f, %e, %g \n",f2,f2,f2);
		System.out.printf("f3=%f, %e, %g \n",f3,f3,f3);

		System.out.printf("d=%f, %e, %g \n",d,d,d);
		// %f : 소수점 6자리까지만 -> d=1.234568
		System.out.printf("d=%15.10f  \n",d);
		// %15.10f : 지정된 자리수 만큼 출력 -> d = 1.2345678900

		String url = "www.greencomputer.com";
		System.out.printf("[%.8s] %n", url);  // 왼쪽에서 8글자만 출력

	} //main 

} //class