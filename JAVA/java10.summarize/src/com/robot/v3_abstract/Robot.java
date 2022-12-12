package com.robot.v3_abstract;

public abstract class Robot {
	public int qty;
	public String name;

	public Robot(String name, int qty) {
		this.name = name; this.qty = qty;
	}
	public void shape() {System.out.println(this.name+"로봇입니다. 팔다리머리몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걷기기능있음");}
	public void actionRun() {System.out.println("달리기기능있음");}
	
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();
}