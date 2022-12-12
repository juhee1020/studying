package com.robot.v1_basic;
public class RobotMain {
	public static void main(String[] args) {
		System.out.println("======Robot V1.0 (기본)=====\n");
		CheapRobot c_robot=new CheapRobot(5);
		c_robot.shape(); c_robot.actionWalk(); c_robot.actionRun(); c_robot.actionFly(); c_robot.actionMissile(); c_robot.actionSword();
		System.out.println("CheapRobot의 재고수량 : "+c_robot.qty);
		System.out.println();
		
		StandardRobot st_robot=new StandardRobot(10);
		st_robot.shape(); st_robot.actionWalk(); st_robot.actionRun(); st_robot.actionFly(); st_robot.actionMissile(); st_robot.actionSword();
		System.out.println("StandardRobot의 재고수량 : "+st_robot.qty);
		System.out.println();
		
		
		SuperRobot su_robot=new SuperRobot(5);
		su_robot.shape(); su_robot.actionWalk(); su_robot.actionRun(); su_robot.actionFly(); su_robot.actionMissile(); su_robot.actionSword();
		System.out.println("StandardRobot의 재고수량 : "+su_robot.qty);
		System.out.println();

		// 여기까진 우리가 걍 노가다해서 코딩을 싼것!

		
		// 이제 객체화 시켜서 레고처럼 기능을 껴서~~~ 해보자.
			// 부모 만들어서 상속받아서 해보자. >> v2_inheritance
	}
}