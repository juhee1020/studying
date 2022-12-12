package com.lec.ex02_implements;

public interface RemoteControl {
	int MIN_VOLUME=0;
	int MAX_VOLUME=20;
	
	void powerOn();
	void powerOff();
	void setVolume(int num);
	
	default void setMute(boolean mute) {if(mute) {System.out.println("무음");} else{System.out.println("무음해제");}}
	
	static void changeBattery() {System.out.println("건전지를 교체합니다.");}
}
