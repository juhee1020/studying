package com.robot.v1_basic;
public class CheapRobot {
	public int qty; // 수량?
	public CheapRobot(int qty) {this.qty=qty;}
	
	public void shape() {System.out.println("칩로봇입니다. 팔다리머리몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걷기기능있음");}//걷는기능
	public void actionRun() {System.out.println("달리기기능있음");}//달리는기능
	public void actionFly() {System.out.println("나는기능없음");}//나는기능
	public void actionMissile() {System.out.println("미사일없음");}//미사일쏘는기능
	public void actionSword() {System.out.println("검 없음");}//검 기능
	
}