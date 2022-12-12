package com.lec.ex07_class;

public class HumanMain {

	public static void main(String[] args) {
		// 추상화 : 추상클래스
		Korean kor=new Korean();
		kor.nation="한국";
		kor.name="신지"; kor.gender="여자"; kor.age=1014;
		kor.move(); kor.think(); kor.speak();
		System.out.println(kor.toString());
		System.out.println();

		American usa=new American();
		usa.nation="미국";
		usa.name="프랑켈"; usa.gender="남자"; usa.age=1014;
		usa.move(); kor.think(); usa.speak();
		System.out.println(usa.toString());
		System.out.println();

	}

}
