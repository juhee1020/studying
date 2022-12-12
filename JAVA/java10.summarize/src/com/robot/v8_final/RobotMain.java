package com.robot.v8_final;
import com.robot.impl.*;

public class RobotMain {
	public static void main(String[] args) {
		System.out.println("=== Robot V8.0 (파이널) ===\n");
		
		Robot rr=null;
		
		rr=new Robot("Cheap", 5, new FlyNo(), new MissileNo(), new SwordNo());
		rr.makeRobot(); 
		System.out.println("\n"+rr.toString());
	}
}