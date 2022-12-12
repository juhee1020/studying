package com.lec.ex02_name;
public class ThreadMain {
	public static void main(String[] args) {
		
		Thread mainThread=Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+mainThread.getName()); // main

		Thread aa=new ThreadA();
		System.out.println("현재 작업 중 스레드 이름 : "+aa.getName());
		aa.start();

		Thread bb=new ThreadB();
		System.out.println("현재 작업 중 스레드 이름 : "+bb.getName());
		bb.start();

		Thread cc=new ThreadB();
		System.out.println("현재 작업 중 스레드 이름 : "+cc.getName());
		cc.start();
	}
}