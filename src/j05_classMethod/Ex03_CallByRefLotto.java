package j05_classMethod;

import java.util.Arrays;

//** CallByReference (매개변수 참조자료형, 주소전달) 
//=> 배열

//** 과제 
//=> Ex04_Lotto02.java 의 Sort 부분을 메서드로 만들기
//=> 메서드명 : mySort
//    -> 매개변수 (배열, char_Asccending/Descending)
//    -> 전달된 배열을 오름차순 또는 내림차순으로 정렬   

public class Ex03_CallByRefLotto {
						// int[] arr 매개변수는 전달된 배열의 주소값을 받는거임.
	public void mySort(int[] arr, char c) {
	/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				// ** 오름차순인 경우
				if (c == 'A') {
					if (arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				};
				
				// ** 내림차순인 경우
				if (c == 'D') {
					if (arr[i] < arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				};
			} //for_j
		} //for_i
	*/
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				// ** 오름차순, 내림차순 한번에
				// (c == .... && .... arr[j]) 는 ()로 안묶어도 되나(&& 연산자가 먼저 이므로),
				// 가독성을 위해서 묶어주는게 좋음.
				if ( (c == 'A' && arr[i] > arr[j]) || 
						(c == 'D' && arr[i] < arr[j]) ) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					}
				
			} //for_j
		} //for_i
	} //mySort


	public static void main(String[] args) {
		// 1) 매개변수로 사용할 배열 생성
		int[] lotto = {7, 22, 44, 3, 25, 10};
		System.out.println("** 정렬 전 => " + Arrays.toString(lotto));
		
		Ex03_CallByRefLotto ex03 = new Ex03_CallByRefLotto();	// new 뒤에는 생성자가 온다. 
		// 2) 오름차순으로 정렬
		ex03.mySort(lotto, 'A');
		System.out.println("** 오름차순 정렬 => " +Arrays.toString(lotto));
		
		// 3) 내림차순으로 정렬
		ex03.mySort(lotto, 'D');
		System.out.println("** 내림차순 정렬 => " +Arrays.toString(lotto));
		
		//System.out.println("** 정렬 후 => " + Arrays.toString(lotto));
	} //main

} //class
