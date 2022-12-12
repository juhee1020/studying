package com.lec.ex04_while;

import java.io.IOException;

public class WhileKeyControlMain {
	public static void main(String[] args) throws IOException {
		//System.in.read() 메서드는 키보드 입력을 대기하고 있다가 엔터키 친 후에는 ASCII값을 정수로 리턴한다.
		// ReturnKey=13, EnterKey=10, A=65, a=97, 0=48... 값을 리턴
		
		// 리모콘제어프로그램 만들기
		boolean run=true;
		int keyCode=0;
		int volume=0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------");
				System.out.println("1. 볼륨업 / 2. 볼륨다운 / 3. 음소거");
				System.out.println("-----------------------");
				System.out.println("1~3번까지 입력하시오. ==>");
			}
			keyCode=System.in.read();
			
			if(keyCode==49) {volume++;System.out.println("현재볼륨은 "+volume);}
			else if(keyCode==50) {volume--;System.out.println("현재볼륨은 "+volume);}
			else if (keyCode==51) run=false; // 조건 끝날 경우 빠저나온다
		}
		System.out.println("프로그램 종료");		
	}
}
