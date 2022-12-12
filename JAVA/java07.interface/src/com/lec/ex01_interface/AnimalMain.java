package com.lec.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		animalSound(new Dog());animalSound(new Cat());animalSound(new Bird());
	}
	public static void animalSound(Animal a) {
		a.sound();
	}
}
