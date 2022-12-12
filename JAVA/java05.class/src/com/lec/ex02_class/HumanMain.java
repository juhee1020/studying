package com.lec.ex02_class;

public class HumanMain {

	public static void main(String[] args) {
		Human adam=new Human();
		adam.name="아담";

		Car myCar=new Car();
		Phone myPhone=new Phone();
		Laptop myLaptop=new Laptop();
		
		Human sonny=new Human("손흥민","남자",30);
		System.out.println(sonny.name+", "+sonny.gender+", "+sonny.age);
		System.out.println(sonny.toString()); // 16진수 - 객체가 저장되있는 주소
		System.out.println(sonny.hashCode()); // 10진수 - 객체가 저장되있는 주소
	}

}
