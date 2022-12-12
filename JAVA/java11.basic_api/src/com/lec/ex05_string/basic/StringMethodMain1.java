package com.lec.ex05_string.basic;
public class StringMethodMain1 {
	public static void main(String[] args) {


	// replace
		String oldstr="100살먹은 샤프심";
		String newstr=oldstr.replace("100살","50살"); // 100살 자리에 50살 들어간다.
		System.out.println(oldstr);System.out.println(newstr);
		System.out.println(oldstr.hashCode()+" / "+newstr.hashCode()); //해시코드 둘이 달라.
		System.out.println(oldstr.toString()+" / "+newstr.toString());
		oldstr=oldstr.replace("100살", "500살");
		System.out.println(oldstr.hashCode()+"\n");



	// substring
		/*
		1) substring(int from, int to) : from~to-1까지의 문자를 추출
		2) substring(int from) : from-문자열끝까지의 문자를 추출 */
		String ssn="901231-1234567";
		String birthday=ssn.substring(0,6);
		String sno=ssn.substring(7);
		String gender=ssn.substring(7, 8);
		System.out.println("생년월일 : "+birthday);
		System.out.println("주민번호 : "+sno);
		System.out.println(gender.equals("1")?"남자":"여자");
		System.out.println();



	// toLowerCase, toUpperCase
		String str1="java programing";
		String str2="JAVA PROGRAMING";
		System.out.println(str1+" / "+str2);
		System.out.println(str1.toUpperCase()+" / "+str2.toLowerCase());

		// 대소문자의 동등비교
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)+"\n"); // true



	// trim : 앞뒤의 공백을 제거
		String tel1="      02";
		String tel2="1234     ";
		String tel3="031    8888";

		System.out.println(tel1);System.out.println(tel1.trim());
		System.out.println(tel2);System.out.println(tel2.trim());
		System.out.println(tel3);System.out.println(tel3.trim()+"\n"); // 중간여백은 제거x



	// valueOf : int, double 등의 기본타입을 문자열로 변환하는 메서드
		String val1=String.valueOf(false);
		String val2=String.valueOf(30);
		String val3=String.valueOf(3.14);
		System.out.println(val1+val2+val3); // false303.14

	}
}