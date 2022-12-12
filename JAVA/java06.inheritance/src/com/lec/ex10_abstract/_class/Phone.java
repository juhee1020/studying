package com.lec.ex10_abstract._class;

public class Phone {
	public String owner;
	public Phone(String owner) {
		this.owner=owner;
	}
	public void powerOn() {System.out.println("powerOn");}
	public void powerOff() {System.out.println("powerOff");}
}
