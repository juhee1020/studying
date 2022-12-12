package com.lec.ex01_runtime;

public class ClassCastMain {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		changeDog(dog); // 얜 된다.
		changeDog(cat);
		/* 아래에 cat 받았을 때
		Exception in thread "main" java.lang.ClassCastException: class com.lec.ex01_runtime.Cat cannot be cast to class com.lec.ex01_runtime.Dog (com.lec.ex01_runtime.Cat and com.lec.ex01_runtime.Dog are in unnamed module of loader 'app')
		at com.lec.ex01_runtime.ClassCastMain.changeDog(ClassCastMain.java:14)
		at com.lec.ex01_runtime.ClassCastMain.main(ClassCastMain.java:10)
		*/
	}

	private static void changeDog(Animal animal) {
		Dog dog=(Dog)animal;
		System.out.println(dog);
	}
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}