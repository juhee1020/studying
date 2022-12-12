package com.lec.ex10_default_method;

public class MyClassB implements MyInterFace{
	@Override
	public void method() {System.out.println("MyClassB.method()");}
	
	// void methid3() {System.out.println("2년 뒤 새로운 기능 추가");}
	
	@Override
	public void method3() {System.out.println("3년 후 method3의 기능이 바뀜!");}
}
