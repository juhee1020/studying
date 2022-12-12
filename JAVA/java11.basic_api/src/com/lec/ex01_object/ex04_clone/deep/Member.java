package com.lec.ex01_object.ex04_clone.deep;

import java.util.Arrays;

public class Member implements Cloneable{
	
	public String name; public int age;
	public int[] scores; public Car car; // 참조타입

	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}


	public Member getMenber() {
		Member cloned=null;
		try {
		cloned=(Member)clone();} // super.clone 을 .clone으로 바꿔주고 아래에서 clone을 오버라이드 해준다.
		catch(CloneNotSupportedException e) {e.printStackTrace();}
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 1. 먼저 얕은복제를 해준다. : name, age, scores, car
		Member cloned=(Member)super.clone(); // Object.clone() : 얕은 복제
		
		// 2. 참조타입은 깊은 복제 : scores, car
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
		cloned.car=new Car(this.car.model); // Car에 company,  등등 더 있음 걔네도 다 해줘야함.
		
		// 3. 깊은복제된 객체를 리턴.
		return cloned;
	}
}


