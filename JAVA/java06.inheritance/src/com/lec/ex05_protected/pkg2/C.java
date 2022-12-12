package com.lec.ex05_protected.pkg2;
import com.lec.ex05_protected.pkg1.B;
// import com.lec.ex05_protected.pkg1.A;

public class C {
	void method_c() {
		// A의 생성자의 접근제한자가 프로텍티드이기 때문에 다른 패키지에 있는 클래스가 상속관계가 없을 경우는 접근할 수 없다.
		// A a=new A(); // 임포트 해와도 접근 안됨!
		// field1,2도 안되고 method_a도 접근 안됨!
		
		B b1=new B(); // 퍼블릭이라서 임포트만 해오면 접근 가능!
		// b1.method_b(); // default메서드기 때문에 접근 안됨
		// B b2=new B(10); // default는 접근 안됨
	}
}
