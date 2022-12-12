package com.robot.v5_extends;
import com.robot.inter.*;
public class Robot {
	
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	
	public String name;
	public int qty;
	
	//public Robot() {}
	public Robot(String name, int qty) {
		this.name=name;
		this.qty=qty;
	}
	
	public void setFly(InterFly fly) {
		this.fly = fly;
	}
	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}

	public void setSword(InterSword sword) {
		this.sword = sword;
	}

	public void shape() {System.out.println(this.name+"로봇입니다. 팔다리머리몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걷기기능있음");}
	public void actionRun() {System.out.println("달리기기능있음");}

	public void actionFly() {fly.fly();}
	public void actionMissile() {missile.missile();}
	public void actionSword() {sword.sword();}
}