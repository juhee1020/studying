package com.lec.exercise;
public class ClassMain08 {
	// round 메서드 작성
	static double round(double d, int n) {
		double result=1f;
		double abc = 0;
		for(int i=1; i<=n; i++) {
			result=result*10f;
			abc=Math.round(d*result)/result;
		}
		return abc;
	}// round메서드

	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}