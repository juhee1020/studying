package com.lec.ex05_user;

public class 잔액부족 extends Exception{
	public 잔액부족() {} // 기본생성자
	public 잔액부족(String message) {
		super(message);
	}
}