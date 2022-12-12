package com.lec.ex11_default_extends;

public interface ParentInterface {
	// 추상메서드
	void method1();
	
	// 디폴트메서드
	default void method2() {};
}