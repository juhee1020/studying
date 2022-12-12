package com.lec.ex04_class;

public class HumanMain {

	public static void main(String[] args) {

		// 메서드오버라이딩(2)
		Adam adam=new Adam();
		Eve eve=new Eve();
		
		System.out.println("Adam의 이름 : "+adam.name+" / Adam의 나이 : "+adam.age+" / Adam의 성별 : "+adam.gender);
		adam.speak();
		String msg=adam.move();
		System.out.println(msg);
		System.out.println(adam.toString());
		System.out.println("----------");
		
		eve.speak();
		String msg1=eve.move();
		System.out.println(msg1);
		System.out.println(eve.toString());
	}
}