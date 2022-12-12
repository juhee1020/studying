package com.lec.ex05_class;

public class Human {
	String nation="하늘";
	String name;
	String gender;
	String lang;
	int age;
	
	void speak() {
		System.out.println("말합니다!");
	}
	void speak(String lang) {
		this.lang=lang;
		System.out.println(lang+"말합니다!");
	}
	void move() {
		System.out.println("사냥한다!");
	}
}
