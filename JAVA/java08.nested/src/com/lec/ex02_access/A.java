package com.lec.ex02_access;

public class A {
// 필드
	int a_field1;
	static int a_field2;

// 생성자
	

// 메서드
	void a_method1() {}
	static void a_method2() {}

// 중첩클래스에서 부모? 외부에 있는 속성들을 접근할 수 잇나?


	// 1. 객체멤버중첩클래스 - 객체멤버or정적멤버 접근가능.
	class B{
		void b_method1() {
			a_field1=10; // 접근가능.
			a_field2=50; // 가능~
			a_method1(); // 접근가능~
			a_method2(); // 접근가능~
		}
	}


	// 2. 정적멤버중첩클래스 - 정적멤버만 접근가능.
	static class C{
		void c_method1() {
			//a_field1=10; // x
			a_field2=50; // 접근가능
			//a_method1(); // x
			a_method2(); // 접근가능
		}
	}


}
