package com.lec.ex05_user;

public class Account {
	private int 잔액; // 잔액

	public int getBalance() {
		return 잔액;
	}
	//public void setBalance(int balance) {this.balance = balance;}
	void 예금(int money) {
		this.잔액=money;
	}
	void 출금(int money) {
		//this.잔액=잔액-money;
		if(잔액<money) {System.out.println("돈 없어 임마!");}
		else {this.잔액-=money;}
	}
	void 출금1(int money) throws 잔액부족 {
		if(잔액<money) {throw new 잔액부족("잔액부족 : "+(money-this.잔액)+"이 부족해.");}
		else {this.잔액-=money;}
	}
}
