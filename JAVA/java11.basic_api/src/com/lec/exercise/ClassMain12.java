package com.lec.exercise;
public class ClassMain12 {
	// getRand메서드 작성
	static int getRand(int from, int to) {
		int a=Math.max(from, to);
		int b=Math.min(from, to);
		int cc=(int)Math.random()*(a-b+1);
		return cc;
	}
	public static void main(String[] args) {
		
		for(int i=0; i<20; i++) {
			System.out.print(getRand(1,-3)+",");
		}
	}
}