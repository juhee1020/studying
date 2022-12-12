package com.lec.ex01_create;
import java.awt.Toolkit;

public class BeepMain1 {
	// 메인도 스레드임.
	
	public static void main(String[] args) throws InterruptedException {
	// 띵 소리를 5번 나게 한다.
		Toolkit toolkit  =Toolkit.getDefaultToolkit(); // 스피커지원
		for(int i=0; i<5;i++) {
			toolkit.beep();
			//System.out.println("띵"); // 띵 출력
			Thread.sleep(500); // 0.5초 - 예외처리 해줘야함
		}


	// 띵 출력을 5번
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			Thread.sleep(500);
		}
	}
}