package com.lec.ex05_field;

public class Car {
	Tire frontleft=new BigWidthTire();
	Tire frontright=new BigWidthTire();
	Tire backleft=new BigWidthTire();
	Tire backright=new BigWidthTire();
	
	void run() {
		frontleft.roll();
		frontright.roll();
		backleft.roll();
		backright.roll();
	}
}
