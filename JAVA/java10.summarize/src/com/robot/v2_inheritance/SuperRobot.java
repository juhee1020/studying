package com.robot.v2_inheritance;

public class SuperRobot extends Robot{
	public SuperRobot(String name, int qty) {
		super(name, qty); // 부모생성자 호출.
	}
	public void actionFly() {System.out.println("아이캔플라이");}
	public void actionMissile() {System.out.println("미사일있음");}
	public void actionSword() {System.out.println("광선검");}
}
