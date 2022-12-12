package com.lec.ex03_multi;
import com.lec.ex02_implements.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	@Override
	public void search(String url) {System.out.println(url+"을 검색.");}

	@Override
	public void powerOn() {System.out.println("smart tv 파워온");}

	@Override
	public void powerOff() {System.out.println("smart tv 파워오프");}

	@Override
	public void setVolume(int volume) {
		if(volume>=RemoteControl.MAX_VOLUME) {
			volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			volume=RemoteControl.MIN_VOLUME;
		}
		this.volume=volume;
		System.out.println("현재 smartTv볼륨 : "+volume);
	}

}
