package com.robot.v9_poly;
import com.robot.inter.*;

public class Robot {

	public InterFly fly;
	public InterMissile missile;
	public InterSword sword;
	public String name;
	public int qty;
	
	public Robot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		this.name=name;
		this.qty=qty;
		this.fly=fly;
		this.missile=missile;
		this.sword=sword;
	}
	
	// 생성자 : 다형성.
	public Robot() {}
	public Robot(String name, int qty) {
		this.name=name; this.qty=qty;
	}

	//개별기능
	public void actionFly(InterFly fly) {fly.fly();}
	public void actionMissile(InterMissile missile) {missile.missile();}
	public void actionSword(InterSword sword) {sword.sword();}
	
	public void actionFly() {fly.fly();}
	public void actionMissile() {missile.missile();}
	public void actionSword() {sword.sword();}
	
	// 공통기능.
	public void shape() {System.out.println(this.name+"로봇입니다. 팔다리머리몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걷기기능있음");}
	public void actionRun() {System.out.println("달리기기능있음");}

	//생산공장 - 메서드 : 다형성
	public void makeRobot() {
		shape();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
		}
	
	public void makeRobot(InterFly fly, InterMissile missile, InterSword sword) {
		shape();
		actionWalk();
		actionRun();
		actionFly(fly);
		actionMissile(missile);
		actionSword(sword);
	}

	@Override
	public String toString() {
		return this.name + "Robot의 생산수량 = " + this.qty;
	}
}