package com.lec.ex09_inheritance;
public class ImplementMain {
	public static void main(String[] args) {
		ImplementC cc=new ImplementC();
		cc.methodA(); cc.methodB(); cc.methodC(); // 메소드A,B,C 모두 사용가능
		
		// 1. cc -> InterfaceA로 형변환 됐을 때.
		InterfaceA c0=cc;
		c0.methodA(); // A만 가능.
		
		// 2. cc -> InterfaceB로 형변환 됐을 때.
		InterfaceB c1=cc;
		c1.methodB(); // B만 가능.
		
		// 3. cc -> InterfaceC로 형변환 됐을 때.
		InterfaceC c2=cc;
		c2.methodA(); c2.methodB(); c2.methodC(); // 모두 가능.
		// C는 인터페이스C가 인터페이스A,B를 상속받았으므로 가능!
	}
}