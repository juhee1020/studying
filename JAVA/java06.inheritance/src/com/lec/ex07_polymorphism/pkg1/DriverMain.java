package com.lec.ex07_polymorphism.pkg1;

public class DriverMain {
	public static void main(String[] args) {
		Driver hong=new Driver();
		hong.driver(); // 차량을 운전할 수 있습니다.
		
		Vechicle vechicle=new Vechicle();
		hong.drive(vechicle); // Vechicle 운전
		
		hong.drive(new Taxi()); // 택시운전
		hong.drive(new Bus()); // 버스운전
	}
}