package com.lec.ex02_variables;

public class VariableMain3 {

	public static void main(String[] args) {
		/* 참조타입(Reference Type) - String, Class, Enum
				String(문자열)은 참조타입, 정확히 이야기하면 String클래스타입
				Java에서는 class로 선언된 모든 것은 참조타입입니다.
				Java에서 문자열을 표현할 때는 큰따옴표로 선언해야한다.
				작은 따옴표는 char타입
		*/
		char c1='a';
		// char c2="a"; // char은 한개의 문자만 저장가능. "a"는 문자열(String)이라는 참조타입
		String s1="A"; // s 소문자는 안되는듯.
		String s2="AA";
		// 참조타입이란 객체가 저장되어 있는 주소를 참조한다고 해서 참조타입 변수라고 한다.
		System.out.println(s1.hashCode()); // 65
		System.out.println(s2.hashCode()); // 2080
		
		/* literal과 constant 비교
			자바에서는 상수변수의 이름은 관례로 모두 대문자로 선언, 단어마다 언더바(_)로 연결해서 선언한다.
			상수는 final로 선언된 변수를 의미한다. constant값이 한번 설정이 되면 수정할 수 없다.
		*/
		int val=10;
		val=20;
		final int val1=10; // 상수. 변수명 선언이 관례 어긋난다.
		// val1=20;
		final int MIN_VALUE=10; // 관례상 모두 대문자로~
		final int MAX_VALUE; // 초기화가 안됏기 때문에
		MAX_VALUE=20; // 요건 가능. 근데 이 이후로는 수정 불가.
		//MAX_VALUE=2000; // 에러
		
		
		// ※ 참고 ▼
		int abc=10;
		String abcd="abcd";
		// abc. << 하면 암것두 안뜨고 / abcd. << 하면 메소드(+속성,생성자) 좌라락 뜬다. (기본타입과 참조타입 구별법?)
	}
}
