package com.lec.ex02_trycatch;
public class TryCatchMain1 {
	public static void main(String[] args) {

		// 1. 일반예외 - 처리안해주면 컴파일 자체가 안됨.
		try {
			Class _class=Class.forName("java.lang.Stringxxx");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다.");
			//e.printStackTrace();
			/*
			java.lang.ClassNotFoundException: java.lang.Stringxxx
				at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
				at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
				at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
				at java.base/java.lang.Class.forName0(Native Method)
				at java.base/java.lang.Class.forName(Class.java:375)
				at com.lec.ex02_trycatch.TryCatchMain1.main(TryCatchMain1.java:7)
			*/
			System.out.println(e.getMessage());
		} 
		
		//String xxx=new String(); // 위가 이것과 비슷한 느낌?
		// 빨간줄에 마우스 > Unhandled exception type ClassNotFoundException > Surround try/catch or Add throws declaration
		
		/*  Add throws declaration 선택 
		> 퍼블릭 스태틱 보이드 메인 (Strinbg[] args) 뒤에 throws ClassNotFoundException */
		// --> 이건 사용자는 어떤 문제가 발생했는지 알 수 없다.
		
		
	}
}