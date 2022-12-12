package com.lec.ex08_class;

public class HumanMain {

	public static void main(String[] args) {
		
		// 인터페이스
		/* ▼ 익명객체? - 얘는 나중에 한다
		Human xxx = new Human() {
			@Override
			public void speak(String lang) {		}
			@Override
			public void move() {}
			@Override
			public void think() {}
		};*/
		Korean kor=new Korean();
		kor.speak("한국어");
		// kor.nation="대한민국"; // 상수기 때문에 수정(?)불가. -> 에러
		kor.move(); kor.think();
		System.out.println();
		
		American usa=new American();
		usa.speak("영어");
		usa.move(); usa.think();
	}

}
