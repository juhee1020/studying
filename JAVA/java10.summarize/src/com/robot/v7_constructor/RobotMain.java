package com.robot.v7_constructor;
import com.robot.impl.*;

public class RobotMain {
	public static void main(String[] args) {
		System.out.println("=====Robot V7.0 공통메서드=====\n");
		Robot rr=new CheapRobot("Cheap", 5, new FlyNo(), new MissileNo(), new SwordNo());
		rr.makeRobot();
		System.out.println(rr.toString());
	}
}