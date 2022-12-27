package com.lec.basic.poly4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("applicationContext4.xml");
		
		TV tv=(TV)factory.getBean("tv"); // bean id가 tv인 녀석!

		tv.powerOn();
		tv.powerOff();
		tv.volumnUp();
		tv.volumnDown();
		
		factory.close();
	}
}