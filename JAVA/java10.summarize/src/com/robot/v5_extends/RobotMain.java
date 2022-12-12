package com.robot.v5_extends;
import com.robot.impl.*;
import com.robot.inter.*;
public class RobotMain {
	public static void main(String[] args) {
		System.out.println("=====Robot V5.0 인터페이스, 상속=====\n");
		
		Robot robot=null;
		
		robot=new CheapRobot("Cheap",6);
		robot.setFly(new FlyNo());
		robot.actionFly();
	}
}