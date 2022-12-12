package com.lec.ex01_inheritance;
public class Human {
	String name;
	String gender;
	int age;
	
	public void speak() {System.out.println("한국말을 한다.");}
	public void eat() {System.out.println("콰트로치즈와퍼를 먹는다.");}
	public void move() {System.out.println("신논현역으로 간다.");}


	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}