package com.lec.basic.poly1;

public class TVUser1 {

	public static void main(String[] args) {
		
		// c:/java.exe TVUser1 samsung
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		
		tv.powerOn();
		tv.powerOff();
		tv.volumnUp();
		tv.volumnDown();
	}

}
