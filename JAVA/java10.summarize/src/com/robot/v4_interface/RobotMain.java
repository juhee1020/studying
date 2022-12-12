package com.robot.v4_interface;
import com.robot.impl.*;

public class RobotMain {
	public static void main(String[] args) {
		System.out.println("=====로봇 V4.0 (인터페이스)=====");
		CheapRobot c=new CheapRobot("Cheap",5);
		//c.shape(); 
		c.setFly(new FlyNo());
		c.setMissile(new MissileNo());
		c.setSword(new SwordNo());
		
		//c.actionFly(); c.actionMissile(); c.actionSword();
		
		SuperRobot susu=new SuperRobot("슈퍼",3);
		susu.setSword(new SwordUltraJJang());
		susu.actionSword();
	}
}

// 추상클래스 사용안하고 상속받아서 사용? > 버전 5