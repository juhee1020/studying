package com.lec.ex01_if;
public class IfMain {
	public static void main(String[] args) {
		int score=80;
		// 1. 단순if
		if(score>=90) {System.out.println("점수가 90점보다 크거나 같다."); System.out.println("A학점");}
		System.out.println("-----------------------");

		// 2. if~else
		if(score>=90) {System.out.println("점수가 90점보다 크거나 같다."); System.out.println("A학점");}
		else {System.out.println("점수가 90점보다 작습니다."); System.out.println("B학점");}
		System.out.println("-----------------------");

		// 3. if~else if~else
		int score3=74;
		if(score3>=90) {System.out.println("점수가 90점보다 크거나 같다."); System.out.println("A학점");}
		else if(score3>=80) {System.out.println("점수가 80점보다 크거나 같다."); System.out.println("B학점");}
		else if(score3>=70) {System.out.println("점수가 70점보다 크거나 같다."); System.out.println("C학점");}
		else if(score3>=60) {System.out.println("점수가 60점보다 크거나 같다."); System.out.println("D학점");}
		else {System.out.println("점수가 60점 미만. F학점입니다.");}
		System.out.println("-----------------------");

	}
}