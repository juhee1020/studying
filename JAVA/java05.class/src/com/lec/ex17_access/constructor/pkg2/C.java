package com.lec.ex17_access.constructor.pkg2;
import com.lec.ex17_access.constructor.pkg1.*;

public class C {
	A a1=new A(false); // 퍼블릭이라 접근 가능
	//A a2=new A(1.0); // 다른 패키지라서 접근 불가능 (protected)
	//A a3=new A(20); // 다른 패키지라서 접근 불가능 (default)
	//A a4=new A("A"); // 당근 안됨

	// 가장 많이 쓰는건 필드? > 필드 생성.
}
