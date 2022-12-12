package com.lec.ex10_abstract.method;

public class AnimalMain {
	public static void main(String[] args) {
		//Animal animal=new Animal(); // Cannot instantiate the type Animal
		
		// ▼ 실체 객체들
		Dog 개=new Dog();
		Cat 냥=new Cat();
		Bird 새=new Bird();
		
		개.breath(); 냥.breath(); 새.breath();
		System.out.println();
		
		개.sound(); 냥.sound(); 새.sound(); // 소리는 다르게 내고싶다! > 사운드를 오버라이드 시켜라~
		System.out.println();
		
		개.move(); 냥.move(); 새.move();
		System.out.println();
		
		// 다형성 ▼
		animalSound(개); animalSound(냥); animalSound(새);
		animalSound(new 호랑이());
		
		
	}
	/*
	public static void animalSound(Dog dog) {dog.sound();}
	public static void animalSound(Cat cat) {cat.sound();}
	public static void animalSound(Bird bird) {bird.sound();}
	*/
	public static void animalSound(Animal animal) {animal.sound();}
}

class 사자 extends Animal{

	@Override
	void sound() {System.out.println("크와앙");}

	@Override
	void move() {System.out.println("사자는 느긋");}
	
}
class 호랑이 extends Animal{

	@Override
	void sound() {System.out.println("으르렁");}

	@Override
	void move() {System.out.println("배고픈호랑이가움직인다.");}
	
}