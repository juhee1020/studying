package com.lec.ex01_inheritance;

public class Adam extends Human{
	@Override
	public String toString() {
		return "Adam [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	@Override
	public void move() {
		System.out.println("부산으로 떠납니다.");
	}
}
