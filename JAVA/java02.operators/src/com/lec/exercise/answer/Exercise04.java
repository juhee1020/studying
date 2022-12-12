package com.lec.exercise.answer;
public class Exercise04 {
	public static void main(String[] args) {
		int pencils=534;
		int students=30;
		
		// 학생 한명이 가지는 연필수
		int pencilPerStudents=pencils/students;
		System.out.println(pencilPerStudents);
		// 남은 연필수
		int pencilsLeft=(pencils%students);
		System.out.println(pencilsLeft);
	}
}