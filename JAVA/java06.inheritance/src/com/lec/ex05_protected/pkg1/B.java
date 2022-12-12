package com.lec.ex05_protected.pkg1;

public class B {
	public B() {} // 기본생성자
	B(int x){} // 디폴트 생성자
	
	void method_b() {// default 메서드
		A a=new A(); // 프로텍티드 < 접근가능
		a.field1="접근가능~";
		// a. <<-보면 field2는 안뜬다. < 접근불가 (프라이빗이라서)
		//프라이빗 빼면 같은 패키지면 접근 가능~
	}
}
