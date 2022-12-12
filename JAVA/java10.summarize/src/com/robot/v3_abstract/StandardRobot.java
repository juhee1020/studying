package com.robot.v3_abstract;
class StandardRobot extends Robot{
	public StandardRobot(String name, int qty) {super(name, qty);}
	@Override
	public void actionFly() {System.out.println("평균도못날아");}
	@Override
	public void actionMissile() {System.out.println("미사일기능있음");}
	@Override
	public void actionSword() {System.out.println("목검");}
}