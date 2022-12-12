package com.lec.ex03_class;

public class Human {
	// 1. 속성
	String name;
	// 2. 생성자
	public Human() {}
	public Human(String name) {
		this.name=name;
	}
	// 3. 메서드 - 메소드 오버로딩(overloading)
	void speak() {
		System.out.println("말합니다.");
	}
	
	void speak(String lang) {
		System.out.println(lang+"로 말합니다.");
	}
	void speak(String lang, int age) {
		System.out.println(lang+"로 말하고 나이는 "+age+"입니다.");
	}
	String speak(int age, String lang) {
		String msg= lang+"로 말합니다. 나이는 "+age;
		return msg;
	}
}
