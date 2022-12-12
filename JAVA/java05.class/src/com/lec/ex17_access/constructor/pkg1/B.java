package com.lec.ex17_access.constructor.pkg1;

public class B {
	A a1=new A(false); // 퍼블릭이라 접근 가능
	A a2=new A(1.0); // 같은 패키지 내라서 접근 가능 (protected)
	A a3=new A(20); // 같은 패키지 내라서 접근 가능 (default)
	// A a4=new A("A"); // 프라이빗은 같은 파일(?) 안에서만 접근 가능
}
