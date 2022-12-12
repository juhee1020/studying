package com.lec.ex01_interface;

public interface Animal {
	//public static final String KIND="동물";
	String KIND="동물"; // public static final 생략해도 컴파일 과정에서 자동으로 추가됨
	
	public abstract void sound(); // 실행블록이 있으면 에러!
	void move(); // public abstract 생략해도 자동으로 컴파일 과정에서 추가.
	
	// inderface의 메서드는 모두 추상메서드이기 때문에 실행블럭을 가질수 없다.
	// void breath() {System.out.println("들숨날숨");}
}
