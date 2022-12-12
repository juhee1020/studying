package com.lec.ex01_interface;

public class Dog implements Animal{
// Dog에 빨간줄 > 오버라이드해서 구현해줘야함.
	@Override
	public void sound() {System.out.println("크르르릉...");}
	// 부모모다 접근제한을 더 강하게 줄 수 없어서 퍼블릭으로 해야한다.

	@Override
	public void move() {System.out.println("멍멍하고 움직임");}

}
