package com.robot.v9_poly;
import com.robot.impl.*;

public class RobotMain {
	public static void main(String[] args) {
		System.out.println("=== Robot V9.0 (다형성) ===\n");
		
		Robot rr=null;
		
		rr=new Robot("Super", 3/*, new FlyNo(), new MissileYes(), new SwordWood()*/);
		rr.makeRobot(new FlyYes(), new MissileYes(), new SwordUltraJJang()); 
		System.out.println("\n"+rr.toString());
	}
}