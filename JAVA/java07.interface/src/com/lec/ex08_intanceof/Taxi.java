package com.lec.ex08_intanceof;
public class Taxi implements Vechicle{
	@Override
	public void run() {
		System.out.println("택시를 운전합니다.");
	}
	public void xxx() {
		System.out.println("택시미터기를 조작합니다.");
	}
}
