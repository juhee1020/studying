package com.lec.exercise.answer;
public class MemberService{
	public boolean login(String id, String password) {
		if(password=="12345") {
			return true;
		}
		else return false;
	}
	public void logout(String id) {
		System.out.println("๋ก๊ทธ์์");
	}
}