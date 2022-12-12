package com.lec.exercise;
public class ClassMain09 {
	// delChar 메서드 작성
	static String delChar(String src, String delCh) {
		String[] abc=new String[delCh.length()];
		String ab="";
		for(int i=0; i<abc.length; i++) {
			abc[i]="\\"+delCh.substring(i,i+1);
			src=src.replaceAll(abc[i], "");
		}
		return src;
	} // 끝
	public static void main(String[] args) {

		System.out.println("(1!2@3^4~5"+"->"
					+delChar("(1!2@3^4~5","~!@#$%^&*()"));
		System.out.println("(1!2@3^4~5"+"->"
				+delChar("(1 2     3   4 \t5)"," \t"));
	}
}