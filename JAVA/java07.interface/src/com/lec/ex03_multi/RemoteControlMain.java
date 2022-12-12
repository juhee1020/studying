package com.lec.ex03_multi;
import com.lec.ex02_implements.RemoteControl;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		// 1. 자식객체 -> 부모객체로 형변환 RemoteControl에는 search가 없음
		RemoteControl rc1=new SmartTelevision();
		rc1.powerOn(); rc1.powerOff(); rc1.setMute(true);
		//rc.search();// 자식객체 > 부모객체로 형변환 RemoteControl에는 search가 없음
		System.out.println();
		
		
		// 2. 자식 -> 부모 : Searchable에는 search메서드만 존재, 나머지메서드도 호출불가.
		SmartTelevision stv=new SmartTelevision();
		Searchable rc2=stv;
		// rc2.powerOn(); // rc2에는 search밖에 없음.
		rc2.search("naver.com");
	}
}