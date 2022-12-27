package com.lec.basic.poly4;

public class LGTV implements TV{

	private Speaker speaker;
	private int price;

	public LGTV() {System.out.println("lgtv 객체생성");}

	@Override
	public void powerOn() {System.out.println("lgtv powerOn / price: " +this.price);}

	@Override
	public void powerOff() {System.out.println("lgtv powerOff");}

	@Override
	public void volumnUp() {this.speaker.volumnUp();}

	@Override
	public void volumnDown() {System.out.println("lgtv volumnDown");}



	public void setSpeaker(Speaker speaker) {this.speaker = speaker;}

	public void setPrice(int price) {this.price = price;}

}
