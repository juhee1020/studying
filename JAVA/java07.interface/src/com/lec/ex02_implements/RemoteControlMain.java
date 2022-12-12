package com.lec.ex02_implements;

public class RemoteControlMain {
	public static void main(String[] args) {
		// Audio audio=new Audio();
		// Television tv=new Television();
		
		RemoteControl rc;
		rc=new Television();
		rc.powerOn(); rc.powerOff(); rc.setVolume(200); rc.setMute(false);
		
		
		
		rc=new Audio();
	}
}