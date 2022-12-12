package com.robot.v4_interface;
public class StandardRobot extends Robot{

	public StandardRobot(String name, int qty) {super(name, qty);}

	@Override
	public void actionFly() {}

	@Override
	public void actionMissile() {}

	@Override
	public void actionSword() {}
}