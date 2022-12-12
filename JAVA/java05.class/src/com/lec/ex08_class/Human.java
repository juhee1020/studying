package com.lec.ex08_class;

public interface Human {
	// 클래스는 속성, 생성자, 메서드가 있다. 
	// 근데 인터페이스는 예를들면 설계도면같은거다.-> 인터페이스는 객체를 만들 수 없다.
	// -> 인터페이스는 생성자가 없다.
	// 인터페이스는 실행블록({})이 없다. 즉, 모든 메서드는 추상메서드
	// 인터페이스에서의 속성(필드)는 상수로 정의해야 한다. String nation; // <-요거 에러임!
	
	String nation=""; // 무조건 상수이기 때문에 final 선언 안해도 상수다.
	String name="";
	String gender="";
	int age=0;
	
	// ▼ 메소드 
	void speak(String lang);
	void move();
	void think();
}
