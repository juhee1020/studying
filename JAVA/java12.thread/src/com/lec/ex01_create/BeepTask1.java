package com.lec.ex01_create;
import java.awt.Toolkit;

public class BeepTask1 implements Runnable{
	@Override
	public void run() {	
		// 띵소리 5번
		Toolkit toolkit  =Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			toolkit.beep();
			try {
			//System.out.println("띵"); // 띵 출력
			Thread.sleep(500); // 0.5초 - 예외처리 해줘야함
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
