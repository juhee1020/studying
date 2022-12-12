package com.lec.ex02_class;
/*
	클래스
	
	1. 클래스의 선언규칙
		1) 하나이상의 문자로 이루어져야한다. 단, 첫글자는 대문자로 시작해야 하고(관례) 한글이름도 가능하다.
		2) 첫번째는 숫자가 올수 없다.
		3) $와 _ 이외의 특수문자는 사용할수없다.
		4) 자바예약어는 사용할 수 없다.
		
	2. 클래스를 선언하는 키워드 class는 반드시 소문자로 작성해야한다.(예약어)
	
	3. 일반적으로 소스파일 하나당 한개의 클래스를 선언하지만 2개 이상의 클래스도 선언할수있다.
		다만 클래스하나당 ~.class파일이 각각 생성된다.
		주의할 점은 소스파일명과 동일한 클래스만 public(접근제한자)을 선언할 수 있다.
*/
public class Human { // 소스파일명과 동일한 얘만 public을 선언할 수 있다.
	// 1. 속성 
	// public String name; // <- 누구나 접근 가능
	// private String name; // <- 휴먼메인 가보면 adam.name="아담"; 에 name에 에러 뜬다.
	String name;
	String nation="대한민국";
	String gender;
	int age;

	// 2. 생성자 - 생성자 오버로딩, 다형성
	public Human() {}
	public Human(String name, String gender) {
		this.name=name; this.gender=gender;
	}
	
	public Human(String name, String gender, int age) {
		this.name=name; this.gender=gender; this.age=age;
	}
	// 3. 메서드
	// @Override 상속받은 메서드를 재정의한다는 의미
	// @을 annotation이라고 하고 컴파일과는 상관없는 메타정보
	@Override
	public String toString() {
		return this.name + ", "+ this.gender+", "+this.age;
		//return super.toString();
	}
}


class Car{} // 앞에 public 주면 에러! 퍼블릭 주고 싶으면 새파일 만들어라.
class Phone{}