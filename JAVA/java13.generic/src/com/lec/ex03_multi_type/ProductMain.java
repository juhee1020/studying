package com.lec.ex03_multi_type;
public class ProductMain {
	public static void main(String[] args) {
	// 1. non genetic
		Product product=new Product();
		product.setKind(1);
		product.getKind();
		int num=(int)product.getKind();
		
		product.setKind("문자열");
		product.getKind();
		String str=(String)product.getKind();
		
		
	// 2. genetic
		Product <Robot,String> 로봇=new Product();
		로봇.setKind(new Robot());
		로봇.setModel("SuperUltraJJangRobot");
		System.out.println(로봇.getKind()+" ^a^ "+로봇.getModel());

	// 참조타입인 경우는 가능.
		Product<Car, String> 부릉부릉=new Product<Car, String>();
	
	// 멀티제너릭타입일 경우 참조타입이 아닐 경우 에러.
		//Product<int, Student>학생=new Product<>();
		// Product<String, int> yyy = new Product<>();
	}
}
class Product<K,M>{
	private K kind;
	private M model;
	public K getKind() {return kind;}
	public void setKind(K kind) {this.kind = kind;}
	public M getModel() {return model;}
	public void setModel(M model) {this.model = model;}
}
class Car{}
class TV{}
class Student{}
class Robot{}