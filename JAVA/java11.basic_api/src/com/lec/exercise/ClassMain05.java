package com.lec.exercise;
public class ClassMain05 {
	public static int count(String src, String target) {
		int count=0; int pos=0; // 찾는횟수 / 찾기시작할위치
		// 코드작성
		for(int i=0; i<src.length(); i++) {
			pos=src.indexOf("AB");
		}
		// 보류.. 포문 어케 돌려야하는지 감이 아농ㄴ다.
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
}
