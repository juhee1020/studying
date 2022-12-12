package com.lec.ex05_protected.pkg2;
import com.lec.ex05_protected.pkg1.A;


public class D extends A{
	public D() {
		// A a=new A(); // protected - 접근안됨. (직접접근은 불가능하다!)
		super(); // 상속관계일 경우 부모생성자 접근가능
		field1="루타비스";
		//this.field2="오디움"; // 프라이빗이라 안됨
		method_a(); // 상속관계일 경우 부모메서드 접근 가능
	}
}
