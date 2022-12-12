package com.robot.v2_inheritance;
public class RobotMain {
	public static void main(String[] args) {
		System.out.println("======Robot V2.0 (상속)=====\n");
		CheapRobot c_ro=new CheapRobot("Cheap",5);
		Standard st_ro=new Standard("Standard",10);
		SuperRobot su_ro=new SuperRobot("Super",5);
		
		c_ro.shape(); /*부모(Robot에게서 온다.)*/ c_ro.actionSword(); /*부모(Robot에게서 온다.)*/
		System.out.println();
		st_ro.actionMissile(); 
		System.out.println();
		su_ro.actionFly();
		
		
		// 이제 버전 3로 추상 개념 넣어보자~
	}
}