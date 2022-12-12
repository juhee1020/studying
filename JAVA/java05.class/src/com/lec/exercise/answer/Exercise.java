package com.lec.exercise.answer;
public class Exercise {
	public static void main(String[] args) {
		Member son=new Member();
		son.age=20;
		
		Member user1=new Member("컴포즈","메가커피");
		Member user2=new Member("123123","123123123");
		System.out.println(user1.id);
		
		MemberService hong=new MemberService();
		System.out.println(hong.login("123123", "1111"));
	}
}