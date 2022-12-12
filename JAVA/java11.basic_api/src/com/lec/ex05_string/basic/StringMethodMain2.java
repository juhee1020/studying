package com.lec.ex05_string.basic;

import java.io.UnsupportedEncodingException;

public class StringMethodMain2 {

	public static void main(String[] args) {


	// charAt()
		String ssn="221130-4123456";
		char gender=ssn.charAt(7);
		System.out.println(gender=='3'?"남자":"여자");
		System.out.println();



	// getBytes()
		//1) getBytes()
		String str1="웰치제로포도"; // uft-8 한글=3bytes, euc-kr 한글=2bytes
		byte[] byte1=str1.getBytes();
		System.out.println(byte1.length+"bytes"); // 18bytes
		System.out.println(byte1); // toString()
		String str2=new String(byte1);
		System.out.println("byte array(utf-8) - > string으로 변환 : "+str2);

		//2) getBytes(문자셋)
		try {
			byte[] byte2=str1.getBytes("EUC-KR");
			System.out.println(byte2.length+"bytes");
			String str3=new String(byte2);
			System.out.println("byte array(euc-kr) - > string으로 변환 : "+ str3);
			
			byte[] byte3=str1.getBytes("utf-8");
			System.out.println(byte2.length+"bytes");
			String str4=new String(byte3);
			System.out.println("byte array(utf-8) - > string으로 변환 : "+ str4);

			}catch(UnsupportedEncodingException e) {e.printStackTrace();}



	// indexOf()
		/* 매개값으로 주어진 문자열이 시작되는 위치(인덱스)를 정수로 리턴하는 메서드.
		만약, 주어진 문자열을 찾지 못했을 경우 -1 리턴 */
		String 제목="2022.12.01일 현재 코로나 환산세 심각";
		int loc=제목.indexOf("제로콜라");
		System.out.println(loc); // -1
		
		//if(제목.indexOf("제로콜라")>=0) {
		if(loc>=0) {
			System.out.println("제로콜라 기사 검색 성공적");
		}else {
			System.out.println("제로콜라 기사 검색 실패");
		}
	}
}