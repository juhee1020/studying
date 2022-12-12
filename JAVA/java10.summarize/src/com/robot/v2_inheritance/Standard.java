package com.robot.v2_inheritance;

public class Standard extends Robot{
	public Standard(String name, int qty) {
		super(name, qty); // 부모생성자 호출.
	}
	public void actionFly() {System.out.println("나는기능없음");}
	public void actionMissile() {System.out.println("미사일 있음");}
	public void actionSword() {System.out.println("목검 있음");}
}
