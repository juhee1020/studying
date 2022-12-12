package com.lec.ex02_arithmetic;

public class StringConcatMain {

	public static void main(String[] args) {
		/*
		문자열 연결 연산자(+)
			+연산자는 산술연산자, 부호연산자인 동시에 문자열연결연산자이다.
			문자열과 다른 연산자의 + 연산결과는 String이다.
		*/
		String str1="JDK"+1.8;
		System.out.println("str1 : "+str1); // str1 : JDK1.8
		
		String str2="JDK"+"의 특징";
		System.out.println("str2 : "+str2); // str2 : JDK의 특징
		
		String str3="JDK"+3+3.0;
		System.out.println("str3 : "+str3); // str3 : JDK33.0
		
		String str4=3+3.0+"JDK";
		System.out.println("str4 : "+str4); // str4 : 6.0JDK
	}
}
