package com.lec.ex01_inheritance;

public class SmartPhone extends Phone{
// 처음에 SmartPhone에 에러 / 에드 컨스트럭터 어쩌구 추가해주면 에러 사라진다.
	String url;
	
	// 에드 컨스트럭터 ~~ 추가해준것.
	public SmartPhone(String model, String color, String url) {
		super(model, color); // 생략할수 없다. 부모의 기본생성자가 없기 때문.
		this.url=url;
	} 
}
