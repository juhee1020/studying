package com.lec.ex17_access.constructor.pkg1;

public class A {
	public A(boolean x){}
	protected A(double x) {}
	A(int x){}
	private A(String x) {}
	
	
	A a1=new A(false);
	A a2=new A(1.0);
	A a3=new A(20);
	A a4=new A("A");
}
