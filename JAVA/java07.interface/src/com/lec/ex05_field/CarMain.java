package com.lec.ex05_field;
public class CarMain {
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.run();


		//자동형변환
		myCar.frontleft=new SnowTire(); // 고속도로 달리다가 빙판길 만났다!
		myCar.frontright=new SnowTire();
		myCar.backleft=new SnowTire();
		myCar.backright=new SnowTire();
		myCar.run();

		myCar.frontleft=new BigWidthTire(); // 빙판길이 끝났다!
		myCar.frontright=new BigWidthTire();
		myCar.backleft=new BigWidthTire();
		myCar.backright=new BigWidthTire();
		myCar.run();
	}
}