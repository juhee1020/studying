package com.lec.ex01_class;
public class A {

	// 생성자
	public A() {System.out.println("A객체 생성!");}


	// 1. 객체멤버인 중첩클래스
		// A가 생성되어야만 사용할 수 있다.
	public class B{
		/*1. 필드*/ int b_field;
		// static String name; // B는 객체가 생성이 되야 하는 객체맴버이기 때문에 static 선언불가
		// 2. 생성자
		public B(){System.out.println("B객체생성");}
		// 3. 메서드
		void b_method1() {System.out.println("메서드");};
		//static void b_method2(){} // 선언불가.
	}


	// 2. 정적멤버인 중첩클래스
		// 정적(static)멤버이기 때문에 A가 생성되지않아도 사용할 수 있다.
	public static class C{
		/*필드*/int c_field1;
		static int c_field2;
		public C() {System.out.println("c객체생성");}
		void c_method1() {System.out.println("c_method2() 호출");};
		static void c_method2() {System.out.println("c_method3() 호출");};
	}



	// 3. 로컬멤버인 중첩클래스
		// a_method 안에서만 사용할 수 있다. (메서드가 호출되야지만 사용할수있다.)
	void a_method() {
		class D{int d_field; /*static int d_field2; //안됨*/
			public D() {System.out.println("D객체 생성");}
			void d_method() {System.out.println("d_method() 호출");}
			//static void d_method2() {} // 안됨
		}
		class E{}
		class F{
			class G{}
		}
		// D d=new D(); // 이런식으로 내부에서 사용 가능?
	}
	void b_method() {
		class D{} // a_method가 호출되야지만 사용가능
		class E{}
		class F{
			class G{}
		}
	}
}