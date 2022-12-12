package com.robot.v3_abstract;
class SuperRobot extends Robot{
	public SuperRobot(String name, int qty) {super(name, qty);}
	@Override
	public void actionFly() {System.out.println("비싼건날아");}
	@Override
	public void actionMissile() {System.out.println("미사일기능있음");}
	@Override
	public void actionSword() {System.out.println("레인보우광선검");}
}