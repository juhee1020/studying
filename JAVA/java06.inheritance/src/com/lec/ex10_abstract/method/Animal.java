package com.lec.ex10_abstract.method;

public abstract class Animal {
	public String kind;
	void breath() {System.out.println("숨쉰다.");} // 모든 동물 다 숨 쉰다.
	//void sound() {System.out.println("소리낸다.");} // 동물 모두 소리 낸다. - 각각 실체에서 다르게 실행?되므로 안에 뭐 적어줄 필요가 없다.
	abstract void sound(); // 실행블록이 없음 - abstract 붙여줘라
	abstract void move();
}
