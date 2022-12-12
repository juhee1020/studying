package com.lec.ex17_access.field.pkg2;
import com.lec.ex17_access.field.pkg1.*;

public class C {
	public C() {
		A a=new A();
		// 필드
		a.field1=10;
		// 디폴트, 프라이빗은 접근 x

		// 메서드
		a.method1();
		// 디폴트, 프라이빗은 접근 x
	}
}
