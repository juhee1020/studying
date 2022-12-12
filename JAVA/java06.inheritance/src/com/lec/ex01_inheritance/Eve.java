package com.lec.ex01_inheritance;

public class Eve extends Human{
	
	String bag="비브라늄";
	String cloth="루타비스 상하의";

	@Override
	public String toString() {
		return "내 이름은 "+this.name+"(이)야. 그리고 내 가방은 "+this.bag+"(으)로 되어있고, 나는 "+this.cloth+"(을)를 입어.";
	}
	
	@Override
	public void move() {
		System.out.println("대구로 떠납니다.");
	}
	
	public void makeBaby() {
		System.out.println("응애");
	}
	
}
