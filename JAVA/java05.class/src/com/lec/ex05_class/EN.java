package com.lec.ex05_class;

public class EN extends Human{
	String nation="USA";
	String lang;
@Override
void speak(String lang) {
	this.lang=lang;
	// TODO Auto-generated method stub
	System.out.println(lang+"Speak English.");
}
}
