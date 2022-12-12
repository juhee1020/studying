package com.lec.ex07_polymorphism.pkg2;

public class DriverMain {
	public static void main(String[] args) {
		Driver chacha=new Driver();
		chacha.drive(new 탈것 ());
		chacha.drive(new Vechicle());
		chacha.drive(new Bus());
		chacha.drive(new Taxi());
		chacha.drive(new 비행기());
	}
}

class 자전거 extends 탈것{
	void run() {
	System.out.println("자전거를 운전합니다");
}}
class 오토바이 extends 탈것{
	void run() {
		System.out.println("오토바이를 운전합니다");
	}
}
class 비행기 extends 탈것{
	void run() {
		System.out.println("비행기를 운전합니다");
	}
}
class 요트 extends 탈것{
	void run() {
		System.out.println("요트를 운전합니다");
	}
}