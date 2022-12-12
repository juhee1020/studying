package com.robot.v8_final;
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

	//개별기능
	public void actionFly() {fly.fly();}
	public void actionMissile() {missile.missile();}
	public void actionSword() {sword.sword();}
	
	// 공통기능.
	public void shape() {System.out.println(this.name+"로봇입니다. 팔다리머리몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걷기기능있음");}
	public void actionRun() {System.out.println("달리기기능있음");}

	//생산공장
	public void makeRobot() {
		//System.out.println(name+"robot의 생산수량 : "+qty);//투스트링 오버라이드한거에 넣어서 뺏음
		shape();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
		}

	@Override
	public String toString() {
		return this.name + "Robot의 생산수량 = " + this.qty;
	}
}