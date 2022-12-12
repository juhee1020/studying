package com.lec.ex05_class;

public class Eve extends Human{
	
	// 휴먼에서 보면 move가 사냥을 하는건데 이브는 사냥 말고 음식 만든다고 하고싶다 > 여기서 재정의(오버라이드?) 해주면 된다~
	@Override // 컨트롤 스페이스 눌러라.
	void move() {
		// TODO Auto-generated method stub
		System.out.println("음식을 만들어요.");
	}
}