package com.lec.exercise.answer;
public class Account {
	private int balance;
	final int MAX=1000000;
	final int MIN=0;

	public int getBalance() {
		return balance;
	}
	public int setBalance(int balance) {
		if(balance>MAX) {this.balance=MAX; return this.balance;}
		else if(balance<MIN) {this.balance=MIN; return this.balance;}
		else {this.balance=balance; return this.balance;}
	}
	
	
}