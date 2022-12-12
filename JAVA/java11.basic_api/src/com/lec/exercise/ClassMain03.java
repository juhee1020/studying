package com.lec.exercise;

import java.util.StringTokenizer;

public class ClassMain03 {
	public static void main(String[] args) {
		String fullPath="C:\\jdk1.8\\work\\PathSeparateTest.java";
		String path="";
		String fileName="";	
		// 코드작성
		StringTokenizer abc=new StringTokenizer(fullPath,"\\");
		int count=abc.countTokens();
		for(int i=0; i<count-1; i++) {
			if(i!=count-2) {
			path=path+abc.nextToken()+"\\";}
			else path=path+abc.nextToken();
		}
		abc=new StringTokenizer(fullPath,"\\");
		for(int i=0; i<count; i++) {
			fileName=abc.nextToken();
		} // 코드 끝
		System.out.println("fullPath : "+fullPath);
		System.out.println("path : "+path);
		System.out.println("fileName : "+fileName);
	}
}