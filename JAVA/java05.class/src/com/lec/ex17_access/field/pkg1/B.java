package com.lec.ex17_access.field.pkg1;

public class B {
	public B() {
		A a=new A();
		
		//필드
		a.field1=50; // 퍼블릭
		a.field2=30; // 디폴트
		// a. 해보면 field3는 안나온다. < 접근안됨.(프라이빗)
		
		//메서드
		a.method1();
		a.method2();
		// a. 해보면 역시 method3()는 안뜬다. < 접근안됨.(프라이빗)
	}
}
