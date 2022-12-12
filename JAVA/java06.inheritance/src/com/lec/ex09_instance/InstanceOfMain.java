package com.lec.ex09_instance;
/*
	객체타입확인 (instanceOF)
	
	강제타입변환은 자식객체에서 부모객체로 타입변환이 되어 있는 상태에서만 가능하기 때문에
	부모타입의 변수가 부모객체를 참조할 경우 자식타입으로 변환할 수가 없다.
	어떤 객체가 어느 클래스의 인스턴스(객체)인지 확인하려면 instanceOf연산자를 사용할수 있다.
	예를들어 
	
	Parent pp=new Parent(); Child ch=(Child) pp; <- 강제형변환불가. 즉, ClassCastException 예외가 발생
	
	instanceOf 연산자는 좌측항은 객체가 오고 우측항은 참조타입이 오는데 좌측항의 객체가 우측항의 인스턴스(객체)가 아니면 false, 우측항의 타입으로 생성된 인스턴스(객체)라면 true를 리턴한다.
	
	instanceOf연산자는 매개값의 타입을 조사할 때 주로 사용한다. 메서드내에서 강제타입변환이 필요할 경우 반드시 매개값이 어떤 객체타입인지 instanceOf연산자로 확인하고 안전하게 강제타입변환을 해야한다.
	
	만약, 타입을 확인하지않고 강제 타입변환을 시도할 경우, 강제타입변환이 되지 않을 경우에는 instanceOf예외(실행예외, 루틴 익셉션)가 발생한다.
*/
public class InstanceOfMain {

	public static void main(String[] args) {
		// 강제형변환불가 : ClassCastException
		// Parent pp=new Parent(); Child ch=(Child) pp;
		
		// Parent pp=new Parent(); // 얘는 "강제형변환 실패 - 중요한 로직 실행되지않음"이 뜨고 
		Parent pp=new Child(); // 얘는 "강제형변환 성공 - 중요한 로직 성공적 실행" 뜬다.
		method1(pp); // Parent pp=new Parent(); 있으면 실행에러()
		method2(pp); // class com.lec.ex09_instance.Parent
	}

	static void method1(Parent ppp) {
		System.out.println(ppp.getClass());
		Child child=(Child)ppp;
		System.out.println("강제변환성공? 실패? - 중요한 로직!");
		
	}

	static void method2(Parent pp) {
		System.out.println(pp.getClass());
		if(pp instanceof Child) {Child child=(Child)pp; System.out.println("강제형변환 성공 - 중요한 로직 성공적 실행");}
		else {System.out.println("강제형변환 실패 - 중요한 로직 실행되지않음");}
	}
}