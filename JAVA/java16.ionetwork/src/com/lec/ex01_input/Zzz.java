package com.lec.ex01_input;

public class Zzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = new char[]{'h','i','!','t','h','e','r','e'};
		byte[] byteArrray = new byte[] {100,50,66,101,35,120};
		String ddd="";
		ddd=new String(charArray,0,3);
		System.out.println(ddd);
		ddd=new String(byteArrray,2,3);
		System.out.println(ddd);
	}
}