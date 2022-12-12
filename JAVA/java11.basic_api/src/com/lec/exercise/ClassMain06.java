package com.lec.exercise;
public class ClassMain06 {
	public static String fillZero(String src, int length) {
		if(src.length()>length && length>0) {
			//src의 길이가 lengtt의 값보다 크면 src를 length만큼 잘라서 반환
			return src.substring(0,length);
		}
		else if(src.length()==length || src=="") {
			//src가 널이거나 src.length()와 length가 같으면 src 반환
			return src;
		}
		else if(length>src.length()) {
			// length가 더 길면 왼쪽에 0채우기
			String a="";
			for(int i=0; i<length-src.length(); i++) {
				a=a+"0";
			}
			return a+src;
			// 문제보면 char배열 생성하라는데 문제 대충읽고 풀어서 안함..
		}
		else if(length<=0) {return "";}
		return "^^";
	}
	public static void main(String[] args) {
		String src="12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}