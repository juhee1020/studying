package com.robot.v3_abstract;
public class RobotMain {
	public static void main(String[] args) {
		System.out.println("======Robot V3.0 (추상~)=====\n");
		CheapRobot cheap=new CheapRobot("Cheap",3);
		cheap.actionFly();
		System.out.println(cheap.name);
		StandardRobot standard=new StandardRobot("Standard",10);
		System.out.println(standard.qty);
	}
}

// 버전4. 인터페이스 쓰자! 이제부터 어려워여...