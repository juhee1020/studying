package com.lec.ex03_class;

public class HumanMain {

	public static void main(String[] args) {
		Human 미국인 = new Human("Steve");
		Human 한국인 = new Human("홍길동");
		
		System.out.println(미국인.name);
		System.out.println(한국인.name);
		
		미국인.speak();
		한국인.speak();
		// 위에 두줄이 말합니다. 라고 동일하게 출력되는데 국적따라 어떤 언어로 말하나~ 추가하고 싶다. <- Human.java 16~18줄 추가 후에 ▼
		미국인.speak("영어");
		한국인.speak("한국어");
		
		System.out.println(한국인.speak(100, "불어"));
		
		String result=한국인.speak(9999, "독일어");
		System.out.println(result);
	}
}