package com.lec.exercise;
public class ClassMain04 {
	static void printGraph(int[] dataArr, char ch) {
		// 코드
		for(int i=0; i<dataArr.length; i++) {
			for(int j=0; j<dataArr[i]; j++) {
				System.out.print("*");
			}
			System.out.println(dataArr[i]);
		} // 코드 끝
	}
	public static void main(String[] args) {
		printGraph(new int[] {3,7,1,4},'*');
	}
}