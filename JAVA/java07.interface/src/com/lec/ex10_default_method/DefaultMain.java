package com.lec.ex10_default_method;
public class DefaultMain {
	public static void main(String[] args) {
		MyInterFace myA=new MyClassA();
		MyInterFace myB=new MyClassB();
		
		myA.method();
		myB.method();
		
		// 1년 뒤! / 2년 뒤! 
		// myA.method2(); // 에러.
		
		// MyInterFace에 default ~~ 두줄 추가. ▼
		myA.method2();
		myB.method3();
		
		
		// 근데 통상적으로 이렇게 쓴게 오히려 유지보수가 어려울 수 있다.
		// 잘 쓰이지는 않는듯하다.
	}
}