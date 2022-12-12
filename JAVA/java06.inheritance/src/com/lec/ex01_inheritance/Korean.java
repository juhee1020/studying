package com.lec.ex01_inheritance;

public class Korean extends Adam{

	@Override
	public String toString() {
		return "아임파인땡큐엔유? 암 코리안";
	}
	
	@Override
	public void move() {
		System.out.println("고투 메이플월드");
	}
	
	@Override
	public void speak() {
		System.out.println("스피크 멀쟘ㄷ러재ㅑ덜");
	}
}