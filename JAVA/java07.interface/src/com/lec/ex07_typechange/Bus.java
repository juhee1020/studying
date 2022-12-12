package com.lec.ex07_typechange;
public class Bus implements Vechicle{
	@Override
	public void run() {
		System.out.println("버스운행");
		}
	void checkFare() {
		System.out.println("요금확인");
	}
}