package com.lec.ex08_intanceof;
public class Bus implements Vechicle{
	@Override
	public void run() {
		System.out.println("버스를 운전합니다.");
	}
	public void checkFare() {
		System.out.println("버스요금을 확인합니다.");
	}
}
