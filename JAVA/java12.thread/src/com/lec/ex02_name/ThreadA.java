package com.lec.ex02_name;
public class ThreadA extends Thread{
	public ThreadA() {
		setName("스레기A"); // 스레드 이름 정의?
	}
	
	@Override
	public void run() {
		for(int i=0;i<10; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
		super.run();
	}
}