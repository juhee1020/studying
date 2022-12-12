package com.lec.ex01_interface;

public class Bird implements Animal{
	@Override
	public void sound() {System.out.println("잭... 짹!");}

	@Override
	public void move() {}

}
