package com.lec.ex01_create;
import java.awt.Toolkit;

/*
	Thread객체를 만드는 방법
		1. 외부에 클래스 생성
		2. 익명객체(인터페이스)
		3. 람다식
*/
public class BeepMain2 {
	public static void main(String[] args) {
	// 1. 외부에 클래스 생성 (BeapTask1.java, Runnable구현객체)
		// BeepTask1 생성
		//Runnable beepTask=new BeepTask1();
		//Thread thread1=new Thread(beepTask);
		//thread1.start();
	// 2. 익명객체
		/*Thread thread2=new Thread(new Runnable() {
			@Override
			public void run() {	
				// 띵소리 5번
				Toolkit toolkit  =Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread2.start();*/
		
		
	// 3. 람다식 : @FunctionalInterface만 람다식 쓸 수 있다.
		Thread thread3=new Thread(()->{
				Toolkit toolkit  =Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
					try {
					Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
		}); // () <-여기의 변수값을 {}에 넣는것 (?)
		thread3.start();
		
		// 띵 출력을 5번
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
	}
}