package com.lec.ex05_user;
public class AccountMain {
	public static void main(String[] args) /*throws 잔액부족*/ {
		Account account=new Account();
		System.out.println("현재 잔액 : "+account.getBalance());
		// ▲ 현재 잔액 : 0

		account.예금(1000);
		System.out.println("현재 잔액 : "+account.getBalance());
		// ▲ 현재 잔액 : 1000000
		
		//account.출금1(2000); // 돈 없다고 뜬다! (예외처리가 된 모습!)
		try {
			account.출금1(2000);
			}catch(잔액부족 e) {
				System.out.println(e.getMessage());
				}
		System.out.println("현재 잔액 : "+account.getBalance());
	}
}