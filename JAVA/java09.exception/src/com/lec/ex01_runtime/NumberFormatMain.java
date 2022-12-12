package com.lec.ex01_runtime;
/*
	NumberFormatException

	프로그램에서 문자열로 되어 있는 숫자형데이터를 숫자로 변환하는 경우가 자주 발생한다.
	문자열을 숫자로 변환할 때 해당 문자열이 숫자로 구성된 문자열이 아닐 경우
	즉, 숫자로 변환할 수 없는 문자열일 경우에 발생되는 예외.

	문자열을 숫자로 변환하는 방법 (Wrapper Class)

	변환타입 	메스드(매개변수)
	-------------------------------------------
	int			Integer.parseInt(String str);
	double		Double.parseDouble(String str);

*/
public class NumberFormatMain {
	public static void main(String[] args) {
		String data1="100";
		String data2="3.14";
		
		System.out.println(data1+data2); //1003.14 // data1과2를 이어씀.
		// 진짜 더하기를 하고 싶다면! ▼
		int data1_=Integer.parseInt(data1);
		double data2_=Double.parseDouble(data2);
		System.out.println(data1_+data2_); // 103.14 // 잘 더하기가 된 모습!


		// 예외
		String data3="10a";
		int data3_=Integer.parseInt(data3);
		/*
		Exception in thread "main" java.lang.NumberFormatException: For input string: "10a"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:668)
			at java.base/java.lang.Integer.parseInt(Integer.java:786)
			at com.lec.ex01_runtime.NumberFormatMain.main(NumberFormatMain.java:31)
		*/
	}
}