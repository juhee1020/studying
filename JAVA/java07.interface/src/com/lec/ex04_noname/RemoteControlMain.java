package com.lec.ex04_noname;

import com.lec.ex02_implements.RemoteControl;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		// 1. 인터페이스는 객체를 생성할 수 없다.
		// RemoteControl tv = new RemoteControl(); // Cannot instantiate the type RemoteControl
		
		// 2. 익명구현객체
		RemoteControl tv = new RemoteControl() {

			public void setVolume(int num) {System.out.println("볼륨 = " + num); }
			public void powerOn() { System.out.println("파워온!!");}
			public void powerOff() { System.out.println("파워오프"); }
		};
		tv.powerOn();
		tv.setVolume(5);
		tv.powerOff();
		RemoteControl.changeBattery();
		System.out.println();
		
		RemoteControl radio=new RemoteControl() {
			public void setVolume(int num) {/*실행블럭*/search();}
			public void powerOn() {/*실행블럭*/}
			public void powerOff() {/*실행블럭*/}
			void search() {/*내부블럭에서만 사용가능한 메서드, 즉 외부호출불가.*/}
			// 강사님꺼엔 이 클래스파일에 적혀잇는게 아닌것같은데 어찌된 일인가.. ;ㅅ; 홀리몰리
		};
		// radio.search(); // 외부에서 호출불가
	}
}