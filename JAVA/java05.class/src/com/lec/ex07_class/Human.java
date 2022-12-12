package com.lec.ex07_class;

public abstract class Human {
		String nation;
		String name;
		String gender;
		int age;
	
		// void speak() {} // 어차피 Korean, American에서 재정의하므로 걍 비워둬도 된다! 
		abstract void speak(); // abstract 써주면 {} 안써도 된다. > 위에 퍼블릭 뒤 클래스 앞에도 abstract 써준다.
		// 앱스트랙 - 추상메서드?
		// 이친구는 자식클래스가 재정의를 해줘야한다. 안해주면 에러뜨는듯.
		abstract void move();
		void think() {System.out.println("생각한다.");}
}