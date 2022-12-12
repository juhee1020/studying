package com.lec.ex01_inheritance;
public class Phone {
	//1. 필드
	String model;
	String color;
	
	//2. 생성자  // (일단 기본생성자 없음.)
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	//3. 매서드
	void powerOn() {}
	void powerOff() {}
}