package com.lec.ex01_object.ex05_finalize;
/*
	객체소멸(finalize)
	
	참조하지않는 배열이나 객체는 GC(garbage collector)가 힙역에서 자동으로 소멸시킨다.
	GC는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킨다.
	소멸자는 Object.finalize()메서드를 말하는데 기본적으로 실행할 내용이 없다.
	(즉, 실행블록에는 아무런 내용이 없다.)
	
	만약, 객체가 소멸되기 전에 마지막으로 사용했던 자원(데이터베이스연결, 파일등)을 닫고싶거나
	중요한 데이터를 저장하고 싶다면 Object.finalize()를 재정의할수가 있다.
*/
public class Counter {
	private int no;
	public Counter(int no) { // 이녀석이 생성자라면 
		this.no=no;
	}
	@Override
	protected void finalize() throws Throwable { // 이놈이 소멸자입니다.
		System.out.println(no+"번 객체의 function()가 실행되엇습니다.");
	}
}