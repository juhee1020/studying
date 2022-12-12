package com.lec.ex01_inheritance;

public class American extends Eve{
	@Override
	public String toString() {
		return "아메리카노만 마시는 어메리칸~ 나는 "+this.name+"~";
	}
	@Override
	public void move() {
		System.out.println("시카고로 떠납니다.");
	}
	@Override
	public void speak() {
		System.out.println("베리나이스잉글리시");
	}
}
