package com.lec.exercise;
public class ClassMain07 {
	/* contains 메서드 작성 */
	static boolean contains(String src, String target){
		int result= src.indexOf(target);
		if(result>=0) {return true;}
		else return false;
	}
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}
}