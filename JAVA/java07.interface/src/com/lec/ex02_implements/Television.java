package com.lec.ex02_implements;

public class Television implements RemoteControl{
	
	private int volume;

	@Override
	public void powerOn() {System.out.println("tv poweron");}

	@Override
	public void powerOff() {System.out.println("tv poweroff");}

	@Override
	public void setVolume(int volume) {
		if(volume>=RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		// this.volume=volume;
		System.out.println("현재 Tv볼륨 : "+this.volume);
	}
}
