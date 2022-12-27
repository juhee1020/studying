package com.lec.basic.scan;

import org.springframework.stereotype.Component;

@Component("tv")
public class LGtv implements TV{

	public LGtv() {System.out.println("==>@Component - lgtv 객체 생성");}
	
	@Override
	public void powerOn() {}

	@Override
	public void powerOff() {}

	@Override
	public void volumnUp() {}

	@Override
	public void volumnDown() {}

	
}