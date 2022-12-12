package com.lec.exercise;
public class ClassMain10 {
	// format 메서드 작성
	static String format(String str, int length, int alignment) {
		return "";
	}// 끝
	public static void main(String[] args) {
		String str="가나다";
		System.out.println(format(str,7,0)); // 왼쪽정렬
		System.out.println(format(str,7,1)); // 가운데정렬
		System.out.println(format(str,7,2)); // 오른쪽정렬
	}
}