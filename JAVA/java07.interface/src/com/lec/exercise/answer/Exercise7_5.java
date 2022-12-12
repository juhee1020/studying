package com.lec.exercise.answer;
class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}
class Tv extends Product{
	Tv(int a) {
		super(a);
		bonusPoint=(int)(a/5.0);
	}

	public String toString() {return "TV";}
}


class Exercise7_5 {
	public static void main(String[] args) {
		Tv t=new Tv(100);
		System.out.println(t.bonusPoint);
	}
}