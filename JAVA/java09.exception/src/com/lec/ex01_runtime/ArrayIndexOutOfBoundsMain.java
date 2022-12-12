package com.lec.ex01_runtime;
public class ArrayIndexOutOfBoundsMain {
	public static void main(String[] args) {
		// args 배열에 값 넣지 않음
		// String data1=args[0];
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		at com.lec.ex01_runtime.ArrayIndexOutOfBoundsMain.main(ArrayIndexOutOfBoundsMain.java:5)
		 */


		// Run > Coverage Configurations > Arguments > Program Arguments에 1 2 3 4 5 적고 시스아웃 args.length
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+",");}
		System.out.println();
		System.out.println(args[10]); // 10번째 인덱스엔 값이 없음 아래 예외 뜸 ▼
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
		at com.lec.ex01_runtime.ArrayIndexOutOfBoundsMain.main(ArrayIndexOutOfBoundsMain.java:13)
		*/
	}
}