package com.lec.ex11_default_extends;

public interface ChidInterface2 extends ParentInterface{

	void method3();

	@Override
	default void method2() {/*실행블록*/}
}