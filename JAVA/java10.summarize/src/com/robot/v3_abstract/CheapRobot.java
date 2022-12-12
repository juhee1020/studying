package com.robot.v3_abstract;
class CheapRobot extends Robot{
	public CheapRobot(String name, int qty) {super(name, qty);}
	@Override
	public void actionFly() {System.out.println("싼건못날아");}
	@Override
	public void actionMissile() {System.out.println("미사일기능없음");}
	@Override
	public void actionSword() {System.out.println("근데 미사일은 있는데 검은 없는게 좀... 오히려 현대적인건가...");}
}