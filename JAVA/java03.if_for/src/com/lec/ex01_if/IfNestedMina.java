package com.lec.ex01_if;
public class IfNestedMina {
	public static void main(String[] args) {
		// 난수를 81~100 사이의 난수를 발생시키기
		System.out.println(Math.random()); // 0<=x<1 사이의 double타입의 숫자 한개를 리턴
		// 0.766230198546283*20 +81
		System.out.println((int)(Math.random()*20)+81);
		
		// 중첩if 
		int score = (int)(Math.random()*20) + 81;
		if(score>=90) {
			if(score>=95) {
				System.out.println("A+ 학점입니다!");
			} else {
				System.out.println("A0 학점입니다.");
			}
		} else {
			if(score>=80) {
				System.out.println("B+ 학점입니다!");
			} else {
				System.out.println("B0 학점입니다!");
			}
		}
	}
}