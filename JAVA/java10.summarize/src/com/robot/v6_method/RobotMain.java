package com.robot.v6_method;
import com.robot.impl.*;
import com.robot.inter.*;
public class RobotMain {
	public static void main(String[] args) {
		System.out.println("=====Robot V6.0 공통메서드=====\n");
		
		Robot robot=null;
		
		robot=new CheapRobot("Cheap",6);
		robot.setFly(new FlyNo());
		robot.actionFly();
		System.out.println();
		makeRobot(robot, new FlyNo(), new MissileYes(),new SwordUltraJJang());
	}
	public static void makeRobot(Robot robot, InterFly fly, InterMissile missile, InterSword sword) {
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(fly);
		robot.setMissile(missile);
		robot.setSword(sword);
		robot.actionFly();
		robot.actionMissile();
		robot.actionSword();
		System.out.println(robot.name+"의 재고 : "+robot.qty);
	}
	
	// 메이크로봇을 Robot의 생성자로 리팩토링
	// 칩, 스텐다드, 슈퍼 없애고 로봇 클래스 한개만 작성
	// 다형성 - 세터없이 액션메서드만 가지고 작성
}