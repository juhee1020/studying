package com.lec.prac;
public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=100000; i++) {}
		System.out.println(getName());
	}
}