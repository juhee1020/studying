package com.lec.ex06_promotion.typechange;
public class PromotionMain {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
	//자동형변환
		// 1. 직접상속관계가 있다면 변환가능 (부모-자식, 할부지-손자...)
		// a=b; a=c; a=d; a=e; b=d; c=e; // 자동형변환된다 - 다 같아지니깐 주석처리(?)
		
		// 2. 직접상속관계가 없다면 변환불가
		// b=e; c=d; // 에러
		
		// 3. 메서드의 매개변수로 전달될 경우
		method_a(3.14); // 실수형
		method_a("메이플스토리"); // 문자열
		method_a(a); // A클래스
		method_a(b); // B클래스
		method_a(c); // A클래스 - C가 A상속받앗으니깐~ 
	}
	static void method_a(double x) {System.out.println("실수형");}
	static void method_a(String x) {System.out.println("문자열");}
	//static void method_a(A a) {System.out.println("A클래스");} // String이나 A나 참조타입~
	//static void method_a(B b) {System.out.println("B클래스");}
	//static void method_a(C c) {System.out.println("C클래스");} // 얘가 잇으면 method_a(c);에 C클래스 출력된다.
	// 이거는 JVM이 자동으로 인식해주는 모양.
	static void method_a(A a) {System.out.println(a.getClass());}
}