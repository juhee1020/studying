package com.lec.ex01_noarg;
/*
	람다식 기본문법

		a. ()->{} // 매개변수 없을때
		b. (int a)->{} 또는 (a)->{} 또는 a->{} // 매개변수가 한개만 잇을때
		c. (a,b,c)->{} // 매개변수 여러개
		d. ()->실행문 // 실행문이 한개만 있을 땐 {} 생략가능
		e. ()->return "리턴값" // 리턴값이 있을경우
		f. ()->리턴값 // {}안에 리턴값밖에 없을 경우


	함수적인터페이스(functional interface)
	
		모든 인터페이스를 람다식의 타깃타입으로 사용할 수 없다.
		람다식이 하나의 메서드만 정의(존재)하기 때문에 
		두개 이상의 추상메서드가 선언된 인터페이스는 람다식으로 사용할 수 없다.
		
		하나의 추상메서드가 선언된 인터페이스만이 람다식의 타깃타입이 될 수 있는데
		이러한 인터페이스를 "함수적 인터페이스 Functional Interface"라고 한다.

		함수적 인터페이스를 작성할 때 두개 이상의 추상메서드가 선언되지 않도록
		컴파일러가 체킹해주는 기능이 있는데 인터페이스 선언 시
		@FunctionalInterface 어노테이션을 붙이면 된다.
		이 어노테이션은 두개 이상의 추상메서드가 선언되면 컴파일 오류를 발생시킨다.
*/
public class FunctionalInterfaceMain {
	public static void main(String[] args) {

		XXX x=new XXX(); // 이름이 있는 객체

		Runnable thread=new Runnable() { // 익명구현객체
			@Override
			public void run() {
			}
		};

		FuncInterface fi1=new FuncInterface() {
			@Override
			public void method() {
				System.out.println("Functional Interface 추상메서드를 구현! (익명구현객체)");
			}
		};
		fi1.method();


		// 람다식
		FuncInterface fi2=()->{System.out.println("Functional Interface 추상메서드를 구현! (익명구현객체)");};
		fi2.method();

		FuncInterface fi3=()->System.out.println("Functional Interface 추상메서드를 구현! (익명구현객체)");
		fi3.method();
	}
}

@FunctionalInterface
interface FuncInterface{
	// Invalid '@FunctionalInterface' annotation; funcInterface is not a functional interface
	void method(); // 아래 주석 없애면 윗줄의 에러가 뜬다.
	//void method2();
	//void method3();
	//void method4();
}

class XXX implements FuncInterface{
	@Override
	public void method() {		
	}
}